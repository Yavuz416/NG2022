package techproed.tests;

import com.beust.ah.A;
import org.testng.annotations.Test;
import techproed.pages.AddressLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day15_AddressPage {
AddressLoginPage addressLoginPage = new AddressLoginPage();

@Test
    public void loginTest(){
    Driver.getDriver().get(ConfigReader.getProperty("address_url"));
    //Sening username password and clicking password
    addressLoginPage.username.sendKeys(ConfigReader.getProperty("address_username"));
    addressLoginPage.password.sendKeys(ConfigReader.getProperty("address_password"));
    addressLoginPage.loginButton.click();



}



}
