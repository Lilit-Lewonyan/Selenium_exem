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
        PageFactory.initElements(DriverUtils.driver,this);
        WaitHelper.getWait().waitPageToBeLoaded();

    }

    protected void click(WebElement element){
        WaitHelper.getWait().elementToBeClickable(element);
        element.click();
    }

    protected String getCurrentURl(){
        WaitHelper.getWait().waitPageToBeLoaded();
        return DriverUtils.driver.getCurrentUrl();
    }

    protected void switchTo(int indexOFTab){
    List<String> windowes = (List<String>) DriverUtils.driver.getWindowHandles();
    DriverUtils.driver.switchTo().window(windowes.get(indexOFTab));
    WaitHelper.getWait().waitPageToBeLoaded();
    }


   public abstract void  openPage();




}
