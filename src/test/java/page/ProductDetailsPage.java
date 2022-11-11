package page;

import base.BasePage;
import org.openqa.selenium.WebDriver;

import static constans.ConstansProductDetailsPage.*;

public class ProductDetailsPage extends BasePage {
    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetails() {
        return isDisplayed(BTN_ADD_CART,"sepete ekle");
    }

    public void addToCart(){
        clickElement(BTN_ADD_CART);
    }

    public void goToCart() {
        clickElement(BTN_CART);
    }

    public boolean isProductCountUp() {
        return isAddedProduct(PRODUCT_COUNTER);
    }
}
