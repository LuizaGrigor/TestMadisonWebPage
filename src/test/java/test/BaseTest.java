package test;

import helper.Constants;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest
{
    protected WebDriver driver;

    @Before
    public void initializeDriver()
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        driver = new ChromeDriver(options);
        driver.get(Constants.url);
        driver.manage().window().maximize();
    }

    @After
    public void closeDriver()
        {
           driver.quit();
        }


}
