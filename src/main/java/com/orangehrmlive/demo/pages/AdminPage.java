package com.orangehrmlive.demo.pages;

/**
 * UserManagement, Job, Organization Tabs Locators and it's actions
 */
import com.orangehrmlive.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends Utility {
    private static final Logger log = LogManager.getLogger(AdminPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
    WebElement admin;

    @CacheLookup
    @FindBy(css = ".oxd-text.oxd-text--h5.oxd-table-filter-title")
    WebElement systemUserText;

    @CacheLookup
    @FindBy(css = "button[class='oxd-button oxd-button--medium oxd-button--secondary']")
    WebElement addButton;

    public void clickOnAdmin(){
        log.info("Click on Admin " + admin.toString());
        clickOnElement(admin);
    }

    public String getSystemUserText(){
        log.info("Getting system user text " + systemUserText.toString());
        return getTextFromElement(systemUserText);
    }

    public void clickOnAddButton(){
        log.info("Click on Add Button " + addButton.toString());
        clickOnElement(addButton);
    }



}
