package Configs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.function.Function;
import java.util.function.Predicate;

public class WaitHelper {
    private WebDriverWait webDriverWait ;
    public  static WaitHelper getWait(){
        return new WaitHelper();
    }
    public WaitHelper(){webDriverWait = new WebDriverWait(DriverUtils.webDriver,20);}

    public  void waitPageToBeLoaded(){
        Predicate<WebDriver> pageLoaded = new Predicate<WebDriver>() {
            @Override
            public boolean test(WebDriver webDriver) {
                return ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete");
            }
        };
        webDriverWait.until((Function)pageLoaded);
    }

    public void elementToBeClickable(WebElement element){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }

}
