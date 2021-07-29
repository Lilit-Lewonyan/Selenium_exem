import Base.LoginUserBase;
import PageObjects.SketchLanding;
import org.testng.annotations.Test;

public class SketchEffectLogin extends LoginUserBase {


    @Test
    void verifiyLoginState(){
        SketchLanding landing = new SketchLanding();
        landing.openPage();
    }


}
