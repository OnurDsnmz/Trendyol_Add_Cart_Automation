package constans;

import org.openqa.selenium.By;

public class ConstantsHomePage {
    public static final By SEARCH_INPUT = By.className("search-box"); //Arama input elementi
    public static final By BTN_SIGN_IN = By.className("link-text"); //Giriş yap butonu
    public static final By BTN_MODAL_CLOSE = By.className("modal-close"); //Ana sayfadaki modali kapatma butonu
    public static final By USER_NAME = By.cssSelector(".user-loggedin-container .user-name"); //anasayfadaki drop menüdeki email elementi
    public static final By ACC_DROP_MENU = By.xpath("//*[@id=\"account-navigation-container\"]/div/div[1]"); //anasayfa drop menü
    public static final String EMAIL = "can.yondem.22@gmail.com";
}
