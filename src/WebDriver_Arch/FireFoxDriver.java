package WebDriver_Arch;

public class FireFoxDriver implements WebDriver {

    @Override
    public void click() {
        System.out.println("FF-click on element");
    }

    @Override
    public void sendKeys() {
        System.out.println("FF-sending value to element");
    }

    @Override
    public void quit() {
        System.out.println("FF-quit browser");
    }

    @Override
    public void findElement(String element) {
        System.out.println("FF-find element: " +element);
    }

    public FireFoxDriver(){
        System.out.println("Launch firefox browser");
    }
}
