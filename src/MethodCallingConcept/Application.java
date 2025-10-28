package MethodCallingConcept;


// Java_17_MethodCalling_StackMemory_StackOverflowError
// program - 4

public class Application {
    //m1(),m2(),m3() - 3 non-static methods
    public void m1() {
        System.out.println("m1 method");
        m2();
        //m1() is calling m2(), m2() is calling m3() and m3() is calling m1() - This is infinite calling. Here we don't have loop so we can not say it's infinite loop.
        //This will give you stackoverflow error.
        //Why stackoverflow error is coming?
        //Because we are allocating the memory for methods execution infinite times(because m1()->m2()->m3()->m1()->m2().....) but we are not de-allocating/releasing the memory. So we will get stackoverflow error

    }

    public void m2() {
        System.out.println("m2 method");
        m3();
    }

    public void m3() {
        System.out.println("m3 method");
        m1();
    }

    // t1(),t2(),t3() and main are static methods
    public static void t1() {
        System.out.println("t1 method");
        t2();
    }

    public static void t2() {
        System.out.println("t2 method");
        t3();
    }

    public static void t3() {
        System.out.println("t3 method");
    }

    public static void main(String[] args) {

        Application app = new Application();
        app.m1();

    }
}

/**
 * GC can not come inside the stack or CMS
 * Stack means - the execution stack
 * Executing the methods we need some space. So that we will have in stack at the run time/execution time.And that space is known as stack space
 * It will take care about the execution part
 *
 *
 * Allocation of the memory for the execution
 * 1st main method stack will be created inside the stack space
 * 2nd m1() method stack will be created inside the stack space
 * 3rd m2() method stack will be created inside the stack space
 * 4th m3() method stack will be created inside the stack space
 *
 * Once the execution is done then de-allocated/memory will be released from stack space from the top
 *
 * 1st m3() will be de-allocated/memory will be released from stack space
 * 2nd m2() will be de-allocated/memory will be released from stack space
 * 3rd m1() will be de-allocated/memory will be released from stack space
 * 4th main() will be de-allocated/memory will be released from stack space
 *
 * For main method
 *
 * ✅ 1. Where main() is defined
 *
 * The definition (the blueprint of the method — name, parameters, bytecode, etc.)
 * → stored in Metaspace.
 * So JVM knows there exists a method called main() inside your class.
 *
 * 🧠 Think of Metaspace as a “library” that keeps the recipe of the method, not its execution.
 *
 *
 * ✅ 2. When main() is executed
 * When your program starts, JVM creates a new stack frame for main().
 * This stack frame is stored in Stack Memory.
 *
 * That frame holds:
 * All local variables (like obj, devList)
 * Any method calls made inside main()
 * References to objects in Heap
 *
 * So yes — when main() runs, it definitely occupies space in the Stack.
 */
/**
 * For method seprate stack will be created but for the variable of that method some memory will be assigned in the same stack which is created for method
 * refer. e-commerce screenshot - screenshot no - 9
 *
 *Which is more complex stack or heap?
 * Heap is complex - because java has to write/do many operation/check for null reference or no reference to/JVM needs to monitor the heap/GC needs to be called
 * So java needs to check so many combination to destroying or de-allocating the objects from heap
 * And in Stack it is easy(Simple call it, allocate the memory - once the methods are done - deallocate the memory).
 * Stack is less complex because we don't need to do any extra operation here
 * and heap is more complex
 * And there are other memory there other than the heap memory so heap is more complex
 *
 * The stack is known as execution stack.
 * So on what basis execution stack is getting created - On the basis of LIFO (Last in first out) - Stack algorithm
 * So at the time of de-allocation - the last method executed method will be destroyed first.
 * Queue - FIFO - Example - Movie Theartor
 *
 * Methods will be created inside the CMA/Metasapce and will be executed in the stack
 * For execution of the program we need space as well and that space is called stack space
 *
 * Stack memory is used for
 * Local variables
 * Method execution (Main + other methods)
 * Object references
 * Global variables - if static then 1 copy will get stored in Meta space
 *                  - if no-static then 1 copy will be stored inside the object
 *
 * stackoverflow if an ERROR not an exception. It's memory issue in our program.
 *
 * Where exactly we need more space? inside the heap or stack?
 * If we have 16GB RAM
 * If we have 1 GB space for HEAP then do we need more than 1 GB for stack or less?
 * We need less space inside the stack because once the space is allocated then it's de-allocating automatically as well.
 *
 * main -> login(use,pass)->search(product name)-> add to cart -> payment (CC) --> order(id)
 * once the final method ORDER(id) is executed then entire stack will be destroyed/deallocated automatically/again back to zero
 * And for the heap we need to wait for the GC
 * so tack memory is lesser than the heap memory and less complex than the heap memory
 *
 * To see visual diagram google - stack execution animation
 * So conclusion is that we need to write a code in such a way that we never get the stackoverFlow error
 */