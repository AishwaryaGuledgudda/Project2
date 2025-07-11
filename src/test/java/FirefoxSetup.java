import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxSetup {

    public static void main(String[] args) {
        String path = "/Users/aishwaryaguledgudda/Projects/Project2/drivers/geckodriver";
        System.setProperty("webdriver.firefox.driver",path);
        FirefoxDriver driver = new FirefoxDriver();
    }
}

