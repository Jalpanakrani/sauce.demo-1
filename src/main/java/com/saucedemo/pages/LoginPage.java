package com.saucedemo.pages;


import org.openqa.selenium.By;
import com.saucedemo.utility.Utility;

/**
 * Created by Jay Vaghani
 */
public class LoginPage extends Utility {
    By username = By.id("txtUsername");
    By password = By.name("txtPassword");
    By loginbutton = By.className("button");
    By PRODUCTSText = By.xpath("//span[contains(text(),'Products')]");

    public void enterUserName(String standard_user){
        clickOnElement(username);
    }
    public  void enterPassword(String secret_sauce){
        clickOnElement(password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginbutton);
    }
    public String getPRODUCTSText(){
        return getPRODUCTSText();
    }

    }





