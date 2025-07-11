import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) {
        String path = "/Users/aishwaryaguledgudda/Projects/Project2/drivers/chromedriver-mac-arm64/chromedriver";
        System.setProperty("webdriver.chrome.driver",path);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/dropdowns");
        WebElement fruits = driver.findElement(By.id("fruits"));
        Select myfruit = new Select(fruits);
        myfruit.selectByVisibleText("Apple");
        System.out.println("Apple");

        //Select india and print selected value
        WebElement country =  driver.findElement(By.id("country"));
        Select sl = new Select(country);
        sl.selectByValue("India");
        WebElement selected =  sl.getFirstSelectedOption();
        System.out.println(selected.getText());
        driver.quit();
    }
}

//Notes:
//Exception Handling:
//1)UnsupportedOperationException (You may only deselect options of a multi-select
//2)
