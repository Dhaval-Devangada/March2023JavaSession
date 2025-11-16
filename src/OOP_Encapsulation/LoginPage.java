package OOP_Encapsulation;
/*Java_19_OOP_Encapsulation_getter_setter_thisKeyword
Program - 3*/
public class LoginPage {
    //below variables are private in nature
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    //setter can be user for checks as well/validation as well
   //What if we are passing USER= null;
   // username length should be up to 8 letters only
    //We can set the policy for the password
    //So if we do checks/validation before supplying the data then our database is not get polluted with garbage data/junk values
    public void setPassword(String password) {
        if(password != null) {
            if(password.length()>=8) { //So these kind of checks we can do inside the setter block
                this.password = password;
            }
        }

    }

    public String getPassword() {
        return password;
    }

        //Setter and getter is just for setting and getting the values. We can not write the "doLogin" logic inside the setter and getter
        // We should not write business logic inside the getter and setter
    //So we are creating separate method for login
    public void doLogin() {
        System.out.println("login with : " + username +" : " + password); //We can use "username" and "password" here because both are in  the same object
    }
}
