package Base;

import Configs.DriverUtils;
import Configs.WaitHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;


public abstract class PageBase {
    protected final String HOST = "https://picsartstage2.com/";
    public PageBase(){
        PageFactory.initElements(DriverUtils.webDriver,this);
        WaitHelper.getWait().waitPageToBeLoaded();

    }

    protected void click(WebElement element){
        WaitHelper.getWait().elementToBeClickable(element);
        element.click();
    }

    protected String getCurrentURl(){
        WaitHelper.getWait().waitPageToBeLoaded();
        return DriverUtils.webDriver.getCurrentUrl();
    }

    protected void switchto(){
      //DriverUtils.webDriver.switchTo(DriverUtils.webDriver.getWindowHandles());
    }


   public abstract void  openPage();




}
