package techproed.tests;

import org.testng.annotations.*;

//Suite>Test>Groups>Class>Method
public class Day13_TestNGAnnotations {
//1st Suite
    @BeforeClass
    public void afterClass(){
        System.out.println("After Class");
    }
    @AfterClass
    public void beforeClass(){
        System.out.println("After Class");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }



@BeforeMethod // same as j unit
public void setUp(){
    System.out.println("Before Method");
}
@AfterMethod
public void tearDown(){
    System.out.println("After Method");
}


    @Test(priority = 2)
    public void test1(){
        System.out.println("test1");
    }
    @Test@Ignore
    public void test2(){
        System.out.println("test2");
    }
    @Test(enabled = false)
    public void test3(){
        System.out.println("test3");
    }
    @Test(priority = 1)
    public void test4(){
        System.out.println("test4");
    }
    @Test(priority = 3)
    public void test5(){
        System.out.println("test5");
    }

    @Test
    public void test6(){
        System.out.println("test6");
    }



}
