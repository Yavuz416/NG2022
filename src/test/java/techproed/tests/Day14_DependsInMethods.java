package techproed.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day14_DependsInMethods {
    @Test
    public void homePage(){
        System.out.println("Home Page");
    }
    @Test
    public void LogInPage(){
        System.out.println("Login Page");
        Assert.assertTrue(false);
    }
    @Test   (dependsOnMethods = "LogInPage")
    public void checkOutPage(){
        System.out.println("Checkout Page");
    }
}
