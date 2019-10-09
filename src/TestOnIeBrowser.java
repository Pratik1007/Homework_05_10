import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class TestOnIeBrowser {

// This program will run test on InternetExplorer Browser for checking 'Login' functionality of DemoNopCommerce

    public static void main(String[] args) {

        String baseUrl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.ie.driver", "C:\\Users\\MISARI\\IdeaProjects\\selenium_Hw_05-10-2019\\drivers\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
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
