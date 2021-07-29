package Configs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils {
    public static WebDriver webDriver;
    private  static  String path = "/Users/levonyanlilit/Downloads/chromedriver";

    public static void initDriver(){
        System.setProperty("webdriver.chrome.driver",path);
        webDriver = new ChromeDriver();
    }

    public static void quietDriver(){
        webDriver.close();
        webDriver.quit();
    }

}
