package com.saucedemo.pages;


import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By username = By.id("txtUsername");
    By password = By.name("txtPassword");
    By loginbutton = By.className("button");

    public void enterUserName(){
        clickOnElement(username);
    }

    public  void enterPassword(){
        clickOnElement(password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginbutton);
    }

}
