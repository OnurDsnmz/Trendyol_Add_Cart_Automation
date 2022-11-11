package page;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static constans.ConstantsProductsPage.*;

public class ProductsPage extends BasePage {

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductsPage(String text){
        return isDisplayed(PRODUCT_DESC,text);
    }

    public void selectProduct(int i) {
        navigate(getAllProducts().get(i));
    }

    private List<WebElement> getAllProducts(){
        return findAll(PRODUCT);
    }


}
