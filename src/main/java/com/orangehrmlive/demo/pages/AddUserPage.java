package com.orangehrmlive.demo.pages;

/**
 * User Role Drop Down, Employee Name, Username, Status Drop Down,
 * Password, Confirm Password,
 * Save and Cancole Button Locators and it's actions
 */
import com.orangehrmlive.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddUserPage extends Utility {

    private static Logger log = LogManager.getLogger(AddUserPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']" )
    WebElement addUserText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[2]/div/div[2]/div/div/div[2]/i")
    WebElement userRole;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']" )
    WebElement employeeName;

    @CacheLookup
    @FindBy(xpath="//[@class='oxd-select-wrapper']//[contains(text(),'Enabled')]")
    WebElement status;

    @CacheLookup
    @FindBy(xpath = "//input[@class='oxd-input oxd-input--focus']" )
    WebElement username;

    @CacheLookup
    @FindBy(css = "div[class='oxd-grid-item oxd-grid-item--gutters user-password-cell'] div[class='oxd-input-group oxd-input-field-bottom-space'] div input[type='password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(xpath = "//font[contains(text(),'Save')]")
    WebElement saveButton;

    @CacheLookup
    @FindBy(id = "app")
    WebElement successfulText;

    public String getAddUserText(){
        log.info("Getting Add User Text " + addUserText.toString());
        return getTextFromElement(addUserText);
    }

    public void selectUserRole(String value){
        log.info("Select user Role " + userRole.toString());
        selectByVisibleTextFromDropDown(userRole, value);
    }

    public void enterEmployeeName(String value){
        log.info("Enter Employee Name " + employeeName.toString());
        sendTextToElement(employeeName, value);
    }

    public void selectStatus(String value){
        log.info("Select Status " + status.toString());
        selectByVisibleTextFromDropDown(status, value);
    }

    public void enterUserName1(String value){
        log.info("Enter UserName " + username.toString());
        sendTextToElement(username, value);
    }

    public void enterPassword1(String value){
        log.info("Enter password " + password.toString());
        sendTextToElement(password, value);
    }
    public void enterConfirmPassword(String value){
        log.info("Enter password " + confirmPassword.toString());
        sendTextToElement(confirmPassword, value);
    }

    public void clickOnSaveButton(){
        log.info("Click on save button " + saveButton.toString());
        clickOnElement(saveButton);
    }

    public String getSuccessfulText(){
        log.info("Getting successful text " + successfulText.toString());
        return getTextFromElement(successfulText);
    }


}
