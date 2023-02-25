import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {

        System.setProperty("webDriver.chrome.driver", "/Users/hamzahcontreras/Development/Java/SeleniumFundamentals/chromedriver_mac_arm64");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        // The Locators are the way to identify an HTML element on a web page.
        // Locators - ID, Xpath, CSS Selector, name, className, Tag name, Link Text, Partial Link Text
        driver.findElement(By.id("inputUsername")).sendKeys("yared");
        driver.findElement(By.name("inputPassword")).sendKeys("hello123");
        driver.findElement(By.className("signInBtn")).click();
        driver.findElement(By.cssSelector("p.error")).getText();

        //        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
    }
}
