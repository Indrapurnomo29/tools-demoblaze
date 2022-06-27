package TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertTrue;

public class Register {
    @Test
    public void FirstTest() throws InterruptedException {
        // Set WebDriver
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.demoblaze.com/");

        WebDriverWait wait = new WebDriverWait(driver, 5);

        // Ensure State
        WebElement SignUp = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("signin2")));
        driver.findElement(By.id("signin2")).click();

        Thread.sleep(1000);

        driver.findElement(By.id("sign-username")).sendKeys("siloam");
        driver.findElement(By.id("sign-password")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();

        Thread.sleep(1000);

        driver.quit();
    }
}
