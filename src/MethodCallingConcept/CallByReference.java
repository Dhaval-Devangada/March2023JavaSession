package MethodCallingConcept;

public class CallByReference {

        public void sendEmail() {
            System.out.println("sending email");
        }

        public static void getEmail(CallByReference u) {
            System.out.println("getting email");
            u.sendEmail(); // Non-static call using reference
        }

        public static void readEmail(CallByReference u) {
            System.out.println("reading email");
            u.sendEmail();
        }

        public static void main(String[] args) {
            CallByReference u1 = new CallByReference();
            CallByReference.getEmail(u1);
            CallByReference.readEmail(u1);
        }


}
