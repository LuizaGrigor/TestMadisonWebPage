package Pages;

import helper.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{

    // constructor send driver to PageFactory
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css="div.account-cart-wrapper > a.skip-account")
    public WebElement account;

    @FindBy(css="#header-account > div > ul > li.last > a")
    public WebElement myAccount;

    @FindBy(css="#email")
    public WebElement emailAdress;

    @FindBy(id="pass")
    public WebElement password;

    @FindBy(id="send2")
    public WebElement loginButton;

    @FindBy(css=".dashboard .welcome-msg strong")
    public WebElement welcomeText;

    @FindBy(id="advice-required-entry-pass")
    public WebElement requierdPassword;

    @FindBy(id="advice-required-entry-email")
    private WebElement requierdEmail;

    public void clickAccountTab()
    {
        account.click();
    }

    public void clickMyAccountTab()
    {
        myAccount.click();
    }

    public void completeEmail()
    {
        emailAdress.sendKeys(Constants.email);
    }

    public void completePassword()
    {
        password.sendKeys(Constants.password);
    }

    public void submitLoginForm()
    {
        loginButton.click();
    }

    public String welcomeText()
    {
        return welcomeText.getText();
    }

    public String errorLoginWithoutPassword()
    {
        return requierdPassword.getText();
    }

    public String errorLoginWithoutEmail()
    {
        return requierdEmail.getText();
    }

    public void login()
    {
        clickAccountTab();
        clickMyAccountTab();
        completeEmail();
        completePassword();
        submitLoginForm();
    }

    public void loginWithoutPasswordTest()
    {
        clickAccountTab();
        clickMyAccountTab();
        completeEmail();
        submitLoginForm();
    }

    public void loginWithoutEmailTest()
    {
        clickAccountTab();
        clickMyAccountTab();
        completePassword();
        submitLoginForm();
    }

}