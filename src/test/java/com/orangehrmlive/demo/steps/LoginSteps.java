package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {
    @Given("I am on home page")
    public void iAmOnHomePage() {
    }

    @When("Enter username")
    public void enterUsername() throws InterruptedException {
        new LoginPage().enterUserName("Admin");
    }

    @Then("Enter password")
    public void enterPassword() throws InterruptedException {
        new LoginPage().enterPassWord("admin123");
    }

    @And("Click on Login Button")
    public void clickOnLoginButton() throws InterruptedException {
        new LoginPage().setClickOnLogin();
    }

    @And("Verify {string} Message")
    public void verifyMessage(String value) {
        new HomePage().displayLogoHome();
    }

    @When("Login To The application")
    public void loginToTheApplication() throws InterruptedException {
        new LoginPage().enterUserName("Admin");
        new LoginPage().enterPassWord("admin123");
        new LoginPage().setClickOnLogin();

    }

    @Then("Verify Logo is Displayed")
    public void verifyLogoIsDisplayed() {
        new HomePage().hrmLogo();
    }

    @Then("Click on User Profile logo")
    public void clickOnUserProfileLogo() {
        new DashboardPage().clickOnProfilePhoto();
    }

    @And("Mouse hover on {string} and click")
    public void mouseHoverOnAndClick(String value) {
        new DashboardPage().clickOnLogOut();
    }

    @And("Verify the text {string} is displayed")
    public void verifyTheTextIsDisplayed(String value) {
        new DashboardPage().getLoginPanel();
    }

    @When("Enter username {string}")
    public void enterUsername(String value) throws InterruptedException {
        new LoginPage().enterUserName("test123@gmail.com");
    }

    @Then("Enter password {string}")
    public void enterPassword(String value) throws InterruptedException {
        new LoginPage().enterPassWord("test123");
    }

    @And("Verify Error message {string}")
    public void verifyErrorMessage(String value) {
        new HomePage().getErrorMessage();
    }
}
