package PageObjects;

import Base.PageBase;
import Configs.DriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SketchLanding extends PageBase {
    @FindBy(css="[data-test='action-button-1-From-Photo-to-Sketch-in-One-Simple-Step']")
    WebElement bannerButton;

    @FindBy(css="[data-test='action-button-2-Create-a-Sketch-Drawing-in-Seconds']")
    WebElement secondSectionButton;

    @FindBy(css="[data-test='by-changing-the-background-hypertext']")
    WebElement changingHyperTextLink;

    @FindBy(css="[data-test='action-button-3-Choose-Any-Color-Line-or-Background']")
    WebElement thirdSectionButton;

    @FindBy(css="[data-test='action-button-4-Pick-From-Four-Sketch-Effects']")
    WebElement forthSectionButton;


    //Clicking methods
    public String bannerButtonClick(){
        click(bannerButton);
        return getCurrentURl();
    }

    public String changingHyperTextLinkClick(){
        click(changingHyperTextLink);
        switchTo(1);
        return getCurrentURl();
    }

    public String secondSectionButtonClick(){
        click(secondSectionButton);
        return getCurrentURl();
    }

    public String thirdSectionButtonClick(){
        click(thirdSectionButton);
        return getCurrentURl();
    }

    public String forthSectionButtonClick(){
        click(forthSectionButton);
        return getCurrentURl();
    }

    ////

    public SignUpDialog bannerButtonLogOutClick(){
        click(bannerButton);
        return new SignUpDialog();
    }

    public SignUpDialog secondSectionButtonLogOutClick(){
        click(secondSectionButton);
        return new SignUpDialog();
    }

    public SignUpDialog thirdSectionButtonLogOutClick(){
        click(thirdSectionButton);
        return new SignUpDialog();
    }

    public SignUpDialog forthSectionButtonLogOutClick(){
        click(forthSectionButton);
        return new SignUpDialog();
    }



    @Override
    public void openPage() {
        DriverUtils.driver.get(HOST+"/photo-effects/sketch");

    }
}
