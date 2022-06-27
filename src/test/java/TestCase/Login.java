package TestCase;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class Login {
    @Test
    public void FirstTest() throws InterruptedException {
        // Set WebDriver
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.demoblaze.com/");

        WebDriverWait wait = new WebDriverWait(driver, 5);

        // Ensure State
        WebElement Login = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login2")));
        driver.findElement(By.id("login2")).click();

        Thread.sleep(1000);

        driver.findElement(By.id("loginusername")).sendKeys("siloam");
        driver.findElement(By.id("loginpassword")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();

        Thread.sleep(1000);

        driver.quit();
    }
}
