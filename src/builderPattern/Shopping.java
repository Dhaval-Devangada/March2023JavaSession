package builderPattern;

public class Shopping {
    //Assume that we are doing online shopping
    //First assume that there are all the methods without "return this" and return type is "void" for all the methods

    /**
     * public void login(){
     * System.out.println("user is logged in");
     * <p>
     * }
     * <p>
     * public void login(String un,String pwd){
     * System.out.println("login with "+ un + ":" + pwd);
     * }
     * <p>
     * //After login what we do - we search something
     * public void search(String productName){
     * System.out.println("search product: " + productName);
     * }
     * public void search(String productName,int price){
     * System.out.println("search product: " + productName + ":" + price);
     * }
     * <p>
     * //After searching what we do - Select the product /Add To Cart - Which product? - The product we have searched
     * public void addToCart(String productName){
     * System.out.println("add to cart : " + productName);
     * }
     * <p>
     * //After addToCart what we do - enter the address & make the payment - but we are skipping the "enter the address"
     * <p>
     * public void doPayment(String cc,int cvv){
     * System.out.println("make payment: " + cc + " : " + cvv);
     * }
     * //if you are in india you can supply your upi number as well
     * public void doPayment(String upi){
     * System.out.println("make payment: " + upi);
     * }
     * //Once the payment is done - what will happen - Order details will be generated
     * public void generateOrder(){
     * System.out.println("generating order, order id is : " + 12345);
     * }
     * //And after that we do log out/Thank you mail.whatever method we want to create we can create it
     * public void logout(){
     * System.out.println("logout");
     * }
     *
     *
     */
    public Shopping login(){
        System.out.println("user is logged in");
        return this;

    }

    public Shopping login(String un, String pwd){
        System.out.println("login with "+ un + ":" + pwd);
        return this;
    }

    //After login what we do - we search something
    public Shopping search(String productName){
        System.out.println("search product: " + productName);
        return this;
    }
    public Shopping search(String productName, int price){
        System.out.println("search product: " + productName + ":" + price);
        return this;
    }

    //After searching what we do - Select the product /Add To Cart - Which product? - The product we have searched
    public Shopping addToCart(String productName){
        System.out.println("add to cart : " + productName);
        return new Shopping();
    }

    //After addToCart what we do - enter the address & make the payment - but we are skipping the "enter the address"

    public Shopping doPayment(String cc, int cvv){
        System.out.println("make payment: " + cc + " : " + cvv);
        return this;
    }
    //if you are in india you can supply your upi number as well
    public Shopping doPayment(String upi){
        System.out.println("make payment: " + upi);
        return this;
    }
    //Once the payment is done - what will happen - Order details will be generated
    public Shopping generateOrder(){
        System.out.println("generating order, order id is : " + 12345);
        return this;
    }
    //And after that we do log out/Thank you mail.whatever method we want to create we can create it
    public Shopping logout(){
        System.out.println("logout");
        return this;
    }

/**
 * can we return "this" from a function like here (login fun)
 * "this" keyword we have seen in constructor, encapsulation(methods - in getters and setters)
 * First of all - What is the meaning of "this" keyword
 * "this" keyword means "current class object" - what is the current class = Shopping
 * So whenever we are returning "this" keyword then instead of "void" we need to write current class object
 * and instead of "return this" can we write "return new Shopping"? -YES
 * At the end of the method we can write "return this" and "return new Shopping()" as well - how to read it - "login()" method please return the "Shopping" class object
 * So whenever we are returning the "Object" we need to write class name instead of "void"
 * So here we are returning the Object from each and every method so Object will get created inside the heap without any "reference variable"
 * So at every method calling, new object will get created
 * Unnecessarily objects are getting created Thats is the issue when we write "return new Shopping()"
 * So what should we do - or - whenever user is doing shopping we don't want to create "N" number of objects unnecessarily
 * To do that instead of writing/returning "return new Shopping()" we can return/write "return this" means "whatever the current class object going on, please give me the same object"
 * What do you mean by Builder here? what should we do to achieve builder pattern?
 * Every method is returning "this" keyword. It means every method is returning the current class object.
 * "this means" This class object. And This class is "Shopping".
 * "this" keyword is always pointing to the current class object
 */

public Shopping loginWithThis(){
    System.out.println("user is logged in");
    return this;

}

    public Shopping loginWithThis(String un, String pwd){
        System.out.println("login with "+ un + ":" + pwd);
        return this;
    }

    //After login what we do - we search something
    public Shopping searchWithThis(String productName){
        System.out.println("search product: " + productName);
        return this;
    }
    public Shopping searchWithThis(String productName, int price){
        System.out.println("search product: " + productName + ":" + price);
        return this;
    }

    //After searching what we do - Select the product /Add To Cart - Which product? - The product we have searched
    public Shopping addToCartWithThis(String productName){
        System.out.println("add to cart : " + productName);
        return this;
    }

    //After addToCart what we do - enter the address & make the payment - but we are skipping the "enter the address"

    public Shopping doPaymentWithThis(String cc, int cvv){
        System.out.println("make payment: " + cc + " : " + cvv);
        return this;
    }
    //if you are in india you can supply your upi number as well
    public Shopping doPaymentWithThis(String upi){
        System.out.println("make payment: " + upi);
        return this;
    }
    //Once the payment is done - what will happen - Order details will be generated
    public Shopping generateOrderWithThis(){
        System.out.println("generating order, order id is : " + 12345);
        return this;
    }
    //And after that we do log out/Thank you mail.whatever method we want to create we can create it
    public Shopping logoutWithThis(){
        System.out.println("logout");
        return this;
    }

    /**
     * How to test above feature?
     * To test it - create a caller class with the main method - refer "ShopTest" with the main method
     */
}
