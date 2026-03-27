package OOP_Encapsulation;

public class AccountTest {
    public static void main(String[] args) {

        Account acc = new Account();
        System.out.println(acc.getName());
        acc.setName("Komal");
        System.out.println(acc.getName());

    }
}
