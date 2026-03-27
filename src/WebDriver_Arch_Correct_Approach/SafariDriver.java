package WebDriver_Arch_Correct_Approach;

public class SafariDriver implements WebDriver {

    @Override
    public void click() {
        System.out.println("edge-click on element");
    }

    @Override
    public void sendKeys() {
        System.out.println("edge-sending value to element");
    }

    @Override
    public void quit() {
        System.out.println("edge-quit browser");
    }

    @Override
    public void findElement(String element) {
        System.out.println("edge-find element: " +element);
    }

    public SafariDriver(){
        System.out.println("Launch safari browser");
    }
}
