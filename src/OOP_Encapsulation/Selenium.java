package OOP_Encapsulation;
/*Java_19_OOP_Encapsulation_getter_setter_thisKeyword
Program - 6*/
public class Selenium {

    //private constructor // I need to user private constructor when we don't need to create object and where all the properties of class are STATIC
    private Selenium() {

    }

    //constructor is private so we need to create static method
    public static void click() {
        System.out.println();
    }

}

//OUT is a static variable in system class
//OUT is reference variable of PrintStream class and "println" is a method of PrintStream class
//OUT is giving us the reference of PrintStream and with that reference we are able to call println

/**
 *
 * System.out.println("Dhaval"); Here "OUT" is staic in SYSTEM class and "println" is nonstatic in PrintStremClass. Why are we using all three System.out.println to print text on screen
 *
 * Great question — this confuses many people at first.
 * Let’s break it down **very simply** and **why all three are needed**.
 *
 * ---
 *
 * # ✅ **Why we write `System.out.println("Dhaval")`?**
 *
 * Because Java designed this printing mechanism using **three different components**, each having a very specific job.
 *
 * ---
 *
 * # 🔍 **Breakdown of Each Part**
 *
 * ## 1️⃣ **`System`** (Class)
 *
 * * A final utility class in `java.lang`.
 * * Contains many useful static members like:
 *
 *   * `System.out`
 *   * `System.err`
 *   * `System.in`
 *
 * 👉 **Why we need it?**
 * `System` is simply the **entry point** to access Java’s built-in input/output streams.
 *
 * ---
 *
 * ## 2️⃣ **`out`** (Static Reference Variable in System Class)
 *
 * * `out` is a **public static final** variable inside `System` class.
 * * Type: **PrintStream**
 * * It represents:
 *
 *   * **Standard output** (console)
 *
 * 👉 **Why we need it?**
 * `System.out` gives us the ready-made object that can print to console.
 * We don’t create this object — **Java creates it automatically** when JVM starts.
 *
 * ---
 *
 * ## 3️⃣ **`println()`** (Method in PrintStream Class)
 *
 * * `println()` is a **non-static** method of the `PrintStream` object.
 * * It writes the text and adds a newline.
 *
 * 👉 **Why we need it?**
 * Because we need some function that actually prints the string.
 *
 * ---
 *
 * # ✔️ **Putting All Together**
 *
 * When you write:
 *
 * ```
 * System.out.println("Dhaval");
 * ```
 *
 * It works like this:
 *
 * 1. **System** → Find the System class.
 * 2. **System.out** → Access the static `out` variable (a PrintStream object).
 * 3. **.println()** → Call the non-static method on that PrintStream object.
 *
 * ---
 *
 * # 🧠 **WHY NOT Something Simpler Like Just `println("Dhaval")`?**
 *
 * Because:
 *
 * * `println` belongs to **PrintStream** class
 * * We need an **object** of PrintStream to call non-static methods
 * * `System.out` gives us that object
 *
 * Java designers wanted I/O to be flexible. Example:
 *
 * * You can reassign `System.out` to write to a file instead of console.
 *
 * ```
 * System.setOut(new PrintStream(new FileOutputStream("log.txt")));
 * ```
 *
 * ---
 *
 * # 🏁 **Summary**
 *
 * | Part          | Meaning                   | Why Required                       |
 * | ------------- | ------------------------- | ---------------------------------- |
 * | **System**    | Class                     | Provides entry to standard streams |
 * | **out**       | Static PrintStream object | The actual object used to print    |
 * | **println()** | Non-static method         | The printing logic                 |
 *
 * Together → they form the pipeline to print to the console.
 *
 * ---
 *
 * If you want, I can show you what happens inside `System` class and `PrintStream` class as well.
 */