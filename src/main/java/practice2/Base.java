package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Arrays;
import java.util.List;

public class Base {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable notifications");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(capabilities);

        System.setProperty("webDriver.chrome.driver", "/Users/hamzahcontreras/Development/Java/SeleniumFundamentals/chromedriver_mac_arm64");
        WebDriver driver = new ChromeDriver(options);

        int j = 0;

        String[] veggiesNeeded = {"Cucumber", "Brocolli", "Beetroot"};

        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        Thread.sleep(3000);
        List<WebElement> veggies = driver.findElements(By.cssSelector("h4.product-name"));

        for (int i = 0; i < veggies.size(); i++) {
            String[] veggie = veggies.get(i).getText().split("-");
            String veggieNameOnly = veggie[0].trim();
            List itemsNeededList = Arrays.asList(veggiesNeeded);

            if (itemsNeededList.contains(veggieNameOnly)) {
                j++;
                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();

                if (j == 3) {
                    break;
                }
            }
        }
    }
}
