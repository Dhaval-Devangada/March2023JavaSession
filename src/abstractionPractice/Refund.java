package abstractionPractice;

public interface Refund {
    default void printReceipt(){
        System.out.println("Hey..baby");
    }
}
