package WebDriver_Arch;

public class ChromeDriver implements WebDriver {
    @Override
    public void click() {
        System.out.println("chrome-click on element");
    }

    @Override
    public void sendKeys() {
        System.out.println("chrome-sending value to element");
    }

    @Override
    public void quit() {
        System.out.println("chrome-quit browser");
    }

    @Override
    public void findElement(String element) {
        System.out.println("chrome-find element: " +element);
    }

    public ChromeDriver(){
        System.out.println("Launch chrome browser");
    }
}
