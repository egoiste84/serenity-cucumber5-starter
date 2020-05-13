package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.HomePage;
//import pages.ProfilePage;

public class LoginToApp {
    @Steps
    HomePage home;
//    @Steps
//    ProfilePage profile;
    @Given("I am on home page")
    public void user_is_on_home_page() { home.openApp(); }

    @And("I decide to play as guest")
    public void iPlayAsGuest() {
        home.goAsGuest();
    }

    @Then("I confirm to play as guest")
    public void iClickOnConfirmGuestButton() {
        home.confirmToPlayGuest();
    }

    @Then("I see How to Play popup and click Next button")
    public void iClickNextButton() {
        home.clickNextButton();
    }

    @Then("I see second slide and close the the popup")
    public void iClickEnjoyButton() {home.clickEnjoyButton(); }

    @And("I want to close cookie panel")
    public void iClickCloseCookiePanelButton() {home.closeCookiePanelButton();}

    @And("I want to unmute")
    public void iClickUnmuteButton() {home.unmuteButton();}

    @When("I open settings panel")
    public void iClickSettingsButton() {home.settingsButton();}

    @And("I want to login via Facebook")
    public void iClickFBLoginButton() {home.facebookButton();}

    @When("I enter valid credentials I login to Facebook")
    public void iEnterValidCredentials() {
        try {
            home.validCredentials();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("I open settings panel and see Logout button")
    public void iClickSettingsButton2() {home.settingsButton();}

    @And("I verify UserID")
    public void iVerifyUserID() {home.verifyID();}

    @Then("I click on logout button")
    public void iClickOnLogoutButton() {home.logoutButton();}

    @And("I go back to the login screen")
    public void iGoBackToTheLoginScreen() {home.verifyURL();}

    @And("I want to login using Facebook")
    public void iWantToLoginUsingFacebook() {home.clickOnFacebook2();}

    @Then("I decide to login using Facebook")
    public void iDecideToLoginUsingFacebook() {home.clickOnFacebook3();}
}
