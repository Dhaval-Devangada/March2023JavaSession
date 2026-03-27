package WebDriver_Arch_Correct_Approach;

public class ChromeDriver implements WebDriver {
    @Override
    public void click() {
        System.out.println("click on element");
    }

    @Override
    public void sendKeys() {
        System.out.println("sending value to element");
    }

    @Override
    public void quit() {
        System.out.println("quit browser");
    }

    @Override
    public void findElement(String element) {
        System.out.println("find element: " +element);
    }



    public ChromeDriver(){
        System.out.println("Launch chrome browser");
    }

}
