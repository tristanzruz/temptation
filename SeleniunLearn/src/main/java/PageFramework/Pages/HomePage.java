package PageFramework.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HomePage {
    private static WebElement element = null;

// create methods for each action on an specific page



    //selectors-- must be protected


    protected static WebElement getDestinyInput(WebDriver driver){

        element = driver.findElement(By.id("destination_place_name"));

        return element;

    }

}
