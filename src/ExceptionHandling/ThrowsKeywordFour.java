package ExceptionHandling;

public class ThrowsKeywordFour {
    public void m1() {
        System.out.println("m1 method");
        m2();
    }

    public void m2(){
        System.out.println("m2 method");
        try{
            m3();
        } catch (ArithmeticException e) {
            System.out.println("AE is coming");
            e.printStackTrace();
        }

    }

    public void m3() throws ArithmeticException{
        System.out.println("m3 method");
        int i = 9/0;
    }


    public static void main(String[] args) {  // Here we don't have "throws ArithmeticException" that means main method is not throwing exception
        ThrowsKeywordFour throwsKeyword = new  ThrowsKeywordFour();

        throwsKeyword.m1();
        System.out.println("bye");
    }
}

/**
 *  so now question is , who should handle the exception. m1(),m2(),m3()
 *  ideally it should be handled by m3()
 *  but m3() say I am throwing the exception from my side
 *  now m2() says I am going to handle it
 *  So inside m2() we can write try-catch block around the line which is giving us exception
 *  "bye" will get printed and program will not be terminated when exception is coming. Exception will be handled inside m2() method.
 *
 *
 * Real time example
 * Amazon.com application  and ICICIbank.com application
 * From amazon we are calling ICICbank for the transaction
 * We have totally different system (amazon - amazon server) and (ICICbank -  ICICBank server)
 * So user is calling payment method from amazon.com > when calling the ICICBank services from amazon app we are getting an exception/We can get exception
 * We never know right, that when we are going to get exception. We don't have any control on bank server code. It's a third party for me.
 * On ICICIBANK exception is coming like "account not found","Low balance"/some other exception is coming
 * And that amazon application is also giving that exception to user like "You are getting some SQL exception/File not found exception" on the browser itself.
 * So as a user we are getting exception and we can not handle it.
 * So it's a amazon app responsibility to handle the exception and give proper message to user [service is down]
 * Ideally exception should be handled on ICICbank but if it's not handled on ICICbank then we can not supply that exception to user so that is why we are handling it on Amazon app.And then we are telling user that some exception is coming we will try after sometime.
 * Main thing is exception should not be thrown to user/ should not be handled by user
 *
 * if exception coming in m3() and if it is not handling the exception and throwing it
 * Then we need to check who is calling m3() > m2() is calling m3()
 * then exception should be handled by m2 > if m2 is throwing exception and not handling it > then it should be handled by m1
 * we can not supply/throw the exception to main method
 *
 * Good practice is that it should be handled by m3() itself where the exception is coming
 *
 * With the "throws" keyword we are not handling exception, we are just passing the exception to another method
 * Actual exception handling is done by try-catch block
 *
 */