package testng.basicoftestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGIntroduction {

    public static WebDriver driver;

    @BeforeMethod
    public void preRequsite(){
        driver = new ChromeDriver();
    }

    @Test
    public void edsoServices() {
        driver.get("https://edso.in/");
    }

    @Test
    public void tataConsultancyServices() {
        driver.get("https://tcs.com/");
    }

    @AfterMethod
    public void closedBrowser(){
        driver.close();
    }

}
