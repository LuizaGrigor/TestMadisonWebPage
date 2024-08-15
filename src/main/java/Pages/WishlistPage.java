package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage
{


    private WebDriver drive;

    // constructor send driver to PageFactory
    public WishlistPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.drive = driver;
    }

    @FindBy(css="li.nav-6 > a.level0")
    public WebElement vipProducts;

    @FindBy(css="h2.product-name > a")
    public WebElement productLink;

    @FindBy(css = "div.add-to-cart-buttons > button")
    public WebElement buttonCart;

    @FindBy(css = "li.success-msg > ul > li > span")
    public WebElement successMessage;

    @FindBy(css = "a.link-wishlist" )
    public WebElement buttonWishlist;

    public String getProductName()
    {
        return  productLink.getText();
    }

    public void listVipProducts()
    {
        vipProducts.click();
    }

    public void clickDetailsProduct()
    {
        productLink.click();
    }

    public void addCart()
    {
        buttonCart.click();
    }

    public String getSuccessAdded()
    {
        return successMessage.getText();
    }

    public void addWishlist()
    {
        buttonWishlist.click();
    }

//    public String getSuccessAdded()
//    {
//        return wishlistVipPage.getText();
//    }

    public void addToCartVipProduct()
    {
        listVipProducts();
        clickDetailsProduct();
        addCart();
    }

    public void addToWishlist()
    {
        listVipProducts();
        clickDetailsProduct();
        addWishlist();
    }

    private void loginPage(WebDriver drive)
    { }
}