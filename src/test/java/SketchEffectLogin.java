import Base.LoginUserBase;
import PageObjects.SketchLanding;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SketchEffectLogin extends LoginUserBase {


    @Test
    void verifiyLoginState(){
        SketchLanding landing = new SketchLanding();
        landing.openPage();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(landing.bannerButtonClick(),"https://picsartstage2.com/create/chooser?category=sketch-effects&redirect=editor");
        landing.openPage();
        softAssert.assertEquals(landing.secondSectionButtonClick(),"https://picsartstage2.com/create/chooser?category=sketch-effects&redirect=editor");
        landing.openPage();
        softAssert.assertEquals(landing.changingHyperTextLinkClick(),"https://picsartstage2.com/background-changer");
        landing.openPage();
        softAssert.assertEquals(landing.thirdSectionButtonClick(),"https://picsartstage2.com/create/chooser?category=sketch-effects&redirect=editor");
        landing.openPage();
        softAssert.assertEquals(landing.forthSectionButtonClick(),"https://picsartstage2.com/create/chooser?category=sketch-effects&redirect=editor");
        landing.openPage();
        softAssert.assertAll();
    }


}
