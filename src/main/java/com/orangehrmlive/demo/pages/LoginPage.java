package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Store username, password, Login Button and LOGIN Panel text Locators and create appropriate methods for it.
 */
public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")
    WebElement userName;
    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]")
    WebElement passWard;


    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")
    WebElement clickOnLogin;

    public void enterUserName(String value) throws InterruptedException {

        log.info("Enter username " + userName.toString());
        sendTextToElement(userName,value);


    }
    public void enterPassWord(String  value) throws InterruptedException {

        log.info("Enter password " + passWard.toString());
        sendTextToElement(passWard, value);
    }

    public void setClickOnLogin() throws InterruptedException {

        log.info("Click On login Button " + clickOnLogin.toString());
        clickOnElement(clickOnLogin);
    }

    public void loginDetail(String username, String password) throws InterruptedException {
        enterUserName(username);
        enterPassWord(password);
        setClickOnLogin();
    }


}
