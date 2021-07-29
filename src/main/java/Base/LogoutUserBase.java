package Base;

import Configs.DriverUtils;
import org.openqa.selenium.Cookie;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public  abstract class LogoutUserBase {
    @BeforeMethod
    public  void LogedInWithNewUser(){
        DriverUtils.initDriver();
        DriverUtils.webDriver.navigate().refresh();
    }

    @AfterMethod
    void closeDriver(){
        DriverUtils.quietDriver();
    }
}
