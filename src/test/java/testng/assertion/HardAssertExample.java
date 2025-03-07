package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {

    @Test
    public void verifySauceDemoApplication(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        WebElement swagLabsElement = driver.findElement(By.xpath("//div[text()='Swag Labs']"));
        Assert.assertTrue(swagLabsElement.isDisplayed(), "swag Labs Element should displayed");
        WebElement productElement = driver.findElement(By.xpath("//span[text()='Products']"));
        Assert.assertEquals(productElement.getText(), "Products", "swag Labs Element should displayed");
        driver.close();
    }
}
