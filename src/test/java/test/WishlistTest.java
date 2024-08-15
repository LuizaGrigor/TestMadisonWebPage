package test;

import Pages.LoginPage;
import Pages.WishlistPage;
import helper.Constants;
import org.junit.Assert;
import org.junit.Test;

public class WishlistTest extends BaseTest
{

    @Test
    public void addVipProductToCart()
    {
        WishlistPage addToCartVipPage = new WishlistPage(driver);

        addToCartVipPage.addToCartVipProduct();
        String actualText = addToCartVipPage.getSuccessAdded();
        String expectedText = addToCartVipPage.getProductName() + Constants.succesAddedToCart;
        Assert.assertEquals(expectedText.toLowerCase(), actualText.toLowerCase());
    }



}


