package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class Base {
    public static void main(String[] args) {
        System.setProperty("webDriver.chrome.driver", "/Users/hamzahcontreras/Development/Java/SeleniumFundamentals/chromedriver_mac_arm64");
        WebDriver driver = new ChromeDriver();
        String[] veggiesNeeded = {"Cucumber", "Broccoli", "Beetroot"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");

        List<WebElement> veggies = driver.findElements(By.cssSelector("h4.product-name"));

        for (int i = 0; i < veggies.size(); i++) {
            String veggie = veggies.get(i).getText();
            List itemsNeededList = Arrays.asList(veggiesNeeded);
            if (itemsNeededList.contains(veggie)) {
                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
            }
        }
    }
}
