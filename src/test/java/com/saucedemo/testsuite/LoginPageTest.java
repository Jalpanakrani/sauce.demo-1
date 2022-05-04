package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.saucedemo.pages.HomePage;


public class LoginPageTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();


    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();


        homePage.clickOnLoginButton();
        String expectedMessage = "PRODUCTS";
        String actualMessage = loginPage.getPRODUCTSText();
        Assert.assertEquals(actualMessage,expectedMessage, "Login page not displayed");
    }
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage= "6 Products are displayed on the page";
        String actualErrorMessage =loginPage.getPRODUCTSText();

        Assert.assertEquals(actualErrorMessage,expectedErrorMessage,"Error message not displayed");
    }

}
