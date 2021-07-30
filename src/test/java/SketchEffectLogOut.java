import Base.LogoutUserBase;
import PageObjects.SignUpDialog;
import PageObjects.SketchLanding;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SketchEffectLogOut extends LogoutUserBase {
    @Test
    void verifiyLogOutState(){
        SketchLanding landing = new SketchLanding();
        landing.openPage();
        SoftAssert softAssert = new SoftAssert();
        SignUpDialog signUpDialog = landing.bannerButtonLogOutClick();
        softAssert.assertTrue(signUpDialog.isOpened(), "Sign up dialog does not open");
        signUpDialog.closePopup();
        signUpDialog = landing.secondSectionButtonLogOutClick();
        softAssert.assertTrue(signUpDialog.isOpened(), "Sign up dialog does not open");
        signUpDialog.closePopup();
        signUpDialog = landing.thirdSectionButtonLogOutClick();
        softAssert.assertTrue(signUpDialog.isOpened(), "Sign up dialog does not open");
        signUpDialog.closePopup();
        signUpDialog = landing.forthSectionButtonLogOutClick();
        softAssert.assertTrue(signUpDialog.isOpened(), "Sign up dialog does not open");
        softAssert.assertAll();

    }
}
