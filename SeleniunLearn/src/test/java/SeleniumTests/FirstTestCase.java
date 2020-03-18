package SeleniumTests;

import PageFramework.Pages.HomePage;
import org.testng.annotations.Test;
import TestData.TestConstants;
import org.openqa.selenium.WebDriver;



public class FirstTestCase  {


WebDriver driver;
         HomePage homePage;
         //SeleniumTests.BaseTest baseTest;


        public class TestNG {

            @Test()
            public void caso1() {

                driver.navigate().to(TestConstants.TestData.HOME_URL);
            }
        }
    }


