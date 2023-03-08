package selenium;

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
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("123-099-0990");
        driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("yared");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();


        // CSS Selector -
        // className -> tag.classname -> button.signInBtn -> .signInBtn or chain with . -> .ui-state-default.ui-state-highlight.ui-state-active
        // id -> tag#id -> input#inputUsername
        // tag[attribute='value'] -> input[placeholder='Username']
        // tag[attribute='value']:nth-child(i) -> input[type='text']:nth-child(3)
        // parent-tag child-tag -> form p
        // build CSSSelector -> input[type*='pass']
        // combo build -> //div[@class='forgot-pwd-btn-conainer']/button[1]
        // tag -> h2 or By.tagName("h2")
        // sibling to sibling traverse -> //header/div/button[1]/following-sibling::button[1]
        // child to parent traverse -> //header/div/button[1]/following-sibling::button[1]/parent::div/button[2]
        // parent and child -> //div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']

        // xpath
        // //tag[@attribute='value'] -> //input[@placeholder='Username']
        // // //tag[@attribute='value'][i] -> //input[@type='text'][2]
        // //parent-tag/child-tag -> //form/input[3]
        // build xpath -> //button[contains(@class,'submit')]
        // tag -> //h2
        // text -> //button[text()='Log Out']

        // To find unique HTML element with the dev-console = $('p.error'); and for xpath = Xpath = $x('//input[@placeholder="Name"]');

    }
}
