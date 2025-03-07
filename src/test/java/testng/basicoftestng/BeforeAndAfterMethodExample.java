package testng.basicoftestng;

import org.testng.annotations.*;

public class BeforeAndAfterMethodExample {

    @BeforeMethod
    public void setup(){
        System.out.println("before method");
    }

    @Test
    public void testCase1(){
        System.out.println("test case 1");
    }

    @Test
    public void testCase2(){
        System.out.println("test case 2");
    }

    @Test
    public void testCase3(){
        System.out.println("test case 3");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("After Method");
    }

    @BeforeClass
    public void beforeClassExample(){
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClassExample(){
        System.out.println("After Class");
    }
}
