package techproed.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertTest {
    @Test
            public void softAssertTest(){
        SoftAssert sa = new SoftAssert();
        System.out.println("Line 8");
        sa.assertEquals(4,5);
        System.out.println("Line 12");
        sa.assertAll();
    }

}
