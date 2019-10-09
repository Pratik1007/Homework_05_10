import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestOnGeckoBrowser {
    public static void main(String[] args) throws IOException {
        String baseUrl = "https://demo.nopcommerce.com/";
//        WebDriver driver;

        System.setProperty("webdriver.gecko.driver","C:\\Users\\MISARI\\IdeaProjects\\selenium_Hw_05-10-2019\\drivers\\geckodriver.exe" );
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe"); //This is the location where you have installed Firefox on your machine

        WebDriver driver = new FirefoxDriver(options);
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.quit();
//        field elements for login link

        WebElement longinLink = driver.findElement(By.className("ico-login"));
        longinLink.click();

        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("rushto_pg2222@yahoo.co.in");

        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("abc123");

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginButton.click();
    }
}
