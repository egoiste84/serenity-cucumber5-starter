package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LoginPage extends PageObject {
    public void verifyTitle() {
        String title = getDriver().getTitle();
        Assert.assertTrue(title.contains("Madskil - The #1 Social Game For Live Video Game Streams"));
    }
    public void clickToGuestButton() {
        waitForCondition().until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='styles__ContinueGuest-kSsyHt oeyqt']"))).click();
    }
    public void confirmToPlayGuestButton() {
        waitForCondition().until(ExpectedConditions.elementToBeClickable(By.xpath("//span[.='Play as guest anyway']\n"))).click();
    }
    public void clickOnNextButton() {
        waitForCondition().until(ExpectedConditions.elementToBeClickable(By.xpath("//span[.='next']\n"))).click(); }
    public void clickOnEnjoyButton() {
        waitForCondition().until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div/div[2]/button[3]/span"))).click();
    }
    public void clickCloseCookiePanelButton() {
        waitForCondition().until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='styles__CloseButton-kxzKQm iAARLt']"))).click();
    }
    public void clickUnmuteButton() {$(By.xpath("//button[@class='styles__Button-jKFQKZ VTUDU']")).click();}
    public void clickSettingsButton() {waitForCondition().until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='styles__StyledSettingsButton-cHNZcb fXPuHb']"))).click();}
    public void clickFBLoginButton() {$(By.xpath("//button[@class='styles__ConnectButton-iiSTOb FUBWa']//span[contains(text(),'Connect')]")).click();}
    public void enterValidCredentials() throws InterruptedException {
        ArrayList<String> newTab = new ArrayList (getDriver().getWindowHandles());
        getDriver().switchTo().window(newTab.get(1));
        WebElementFacade username = $(By.xpath("//*[@id=\"email\"]"));
        username.typeAndTab("soulstar1984@gmail.com");
        WebElementFacade password = $(By.xpath("//*[@id=\"pass\"]"));
        password.typeAndEnter("31071984Den");
        Thread.sleep(2000);
        getDriver().switchTo().window(newTab.get(0));
    }
    public void verifyUserID() {
//        try { Thread.sleep(1000); }
//        catch (InterruptedException e) {
//            e.printStackTrace(); }
        assertEquals("USER ID: 2575", $(By.xpath("//span[@class='styles__Text-bCbbQf emvNjm']")).getText());}
    public void clickLogoutButton() {$(By.xpath("//span[contains(text(),'log out')]")).click();}
    public void verifyEndURL() {
        waitForCondition().until(ExpectedConditions.urlMatches("https://madskil.com/lobby/FORTNITE"));

    }
    public void clickFacebook2Button() {
        waitForCondition().until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='styles__Button-fDHFLd dJJZch']//span[contains(text(),'Connect')]"))).click();
    }
    public void clickFacebook3Button() {
        waitForCondition().until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='styles__ConnectButton-gmkjKx eHaBol']//span[contains(text(),'Connect')]"))).click();
    }
}
