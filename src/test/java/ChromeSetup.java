import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeSetup {
    public static void main(String[] args) {
        String path = "/Users/aishwaryaguledgudda/Projects/Project2/drivers/chromedriver-mac-arm64/chromedriver";
        System.setProperty("webdriver.chrome.driver",path);
        ChromeDriver drive = new ChromeDriver();
    }
}
