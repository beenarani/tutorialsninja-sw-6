package com.orangehrmlive.demo.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import com.orangehrmlive.demo.utilities.Utility;
/**
 * Dashboard text Locator and create appropriate methods for it.
 */
public class DashboardPage extends Utility {
    private static final Logger log = LogManager.getLogger(DashboardPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "(//img[@class='oxd-userdropdown-img'])[1]")
    WebElement profilePhoto;

    @CacheLookup
    @FindBy(xpath = "(//a[normalize-space()='Logout'])[1]")
    WebElement logOut;

    @CacheLookup
    @FindBy(xpath = "(//h5[normalize-space()='Login'])[1]")
    WebElement loginPanel;

    public void clickOnProfilePhoto(){
        clickOnElement(profilePhoto);
        log.info("Enter Profile Photo " + profilePhoto.toString());
    }
    public void clickOnLogOut(){
        clickOnElement(logOut);
        log.info("Click On logout " + logOut.toString());
    }

    public String getLoginPanel(){
        log.info("Getting loginpanel " + loginPanel.toString());
        return getTextFromElement(loginPanel);
    }
}
