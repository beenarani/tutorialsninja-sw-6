package com.orangehrmlive.demo.pages;

/**
 * Store OrangeHRM logo, Admin, PIM, Leave,Dashboard, Welcome Text locatores and create appropriate methods for it.
 */
import com.orangehrmlive.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']")
    WebElement hrmLogo;
    @CacheLookup
    @FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")
    WebElement verifyLoginPanel;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]")
    WebElement displayLogo;
    @CacheLookup
    @FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message'][normalize-space()='Required'])[1]")
    WebElement errorMessage;

    public String verifyLogin(){
        log.info("Verify Login " + verifyLoginPanel.toString());
        return getTextFromElement(verifyLoginPanel);

    }
    public void hrmLogo(){
        driver.findElement((By) hrmLogo).isDisplayed();
        log.info("Get hrm logo " + hrmLogo.toString());


    }
    public String displayLogoHome() {
        log.info("Display logo on home " + displayLogo.toString());
        return getTextFromElement(displayLogo);
    }
    public String getErrorMessage() {
        log.info("Getting error message " + errorMessage.toString());
        return getTextFromElement(errorMessage);

    }



}
