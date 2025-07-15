import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class HomeWork {
    public static void main(String[] args) {
        String path = "/Users/aishwaryaguledgudda/Projects/Project2/drivers/chromedriver-mac-arm64/chromedriver";
        System.setProperty("webdriver.chrome.driver",path);
        ChromeDriver driver = new ChromeDriver();
        String w3Schools = "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt";
        driver.get(w3Schools);
        driver.findElement(By.id("accept-choices")).click();
        driver.switchTo().frame(0);
        driver.findElement(By.cssSelector("button[onclick='myFunction()']")).click();
        driver.switchTo().alert();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Aishwarya");
        alert.accept();
       String text =  driver.findElement(By.id("demo")).getText();
        System.out.println(text);
        driver.switchTo().defaultContent();
        driver.close();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));



    }
}
