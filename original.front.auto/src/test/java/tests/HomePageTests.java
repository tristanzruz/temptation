package tests;

import org.testng.annotations.Test;

public class HomePageTests extends BaseTest {



    @Test
    public void HomePage(){

        pages.HomePage homePage = new pages.HomePage(driver);

        homePage.navigateToHomePage();

       // homePage.clickOverCancunResortMenuOption();


    }

    @Test
    public void CancunResort(){

        pages.HomePage homePage = new pages.HomePage(driver);

        homePage.navigateToHomePage();

        homePage.clickOverCancunResortMenuOption();


    }

}
