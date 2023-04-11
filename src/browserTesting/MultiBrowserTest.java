package browserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {
    static String browser = "firefox";
    static String baseUrl = "https://www.saucedemo.com/";
    static WebDriver driver;
    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser Name");
        }
        // Open the URL into Browser
        driver.get(baseUrl);

        // We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Get the title of the Page
        String title = driver.getTitle();

        //printing the page Title
        System.out.println(title);

        //Get the current URL
        System.out.println("Current URL : " + driver.getCurrentUrl());

        // Get Page Source
        System.out.println("Page Source : " + driver.getPageSource());

        // Find email field Element
        WebElement usernameField = driver.findElement(By.id("user-name"));

        // Type the email address to email field element
        usernameField.sendKeys("abcdefg@gmail.com");

        //Find Password field Element
        driver.findElement(By.name("password")).sendKeys("abc123");

        // Close the browser
        driver.close();
    }
}
