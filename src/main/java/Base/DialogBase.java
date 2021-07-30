package Base;

import Configs.DriverUtils;
import Configs.WaitHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class DialogBase {
    public DialogBase(){
        PageFactory.initElements(DriverUtils.driver,this);
        WaitHelper.getWait().waitPageToBeLoaded();

    }

    protected void click(WebElement element){
        WaitHelper.getWait().elementToBeClickable(element);
        element.click();
    }

    public abstract boolean isOpened();

}
