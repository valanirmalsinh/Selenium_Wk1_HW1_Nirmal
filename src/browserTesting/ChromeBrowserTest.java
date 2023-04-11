package browserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";

        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();

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
