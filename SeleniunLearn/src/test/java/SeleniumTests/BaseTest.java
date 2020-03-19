package SeleniumTests;

import TestData.TestConstants;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    protected static WebDriver driver;
    protected static TestConstants testConstants;

    protected String navigateToHomePage(){
        driver.navigate().to(TestConstants.TestData.HOME_URL);

        return("exito");
    }
}
