package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.AdminPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.ViewSystemUserPage;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class UserSteps {

    @Given("I am on Homepage")
    public void iAmOnHomepage() {
    }

    @When("Login to Application")
    public void loginToApplication() throws InterruptedException {
        new LoginPage().enterUserName("Admin");
        new LoginPage().enterPassWord("admin123");
        new LoginPage().setClickOnLogin();
    }

    @Then("click On {string} Tab")
    public void clickOnTab(String value) {
        new AdminPage().clickOnAdmin();
    }

    @Then("Verify {string} Text")
    public void verifyText(String value) {
        // String actualText = new AdminPage().getSystemUserText();
        //Assert.assertEquals(actualText, "System Users");

    }

    @And("I click On {string} button")
    public void iClickOnButton(String value) {
        new AdminPage().clickOnAddButton();

    }

    @And("Select User Role {string}")
    public void selectUserRole(String Admin) {
        new AddUserPage().selectUserRole("Admin");
    }

    @And("enter Employee Name {string}")
    public void enterEmployeeName(String value) {
        new AddUserPage().enterEmployeeName("Paul Collings");
    }

    @And("enter Username")
    public void enterUsername() {
        new AddUserPage().enterUserName1("rikku");
    }

    @And("Select status {string}")
    public void selectStatus(String Enable) {
        new AddUserPage().selectStatus("Enabled");
    }

    @And("enter password")
    public void enterPassword() {
        new AddUserPage().enterPassword1("tamu@gmail.com");
    }

    @And("enter Confirm Password")
    public void enterConfirmPassword() {
        new AddUserPage().enterConfirmPassword("tamu@gmail.com");
    }

    @And("click On {string} Button")
    public void clickOnButton(String value) {
        new AddUserPage().clickOnSaveButton();

    }

    @And("verify message {string}")
    public void verifyMessage(String message) {
        String actualText1 = new AddUserPage().getSuccessfulText();
        Assert.assertEquals(actualText1, "Successfully Saved");
    }

    @And("Select User Role")
    public void selectUserRole() {
        new AddUserPage().selectUserRole("Admin");

    }

    @And("Select Status")
    public void selectSatatus() {
        new AddUserPage().selectStatus("Enabled");

    }

    @And("Verify the User should be in Result list.")
    public void verifyTheUserShouldBeInResultList() {
        new ViewSystemUserPage().setVerifyTheResult();
    }

    @And("Click on Check box")
    public void clickOnCheckBox() {
        new ViewSystemUserPage().setTickOnCheckbox();
    }

    @And("Click on Delete Button")
    public void clickOnDeleteButton() {
        new ViewSystemUserPage().setClickOnDeleteButton();
    }

    @And("Popup will display")
    public void popupWillDisplay() {
        new ViewSystemUserPage().verifyThePopUpWindowIsDisplayed();
    }

    @And("Click on Ok Button on Popup")
    public void clickOnOkButtonOnPopup() {
        new ViewSystemUserPage().clickOnYesButton();
    }

//    @And("Enter Username {string}")
//    public void enterUsername(String value) {
//        new LoginPage().enterUserName("Admin");
//    }

    @And("Verify username <username>")
    public void verifyUsernameUsername() {
        new ViewSystemUserPage().verifyUsernameLabel("rikku");
    }

    @And("Click on Reset Tab")
    public void clickOnResetTab() {
        new ViewSystemUserPage().clickOnReSetButton();
    }


    @And("Click on {string} Tag")
    public void clickOnTag(String value) {
        new ViewSystemUserPage().clickOnSearchButton();
    }
}