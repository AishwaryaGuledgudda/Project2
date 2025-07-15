import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandling {

    public static void main(String[] args) {
        String path = "/Users/aishwaryaguledgudda/Projects/Project2/drivers/chromedriver-mac-arm64/chromedriver";
        System.setProperty("webdriver.chrome.driver",path);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/frame");
        driver.switchTo().frame(0);
        driver.findElement(By.name("fname")).sendKeys("Aishwarya");
        driver.findElement(By.name("lname")).sendKeys("BG");
        driver.switchTo().frame(0);
//        driver.switchTo().frame("ID");
//        driver.switchTo().frame("Xpath");
        driver.findElement(By.name("email")).sendKeys("aishwarya@gmail.com");
        driver.switchTo().defaultContent();
    }
}

