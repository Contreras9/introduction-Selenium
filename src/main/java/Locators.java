import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators {
    public static void main(String[] args) {

        System.setProperty("webDriver.chrome.driver", "/Users/hamzahcontreras/Development/Java/SeleniumFundamentals/chromedriver_mac_arm64");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        // Implicit wait - 2 seconds time-out
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // The Locators are the way to identify an HTML element on a web page.
        // Locators - ID, Xpath, CSS Selector, name, className, Tag name, Link Text, Partial Link Text
        driver.findElement(By.id("inputUsername")).sendKeys("yared");
        driver.findElement(By.name("inputPassword")).sendKeys("hello123");
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("yared");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("jared@gmail.com");
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("yared@gmail.com");

        // To find unique HTML element with the dev-console = $('p.error'); for Xpath = $x('//input[@placeholder="Name"]'); or //input[@type='text'][2]

        //        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
    }
}
