package techproed.tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day14_FirstDriverClass  {
    @Test
    public void firstDriver(){
        Driver.getDriver().get("https://www.techproeducation.com");
       // Driver.getDriver().get("url_test_techproed");
        Driver.closeDriver();

    }
}
