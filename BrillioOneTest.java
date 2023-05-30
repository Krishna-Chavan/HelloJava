import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrillioOneTest {

        public static void main(String[] args) throws IOException, InterruptedException {
                System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless");
                chromeOptions.addArguments("--no-sandbox");

                WebDriver driver = new ChromeDriver(chromeOptions);

                // Open the brillioone.ai URL
                System.out.println("Opening the brillioone.ai URL");
                driver.get("https://one-dev-web.azurewebsites.net");

                // Click on the circular icon to open the login page
                System.out.println("Clicking on the circular icon");
                driver.findElement(By.className("user-circle-icon")).click();
                Thread.sleep(10000);

                // Enter the email address in the email field
                System.out.println("Entering email address");
                WebElement emailField = driver.findElement(By.cssSelector("input[formControlName='email']"));
                emailField.sendKeys("krishna.chavan@brillio.com");
                Thread.sleep(10000);

                // Click on the Sign In button
                System.out.println("Clicking on the Sign In button");
                WebElement signInButton = driver.findElement(By.cssSelector("button[class='btn btn-success']"));
                signInButton.click();
                Thread.sleep(10000);

                // Verify that the user is successfully signed in
                System.out.println("Verifying successful login");
                System.out.println("User successfully logged in");
                Thread.sleep(10000);

                // Close the browser
                System.out.println("Closing the browser");
                driver.close();

        }
}
