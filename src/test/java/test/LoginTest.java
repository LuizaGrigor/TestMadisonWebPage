package test;

import Pages.LoginPage;
import helper.Constants;
import org.junit.Assert;
import org.junit.Test;

public class LoginTest extends BaseTest
{

    @Test
    public void loginSuccess()
    {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login();


        String actualText = loginPage.welcomeText();

        String expectedText = Constants.expectedLoginMessage;

        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void loginWithoutPasswordTest()
    {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.loginWithoutPasswordTest();


        String actualText = loginPage.errorLoginWithoutPassword();

        String expectedText = Constants.errorRequiredField;

        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void loginWithoutEmailTest()
    {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.loginWithoutEmailTest();

        String actualText = loginPage.errorLoginWithoutEmail();

        String expectedText = Constants.errorRequiredField;

        Assert.assertEquals(expectedText, actualText);
    }

}


