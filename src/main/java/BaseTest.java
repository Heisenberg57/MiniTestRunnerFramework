public abstract class BaseTest {

    abstract void runTest();

    void setup(){
        System.out.println("Setup Complete");
    }
}



class LoginTest extends BaseTest {
    @Override
    void runTest() {

        System.out.println("Running login test");
    }
}

class CheckoutTest extends BaseTest{
    @Override
    void runTest(){
        System.out.println("Running checkout test");
    }
}

interface BrowserDriver{
    void openBrowser();
    void closeBrowser();
}

class ChromeDriver implements BrowserDriver{

    @Override
    public void openBrowser() {
        System.out.println("Opening Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Chrome");
    }
}

class FirefoxDriver implements BrowserDriver{

    @Override
    public void openBrowser() {
        System.out.println("Opening Firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Firefox");
    }


}

class CodeRun {
    public static void main(String[] args) {
        BaseTest[] tests = {new LoginTest(), new CheckoutTest()};
        BrowserDriver[] drivers = {new ChromeDriver(), new FirefoxDriver()};

        for (BaseTest test : tests) {
            for (BrowserDriver driver : drivers) {
                driver.openBrowser();
                test.setup();
                test.runTest();
                driver.closeBrowser();
                System.out.println("__________");
            }
        }
    }
}


