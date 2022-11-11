package page;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;

import static constans.ConstantsHomePage.*;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void search(String text){
        sendKeys(SEARCH_INPUT,text);
        sendKeys(SEARCH_INPUT,Keys.ENTER);
    }

    public void closeModal(){
        clickElement(BTN_MODAL_CLOSE);
    }

    public void clickSignIn(){ clickElement(BTN_SIGN_IN); }

    public boolean isTrueEmail(){ return isDisplayed(USER_NAME,EMAIL); }

    public void hoverAccMenu(){
        hoverElement(ACC_DROP_MENU);
    }


}
