package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ViewSystemUserPage extends Utility {
    private static final Logger log = LogManager.getLogger(ViewSystemUserPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']" )
    static WebElement verifyAddUserText;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']" )
    WebElement enterEmployeeName;
    @CacheLookup
    @FindBy(xpath = "//input[@class='oxd-input oxd-input--focus']" )
    WebElement enterTheUserName;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Disabled')]")
    WebElement selectDisable;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(xpath = "//font[contains(text(),'Save')]")
    WebElement clickOnSaveButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[2]/div/div[2]/div/div/div[2]/i")
    WebElement userRoleSelect;
    @CacheLookup
    @FindBy(xpath="//[@class='oxd-select-wrapper']//[contains(text(),'Enabled')]")
    WebElement selectEnable;
    @CacheLookup
    @FindBy(xpath = "(//button[normalize-space()='Search'])[1]")
    WebElement searchButton;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Cheeku123')]")
    WebElement  verifyTheResult;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-table-card-cell-checkbox']//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
    WebElement   tickOnCheckbox ;
    @CacheLookup
    @FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
    WebElement   clickOnDeleteButton;
    @CacheLookup
    @FindBy(xpath = ("(//div[@role='document'])[1]"))
    WebElement popUpWindow;

    @CacheLookup
    @FindBy(xpath = ("//button[normalize-space()='Yes, Delete']"))
    WebElement yesButton;

    @CacheLookup
    @FindBy(xpath = ("//button[normalize-space()='Reset']"))
    WebElement reSetButton;
    @CacheLookup
    @FindBy(xpath = ("//label[normalize-space()='Username']"))
    WebElement verifyUsernameLabel;
    @CacheLookup
    @FindBy(xpath = ("//span[normalize-space()='No Records Found']"))
    WebElement noRecordFound;

    public String setVerifyAddUserText() {
        log.info("Getting Add user Text " + verifyAddUserText.toString());
        return getTextFromElement(verifyAddUserText);
    }
    public void setEnterEmployeeName(String employeeName){
        log.info("Add employee name " + enterEmployeeName.toString());
        sendTextToElement(enterEmployeeName, employeeName);
    }
    public void setEnterTheUserName(String userName){
        log.info("Enter username Text " + enterTheUserName.toString());
        sendTextToElement(enterTheUserName,userName);

    }
    public void setSelectDisable(){
        log.info("Select status " + selectDisable.toString());
        selectByIndexFromDropDown(selectDisable,0);

    }
    public void setConfirmPassword(String password){
        log.info("Enter confirm password " + confirmPassword.toString());
        sendTextToElement(confirmPassword,password);
    }
    public void setClickOnSaveButton(){
        log.info("Click on save button " + clickOnSaveButton.toString());
        clickOnElement(clickOnSaveButton);
    }
    public void setUserRoleSelect(String value){
        log.info("Select user Role " + userRoleSelect.toString());
        selectByVisibleTextFromDropDown(userRoleSelect ,value);
    }

    public void selectStatusEnable(String value){
        log.info("Select status " + userRoleSelect.toString());
        selectByVisibleTextFromDropDown(selectEnable,value);
    }

    public void clickOnSearchButton(){
        log.info("Click on search button " + searchButton.toString());
        clickOnElement(searchButton);
    }
    public String setVerifyTheResult(){
        log.info("Getting verify text " + verifyTheResult.toString());
        return getTextFromElement(verifyTheResult);
    }
    public void setTickOnCheckbox() {
        log.info("Tick checkbox button " + tickOnCheckbox.toString());
        clickOnElement(tickOnCheckbox);
    }
    public void setClickOnDeleteButton(){
        log.info("Click on delete Button " + clickOnDeleteButton.toString());
        clickOnElement(clickOnDeleteButton);
    }
    public void verifyThePopUpWindowIsDisplayed() {
        log.info("Popup window " + popUpWindow.toString());
        verifyThatElementIsDisplayed(popUpWindow);
    }

    public void clickOnYesButton() {
        log.info("Click on Yes button " + yesButton.toString());
        clickOnElement(yesButton);
    }

    public void verifyNoRecordFoundMessage(String text) {
        log.info("Verify message " + noRecordFound.toString());
        verifyThatTextIsDisplayed(noRecordFound, text);
    }

    public void verifyUsernameLabel(String text) {
        log.info("Verify username label " + verifyUsernameLabel.toString());
        verifyThatTextIsDisplayed(verifyUsernameLabel, text);
    }

    public void clickOnReSetButton() {
        log.info("click on reset " + reSetButton.toString());
        clickOnElement(reSetButton);
    }

}
