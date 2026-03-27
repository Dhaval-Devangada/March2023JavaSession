package composition.weak_HAS_A_relationship;

public class Demo {

    public static void main(String[] args) {

        Engine e = new Engine();   // 👈 Engine created independently

        Car c = new Car(e);        // 👈 Car HAS-A Engine (reference passed)

        c.drive();

        c = null;                 // 👈 Car reference removed

        System.out.println("Car destroyed");

        e.start();                // 👈 Engine still alive
    }
}

class Car {

    private Engine engine;        // 👈 HAS-A (reference only)

    Car(Engine engine) {
        this.engine = engine;
    }

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
 * Perfect 👍
 * Now let’s **close the loop completely** and remove **all confusion**.
 *
 * You asked for:
 *
 * > ✅ A **program** that clearly shows **WEAK HAS-A (Aggregation)**
 * > ✅ And a **clear explanation** of *why it is weak*
 *
 * I’ll do this in **4 simple layers**:
 *
 * 1. Full program
 * 2. Object creation flow
 * 3. Memory + lifecycle explanation
 * 4. One-line interview conclusion
 *
 * ---
 *
 * # ✅ WEAK HAS-A (Aggregation) — COMPLETE PROGRAM
 *
 * ```java
 * public class Demo {
 *
 *     public static void main(String[] args) {
 *
 *         Engine e = new Engine();   // 👈 Engine created independently
 *
 *         Car c = new Car(e);        // 👈 Car HAS-A Engine (reference passed)
 *
 *         c.drive();
 *
 *         c = null;                 // 👈 Car reference removed
 *
 *         System.out.println("Car destroyed");
 *
 *         e.start();                // 👈 Engine still alive
 *     }
 * }
 *
 * class Car {
 *
 *     private Engine engine;        // 👈 HAS-A (reference only)
 *
 *     Car(Engine engine) {
 *         this.engine = engine;
 *     }
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
 * ## 1️⃣ Why this is **HAS-A** relationship
 *
 * Because:
 *
 * ```java
 * class Car {
 *     private Engine engine;
 * }
 * ```
 *
 * 👉 **Car HAS-A Engine**
 *
 * No inheritance
 * Only object reference
 * ✔️ HAS-A confirmed
 *
 * ---
 *
 * ## 2️⃣ Why this is **WEAK HAS-A (Aggregation)** 🔥
 *
 * ### The KEY reason:
 *
 * > **Engine is created OUTSIDE Car**
 *
 * ```java
 * Engine e = new Engine();   // independent creation
 * Car c = new Car(e);        // Car just uses it
 * ```
 *
 * Car:
 *
 * * ❌ does NOT create Engine
 * * ❌ does NOT own Engine lifecycle
 * * ✅ only uses Engine
 *
 * ---
 *
 * ## 3️⃣ Lifecycle Explanation (THIS is the core)
 *
 * ### Step 1: Creation
 *
 * ```
 * Stack:
 * e ───▶ Engine
 * c ───▶ Car ───▶ Engine
 * ```
 *
 * ### Step 2: Destroy Car
 *
 * ```java
 * c = null;
 * ```
 *
 * ```
 * Stack:
 * e ───▶ Engine
 * ```
 *
 * ✔️ Engine still reachable
 * ✔️ Engine still usable
 * ✔️ Engine lifecycle is **independent**
 *
 * That’s why it is **WEAK HAS-A**
 *
 * ---
 *
 * ## 4️⃣ Compare with STRONG HAS-A (Composition)
 *
 * ```java
 * class Car {
 *     private Engine engine = new Engine(); // created inside
 * }
 * ```
 *
 * ```java
 * Car c = new Car();
 * c = null;   // Engine lost too
 * ```
 *
 * ❌ Engine cannot survive
 * ❌ Lifecycle dependent
 * ✔️ STRONG HAS-A
 *
 * ---
 *
 * ## 5️⃣ Side-by-Side Summary (Very Important)
 *
 * | Feature         | Weak HAS-A (Aggregation) | Strong HAS-A (Composition) |
 * | --------------- | ------------------------ | -------------------------- |
 * | Object creation | Outside parent           | Inside parent              |
 * | Ownership       | No                       | Yes                        |
 * | Lifecycle       | Independent              | Dependent                  |
 * | Example         | Car → Engine             | Car → Engine               |
 * | GC behavior     | Child survives           | Child dies                 |
 *
 * ---
 *
 * ## 6️⃣ Interview-Ready One-Liner 🏆
 *
 * > **This is a weak HAS-A relationship because the child object is created independently and passed to the parent, so destroying the parent does not destroy the child.**
 *
 * ---
 *
 * ## 7️⃣ Final Verdict for YOUR QUESTION ✅
 *
 * 👉 **The program you asked for is a WEAK HAS-A (Aggregation)**
 * 👉 Because **Engine survives even after Car is destroyed**
 *
 * ---
 *

 */

