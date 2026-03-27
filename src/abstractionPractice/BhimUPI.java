package abstractionPractice;

public class BhimUPI implements Payment,Refund
{

    @Override
    public void doPayment() {

    }

    @Override
    public void printReceipt() {
        System.out.println("test");
    }
}
