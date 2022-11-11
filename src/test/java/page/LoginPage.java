package page;

import base.BasePage;
import org.openqa.selenium.WebDriver;

import static constans.ConstansLoginPage.*;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void sendEmail(){
        sendKeys(INPUT_EMAIL,EMAIL);
    }

    public void sendPassword(){
        sendKeys(INPUT_PASSWORD,PASSWORD);
    }

    public void clickLogin(){
        clickElement(BTN_LOGIN);
    }


}
