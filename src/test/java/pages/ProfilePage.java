package pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class ProfilePage extends PageObject {
    UserProfilePage profilePage;
    @Step
    public void verifyPage() {
        profilePage.verifyUSer();
    }
}
