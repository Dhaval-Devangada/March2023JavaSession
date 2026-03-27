package OOP_AbstractClass;


public class LoginPage extends Page {
//    int loadingTime = 10;

    //hidden const - default constructor

    //Now we are extending the "abstract Page class". So we need to implement their "abstract" methods as well.
    //If we don't implement those abstract methods from "page" class then we will get an error
    //Try commenting below methods to see the error
    //Page can not take decision that what will be "Title and URL" of the page, so java says let the "Page decides"
    //Every page should have "title and url" that is mandatory. The moment you try to be child of "page" then you should/need to have/implement "title and url" abstract methods
    @Override
    public void title() {
        System.out.println("LP - title");
    }

    @Override
    public void url() {
        System.out.println("LP - url");
    }

    //overridden method (Below method has body in our "Abstract Page class")
    @Override
    public void defaultPageTimeOut(){
        System.out.println("LP page -- time out = 5 secs ");
    }

    //Individual method
    public void doLogin(){
        System.out.println("LP page -- login to app");
    }


    public LoginPage(){
        System.out.println("Login page -- default const");
    }

    public LoginPage(int i){
        System.out.println("Login page -- parameterize const");
    }


}
