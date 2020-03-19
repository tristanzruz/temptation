package tests;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import pages.HomePage;


public class PriceTests extends BaseTest{


@Test
    public void HomePage(){

    HomePage homePage = new HomePage(driver);

    homePage.navigateToHomePage();

    homePage.clickOverSearchBox();


    }

}
