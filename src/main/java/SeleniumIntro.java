import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {
    public static void main(String[] args) {

        // Invoking Browser - class methods
        // Chrome - ChromeDriver -> methods close get
        // Firefox - FirefoxDriver -> methods close get
        // Safari - Safari Driver -> methods close get
        // WebDriver close get
        // WebDriver methods or class methods
        // ChromeDriver driver = new ChromeDriver();

        // chromeDriver.exe -> Chrome browser
        System.setProperty("webDriver.chrome.driver", "/Users/hamzahcontreras/Development/Java/SeleniumFundamentals/chromedriver_mac_arm64");

        // webDriver.chrome.driver -> value of path
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();

    }
}
