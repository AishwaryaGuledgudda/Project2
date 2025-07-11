import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) throws InterruptedException {
        String path = "/Users/aishwaryaguledgudda/Projects/Project2/drivers/chromedriver-mac-arm64/chromedriver";
        System.setProperty("webdriver.chrome.driver",path);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/edit");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter first & last name']")).sendKeys("Aishwarya");
        driver.findElement(By.xpath("//input[@type='text' and @id='join']")).sendKeys(" girl", Keys.TAB);
        String value = driver.findElement(By.xpath("//input[@id='getMe']")).getAttribute("value");
        System.out.println(value);
        driver.findElement(By.xpath("//input[@id='clearMe']")).clear();
        Boolean isEdit =  driver.findElement(By.id("noEdit")).isEnabled();
        System.out.println(isEdit);
        //ReadOnly
        String readOnly = driver.findElement(By.id("dontwrite")).getAttribute("value");
        System.out.println(readOnly);

        Thread.sleep(2000);
        driver.quit();
    }
}
