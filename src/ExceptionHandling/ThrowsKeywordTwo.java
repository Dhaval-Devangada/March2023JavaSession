package ExceptionHandling;

public class ThrowsKeywordTwo {
    public void m1() throws ArithmeticException{
        System.out.println("m1 method");
        m2(); //All the method are part of same object so they can call it each-other without creating object
    }

    public void m2() throws ArithmeticException{
        System.out.println("m2 method");
        m3(); //All the method are part of same object so they can call it each-other without creating object
    }

    public void m3() throws ArithmeticException{
        System.out.println("m3 method");
        int i = 9/0;
    }


    public static void main(String[] args) throws ArithmeticException{
        ThrowsKeyword throwsKeyword = new  ThrowsKeyword();
        throwsKeyword.m1();
        System.out.println("bye");
    }
}

/**
 * Now m3() says we are getting exception, but I don't want to handle it
 * m3() says  i just throwing the exception from my side
 * for throwing the exception we are using "throws" keyword
 * "throws" keyword will always be used after the method name
 * and "throws" what - throwing the exception
 *
 * public void m3() throws AirthmeticException{
 *      System.out.println("m3 method");
 *         int i = 9/0;
 * }
 *
 * so m3() is giving you the exception but not handling it and throwing it
 * so this exception will be thrown to whom and who will hold this exception now
 * exception will be thrown to m2() method - because m2() is calling the m3() - where the exception is coming
 * exception is coming in m3 but m3 method is getting executed because m2() is responsible for calling m3(),
 * As m2() method is responsible for calling m3() that is why exception will be thrown to m2()
 *
 * ideally it should be handled by m3() - because exception is coming in  m3()
 * but m3() says i don't want to handle it
 * so now it's m2() methods responsibility to handle it
 *
 * Now m2() says i am also not taking the responsibility to handle it so i am also throwing it from my side
 * Now who has to handle the exception?
 * Now it's m1() method's responsibility to handle it - because m1() is calling m2()
 * Now m1() is saying that I am also throwing it from my side
 * Now whose responsibility to handle the exception
 * now it's main method's responsibility to handle the exception
 * because main is/was calling the m1()
 * now main() says I don't want to handle it. I am also throwing the exception from my side.
 * Now who is calling main method
 * main method is called by JVM
 * So now jvm has to handle it
 *
 * so now tell me what will be the o/p when we run the program
 * Will it print "bye" or not ? - NO
 * Why? because we are not handling the exception. We are throwing the exception from one method to another method. No one is handling the exception
 * ideally it should be handled by m3
 * no one is handling it. Everyone is passing the exception to respective caller method
 * once it's reaching to main method, then method is also saying that i am also throwing from my side
 * who is calling main method > jvm is calling main method
 * jvm is not going to handle the exception. JVM says I will just print the exception information on console that's it
 * Otherwise if jvm is handling the exception then we don't need to handle the exception
 * If JVM is handling the exception then it would have printed the "bye"
 *
 *Now main method says I don't want to throw it to JVM I want to handle it
 * For that  refer ThrowsKeywordThree program
 */