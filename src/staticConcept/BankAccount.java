package staticConcept;


     public class BankAccount {
      static String bankName = "HDFC Bank";  // common for all accounts
      String accountHolder;
      double balance;

      public BankAccount(String name, double bal) {
         this.accountHolder = name;
         this.balance = bal;
      }

      public void showDetails() {
          System.out.println(accountHolder + " - " + bankName + " - ₹" + balance);
      }

      public static void changeBankName(String newName) {
          bankName = newName;
      }
  }

