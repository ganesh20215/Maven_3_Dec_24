package testng.basicoftestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExample {

    @Test
    public void loginFunctionality(){
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "loginFunctionality")
    public void verifyHomePage(){
        System.out.println("Home Page Validation");
    }

    @Test
    public void onboarding(){
        System.out.println("Onboarding");
    }
}
