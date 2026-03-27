package composition.Strong_HAS_A_relationship;

public class Demo {

    public static void main(String[] args) {

        Car c = new Car();   // 👈 focus here

        c.drive();

        c = null;           // 👈 reference removed
    }
}

class Car {

    // 👇 instance variable
    private Engine engine = new Engine();

    void drive() {
        engine.start();
        System.out.println("Car is moving");
    }
}

class Engine {
    void start() {
        System.out.println("Engine started");
    }
}
/**
 * Great set of questions 👍
 * Let’s answer the **last one clearly**, and along the way everything else will click.
 *
 * ---
 *
 * ## 🔍 Question
 *
 * > **Below is example of weak or strong HAS-A relationship?**
 *
 * ```java
 * public class Demo {
 *
 *     public static void main(String[] args) {
 *
 *         Car c = new Car();   // 👈 focus here
 *
 *         c.drive();
 *
 *         c = null;           // 👈 reference removed
 *     }
 * }
 *
 * class Car {
 *
 *     // 👇 instance variable
 *     private Engine engine = new Engine();
 *
 *     void drive() {
 *         engine.start();
 *         System.out.println("Car is moving");
 *     }
 * }
 *
 * class Engine {
 *     void start() {
 *         System.out.println("Engine started");
 *     }
 * }
 * ```
 *
 * ---
 *
 * ## ✅ Short Answer (Interview Ready)
 *
 * 👉 **This is a STRONG HAS-A relationship (Composition).**
 *
 * ---
 *
 * ## 🧠 Now let’s PROVE it step by step
 *
 * ### 1️⃣ Why this is HAS-A at all?
 *
 * Because:
 *
 * ```java
 * class Car {
 *     private Engine engine;
 * }
 * ```
 *
 * You can read it as:
 *
 * > **Car HAS-A Engine**
 *
 * So yes — this is **HAS-A relationship**.
 *
 * ---
 *
 * ## 2️⃣ Weak vs Strong HAS-A (core rule)
 *
 * | Type                           | Meaning                           |
 * | ------------------------------ | --------------------------------- |
 * | **Weak HAS-A**                 | Child can exist independently     |
 * | **Strong HAS-A (Composition)** | Child depends on parent lifecycle |
 *
 * So the **real question** is:
 *
 * > ❓ Can `Engine` exist independently of `Car` in THIS design?
 *
 * ---
 *
 * ## 3️⃣ Who creates `Engine`? 🔥 (MOST IMPORTANT)
 *
 * ```java
 * private Engine engine = new Engine();
 * ```
 *
 * ✔️ `Engine` is created **inside** `Car`
 * ✔️ No external class creates it
 * ✔️ No external reference exists
 *
 * 👉 **Car fully owns Engine**
 *
 * ---
 *
 * ## 4️⃣ Object creation flow (memory-wise)
 *
 * ```java
 * Car c = new Car();
 * ```
 *
 * What happens:
 *
 * 1. `c` (local variable) is created on **stack**
 * 2. `Car` object is created on **heap**
 * 3. `Engine` object is created on **heap**
 * 4. `Engine` reference is stored **inside Car object**
 *
 * Path:
 *
 * ```
 * c → Car → Engine
 * ```
 *
 * ---
 *
 * ## 5️⃣ Now the critical line
 *
 * ```java
 * c = null;
 * ```
 *
 * ### What happens?
 *
 * * `c` no longer points to `Car`
 * * No reference exists to `Car`
 * * `Engine` is reachable **only via Car**
 * * Therefore:
 *
 *   * Car → unreachable
 *   * Engine → unreachable
 *
 * 👉 Both become **eligible for garbage collection**
 *
 * ---
 *
 * ## 6️⃣ This proves lifecycle dependency 💥
 *
 * Ask these questions:
 *
 * | Question                             | Answer |
 * | ------------------------------------ | ------ |
 * | Can Engine live without Car?         | ❌      |
 * | Is Engine referenced independently?  | ❌      |
 * | Does Car control Engine’s lifecycle? | ✅      |
 *
 * ✔️ Therefore: **Strong HAS-A (Composition)**
 *
 * ---
 *
 * ## 7️⃣ Why this is NOT weak HAS-A (Aggregation)
 *
 * ### Weak HAS-A example (contrast)
 *
 * ```java
 * Engine e = new Engine();
 * Car c = new Car(e);
 *
 * c = null;
 * e.start(); // still works
 * ```
 *
 * Here:
 *
 * * Engine created outside
 * * Engine survives Car
 * * Independent lifecycle
 *
 * 👉 That would be **Weak HAS-A**
 *
 * ---
 *
 * ## 8️⃣ Final Classification of YOUR Program 🏆
 *
 * ✔️ HAS-A relationship
 * ✔️ **Strong HAS-A**
 * ✔️ Also called **Composition**
 *
 * ---
 *
 * ## 🧠 One-line memory rule
 *
 * > **Created inside + dies with parent = Strong HAS-A (Composition)**
 * > **Passed from outside + survives parent = Weak HAS-A (Aggregation)**
 *
 * ---
 *
 */

