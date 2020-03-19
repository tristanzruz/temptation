package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.rmi.runtime.Log;
import testdata.TestConstants;

public class HomePage extends BasePage {

    private TestConstants constants;

    public HomePage (WebDriver driver) {
        super(driver);
    }

    //******Methods

    public HomePage navigateToHomePage(){

        driver.get(TestConstants.TestData.HOME_PAGE_URL);

        return this;
    }

    public void clickOverSearchBox(){

        click(HomePageSearchBox);
    }

//**************Selectors

    By HomePageSearchBox = By.xpath("//input[@placeholder='Destino']");
}
