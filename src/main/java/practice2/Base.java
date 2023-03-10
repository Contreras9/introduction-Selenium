package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Base {
    public static void main(String[] args) {
        System.setProperty("webDriver.chrome.driver", "/Users/hamzahcontreras/Development/Java/SeleniumFundamentals/chromedriver_mac_arm64");
        WebDriver driver = new ChromeDriver();
        String[] products = {"Cucumber", "Broccoli"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");

        List<WebElement> veggies = driver.findElements(By.cssSelector("h4.product-name"));

        for (int i = 0; i < veggies.size(); i++) {
            String veggie = veggies.get(i).getText();
            if (veggie.contains("Cucumber")) {
                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
                break;
            }
        }
    }
}
