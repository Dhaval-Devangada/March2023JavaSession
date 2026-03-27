package OOP_Abstraction;

public interface UKMedical {

    public void neuroServices();

    public void orthoServices();

    public void emergencyServices();

    //If you have a method which has no method body and you are making it private also so that method can not be overridden.
    //private methods can not be overridden and abstract methods has to be overridden
    // So that private abstract method is not allowed
    //private void test();
}

