package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class BaseTest {

    public WebDriver driver;

    @BeforeClass
    public void setup(){

        driver=new ChromeDriver();

        driver.manage().window().maximize();
    }

    @AfterClass
    public void teardown(){
        driver.quit();
    }

}
