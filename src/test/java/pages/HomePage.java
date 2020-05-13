package pages;

import net.thucydides.core.annotations.Step;

public class HomePage {
    LoginPage homePage;
    @Step
    public void openApp() {
        homePage.open();
        homePage.verifyTitle();
    }
    @Step
    public void goAsGuest() {
        homePage.clickToGuestButton();
    }
    @Step
    public void confirmToPlayGuest() {
        homePage.confirmToPlayGuestButton();
    }
    @Step
    public void clickNextButton() {
        homePage.clickOnNextButton();
    }
    @Step
    public void clickEnjoyButton() {
        homePage.clickOnEnjoyButton();
    }
    @Step
    public void closeCookiePanelButton() {
        homePage.clickCloseCookiePanelButton();
    }
    @Step
    public void unmuteButton() {
        homePage.clickUnmuteButton();
    }
    @Step
    public void settingsButton() {
        homePage.clickSettingsButton();
    }
    @Step
    public void facebookButton() {
        homePage.clickFBLoginButton();
    }
    @Step
    public void validCredentials() throws InterruptedException {
        homePage.enterValidCredentials();
    }
    @Step
    public void verifyID() {
        homePage.verifyUserID();
    }
    @Step
    public void logoutButton() {
        homePage.clickLogoutButton();
    }
    @Step
    public void verifyURL() {
        homePage.verifyEndURL();
    }
    @Step
    public void clickOnFacebook2() {
        homePage.clickFacebook2Button();
    }
    @Step
    public void clickOnFacebook3() {
        homePage.clickFacebook3Button();
    }

}
