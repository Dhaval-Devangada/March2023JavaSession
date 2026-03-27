package abstractionPractice;

public interface Payment {
    public void doPayment();

    default void printReceipt(){
        System.out.println("Hey..baby");
    }
}
