package amazon_Rahul_JQuery_Sites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Scope {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable notifications");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(capabilities);

        System.setProperty("webDriver.chrome.driver", "/Users/hamzahcontreras/Development/Java/SeleniumFundamentals/chromedriver_mac_arm64");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        // 1.Give me the count of links on the page.
        System.out.println(driver.findElements(By.tagName("a")).size());

        // 2. Count of footer section
        WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
        System.out.println(footerDriver.findElements(By.tagName("a")).size());

        WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(columnDriver.findElements(By.tagName("a")).size());

        // Click on each link in the column and check if the pages are opening.
        for (int i = 1; i < columnDriver.findElements(By.tagName("a")).size(); i++) {
            columnDriver.findElements(By.tagName("a")).get(i).click();
        }

    }
}
