package builderPattern;

public class ShopTest {
    //shopping class is a business logic class and in "business logic" class we should not write the caller method
    public static void main(String[] args) {
        Shopping shop = new Shopping();
        //Object got created and ultimately copy of all the methods from "Shopping" class will be given to specific object(like here above object)
        //Object will get created and "shop" is referring the object and all the methods(Which we have created in "Shopping.java"are inside the object)
        //So when we call "shop.login()" and it's not returning you/giving you "new Shopping()". It's returning you "this keyword /current class object"
        //So what is the advantage of that?
        //Now we can create chain of methods here like blow
        //after calling first method "shop.login("naveen@gmail.com", "naveen123")"
        //The moment we write ".(dot)" then other suggestions from the same class(Shopping) will come. Why?
        //What is the return type of login method? - Login method is saying i am going to give you current class object - and in that object whatever number of methods are available we can call it.
        //So after login we can call "search" method and "search" is also giving us "same object/current class same object" and not a new object and in that object we have another methods
        //So after "search" we can call another methods "addToCart"
        //"addToCart" also returning "this" keyword


        //Now with the help of "shop" can we call any method?
        //We want to do shopping


        //the moment we call "shop.login("naveen@gmail.com", "naveen123")" the second login method which is overloaded will be called.
        //Then login will be done with given email and /password and will return "this". Means same class object i am going to give it to you
        //login method is giving us/returning us the current class object and, in that object all the methods of "Shopping" class are there and call any of them
        shop.login("naveen@gmail.com", "naveen123")
                .search("Macbook Pro")
                .addToCart("Macbook Pro")
                .doPayment("8899665566@ybl")
                .generateOrder()
                .logout();
        /**
         * Run above program and check
         */
        /**
         * So what is this(The one which we have created above)- these are the method chaining
         * We use these kind of things in "selenium - Actions classes" and in "Rest Assured"
         * But why are we doing this? What is the advantage of this?
         *
         * Let's assume that above flow which we have created is the first flow we have created
         * Now again next day I am coming and I really want to shopping once again
         * Then we login once again and "search" with the different product
         * and "adding that product to cart"but we don't want to make a payment right now. Leave it as it is in the cart
         * So after immediately "addToCart" can we "logOut"? - YES,
         * Because "addToCart" giving us "current class object" and in the "current class object" "logOut" is there. So we can call it
         */

        /**
         * 2nd workflow
         */
        shop.login("naveen@gmail.com", "naveen123")
                .search("Tshirt",1000)
                .addToCart("Tshirt")
                .logout();

        /**
         * Let's try another work flow
         * 3rd workflow
         */
        shop.login("naveen@gmail.com", "naveen123")
                .search("Apple Imac")
                .search("Apple Iphone") //I want to search for another product
                .search("Apple Macbook pro") //again I want to search for another product
                .addToCart("Apple Iphone") //And after 3 search we are adding only "Apple Iphone". That is up to user. That how many product we want to search and how many product we want to add
                .doPayment("2121 2121 2121 2121",900)//This time we are using "credit card"
                .generateOrder()
                .logout();

        /**
         * so don't you think that we are giving flexibility to user
         */

        /**
         * Let's try another work flow
         * 4th workflow
         * I really want to check that "Do I have anything in my cart?"
         * Go and check it overthere
         * And
         * I really want to check that "My order History"
         *
         */

        shop.login("naveen@gmail.com", "naveen123").logout();
    }
}

/**
 * In this entire flow how many objects have we created- 1
 */