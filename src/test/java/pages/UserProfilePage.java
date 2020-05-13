package pages;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class UserProfilePage extends PageObject {
    public void verifyUSer() {
        String url = getDriver().getCurrentUrl();
        Assert.assertTrue((url.contains("https://streamers.zone/ninja/")));
        System.out.println(getDriver().getTitle());
    }
}
