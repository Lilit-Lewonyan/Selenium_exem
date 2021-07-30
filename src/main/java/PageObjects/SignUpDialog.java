package PageObjects;

import Base.DialogBase;
import Configs.WaitHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpDialog extends DialogBase {
    @FindBy(css="[data-test='sign_up_form']")
    WebElement signUpDialog;

    @FindBy(css="[data-test='modal-close']")
    WebElement dialogCloseButton;

    @Override
    public boolean isOpened() {

        return signUpDialog.isDisplayed();
    }

    public void closePopup(){
        click(dialogCloseButton);
    }

}
