package testng.basicoftestng;

import org.testng.Assert;
import org.testng.annotations.Test;


public class PriorityExample {

    @Test(priority = 1, groups = {"smoke"})
    public void testCaseZ() {
        System.out.println("Test Case Z");
    }

    @Test(priority = 'c')
    public void testCaseA() {
        Assert.assertTrue(false);
        System.out.println("Test Case A");
    }

    @Test(enabled = true)
    public void testCaseM() {
        Assert.assertTrue(false);
        System.out.println("Test Case M");
    }

    @Test(priority = -4, groups = {"smoke"})
    public void testCaseG() {
        System.out.println("Test Case G");
    }

    @Test(priority = 5)
    public void testCaseC() {
        System.out.println("Test Case C");
    }

    @Test(priority = -6, groups = {"smoke"})
    public void testCaseS() {
        System.out.println("Test Case S");
    }
}