/**
 * Perfect 👍

 * ---
 *
 *
 * # 2️⃣ Why `c` is a **local variable**
 *
 * ```java
 * public static void main(String[] args) {
 *     Car c = new Car();
 * }
 * ```
 *
 * ### Rules in Java:
 *
 * * Any variable declared **inside a method** is a **local variable**
 * * `main()` is a method
 * * So `c` is a **local variable**
 *
 * 📌 Stored in **stack memory**
 *
 * ```
 * Stack (main method):
 * c ─────▶ Car object
 * ```
 *
 * ---
 *
 * # 3️⃣ Why `engine` is an **instance variable**
 *
 * ```java
 * class Car {
 *     private Engine engine = new Engine();
 * }
 * ```
 *
 * ### Rules in Java:
 *
 * * Any variable declared **inside a class but outside methods**
 * * And **not static**
 *   → is an **instance variable**
 *
 * 📌 Stored **inside the object (heap)**
 *
 * ```
 * Heap:
 * Car object
 *  └── engine ─────▶ Engine object
 * ```
 *
 * ---
 *
 * # 4️⃣ VERY IMPORTANT: Where references live
 *
 * ### ❌ Common misunderstanding
 *
 * > “engine reference should be in stack”
 *
 * ### ✅ Correct understanding
 *
 * | Variable | Type              | Stored where             |
 * | -------- | ----------------- | ------------------------ |
 * | `c`      | Local variable    | Stack                    |
 * | `engine` | Instance variable | Inside Car object (Heap) |
 *
 * ---
 *
 * # 5️⃣ Why instance variables are NOT in stack
 *
 * Stack is:
 *
 * * Method-specific
 * * Temporary
 * * Cleared when method ends
 *
 * If `engine` were in stack:
 *
 * * Engine would disappear when method ends ❌
 * * Car would break ❌
 *
 * So:
 *
 * > **Instance variables live as long as the object lives → heap**
 *
 * ---
 *
 * # 6️⃣ Memory Diagram (Clear & Accurate)
 *
 * ### After `Car c = new Car();`
 *
 * ```
 * Stack (main):
 * c ─────▶ Car object
 *
 * Heap:
 * Car object
 *  └── engine ─────▶ Engine object
 * ```
 *
 * ---
 *
 * # 7️⃣ What happens at `c = null;`
 *
 * ```
 * Stack:
 * (no reference to Car)
 *
 * Heap:
 * Car object
 *  └── engine ─────▶ Engine object
 * ```
 *
 * 🚫 No stack reference
 * 🚫 No GC root
 * ✔️ Both objects eligible for GC
 *
 * ---
 *
 * # 8️⃣ One-Line Answers (Interview-Ready 🏆)
 *
 * ### Why `c` is local?
 *
 * > Because it is declared inside a method.
 *
 * ### Why `engine` is instance variable?
 *
 * > Because it is declared at class level and belongs to each object.
 *
 * ### Why `engine` reference is in heap?
 *
 * > Because instance variables are part of the object, and objects live in heap.
 *
 * ---
 *
 * # 9️⃣ Final Memory Rule 🧠
 *
 * > **Local variables → Stack
 * > Instance variables → Heap (inside object)**
 *

 */