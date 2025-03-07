package testng.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NeedOfParameterization {

    public WebDriver driver;

    @Parameters("browserName")
    @BeforeMethod
    public void setup(String browserName){
        if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
            driver.get("https://www.google.in/");
        }else if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
            driver.get("https://www.google.in/");
        }else if (browserName.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
            driver.get("https://www.google.in/");
        }else {
            throw new RuntimeException("Please select the correct browser name");
        }
    }

    @Parameters({"courseName", "cityName"})
    @Test
    public void searchOfMultipleCities(String courseName, String cityName){
        driver.manage().window().maximize();
        WebElement searchTextBox = driver.findElement(By.name("q"));
        searchTextBox.sendKeys(courseName + " " + cityName);
        searchTextBox.sendKeys(Keys.ENTER);
    }
}
