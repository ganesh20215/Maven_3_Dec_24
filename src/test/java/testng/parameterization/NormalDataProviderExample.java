package testng.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NormalDataProviderExample {

    @DataProvider(name = "test data")
    public Object[][] dataProviderFun(){
        return new Object[][]{
                {"Selenium", "Delhi"}, {"Java", "Pune"}
        };
    }

    @Test(dataProvider = "test data")
    public void searchOfMultipleCities(String courseName, String cityName){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.in/");
        driver.manage().window().maximize();
        WebElement searchTextBox = driver.findElement(By.name("q"));
        searchTextBox.sendKeys(courseName + " " + cityName);
        searchTextBox.sendKeys(Keys.ENTER);
        driver.close();
    }
}
