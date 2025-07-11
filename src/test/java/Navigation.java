import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
    public static void main(String[] args) throws InterruptedException {
        String path = "/Users/aishwaryaguledgudda/Projects/Project2/drivers/chromedriver-mac-arm64/chromedriver";
        System.setProperty("webdriver.chrome.driver",path);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/button");
        String url =  driver.getCurrentUrl();
        System.out.println("Button page URL " +url);
        driver.findElement(By.id("home")).click();
        String homeUrl = driver.getCurrentUrl();
        System.out.println("Home url " +homeUrl);
        driver.navigate().back();
        System.out.println("Return to buttons url "+driver.getCurrentUrl());
        driver.navigate().refresh();
        driver.quit();
    }
}
