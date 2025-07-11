import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alertletcode {
    public static void main(String[] args) throws InterruptedException {
        String path = "/Users/aishwaryaguledgudda/Projects/Project2/drivers/chromedriver-mac-arm64/chromedriver";
        System.setProperty("webdriver.chrome.driver",path);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/alert");
        //Simple Alert
        driver.findElement(By.id("accept")).click();
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        System.out.println("Simple Alert test " +text);
        alert.accept();

        //Confirm Alert
        driver.findElement(By.id("confirm")).click();
        Alert okConfirmAlert = driver.switchTo().alert();
        System.out.println("Accepting Confirm alert ");
        okConfirmAlert.accept();
        Thread.sleep(3000);
//        driver.findElement(By.id("confirm")).click();
//        Alert cancleConformAlert = driver.switchTo().alert();
//        System.out.println("Cancelling the Confirm Alert");
//        cancleConformAlert.dismiss();

        //Prompt Alert
        driver.findElement(By.id("prompt")).click();
        Alert alert2= driver.switchTo().alert();
        alert2.sendKeys("Aishwarya");
        alert2.accept();
        System.out.println(driver.findElement(By.id("myName")).getText());
        driver.quit();
    }
}
//Notes:
//Exception Handling:
//1) UnHandledAlertException
//2) NoAlertPresentException
