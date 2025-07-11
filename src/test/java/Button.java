import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {
    public static void main(String[] args) {
        String path = "/Users/aishwaryaguledgudda/Projects/Project2/drivers/chromedriver-mac-arm64/chromedriver";
        System.setProperty("webdriver.chrome.driver",path);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/button");
        //find X & Y co-ordinates
        WebElement ele = driver.findElement(By.id("position"));
        Point point=  ele.getLocation();
        int x = point.getX();
        int y = point.getY();
        System.out.println("X point is " +x);
        System.out.println("Y point is " +y);

        //Find color of button
        WebElement btnColor = driver.findElement(By.id("color"));
        String color = btnColor.getCssValue("background-l");
        System.out.println(color);
        driver.quit();

        //find height and width of a button
        WebElement dimentions =  driver.findElement(By.id("property"));
        Rectangle rectangle = dimentions.getRect();
        rectangle.getDimension();
        int width = rectangle.getWidth();
        int height = rectangle.getHeight();
        System.out.println(width);
        System.out.println(height);

        //find if disabled
        WebElement disButton = driver.findElement(By.id("isDisabled"));
        System.out.println(disButton.isEnabled());







    }
}
