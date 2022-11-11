package constans;

import org.openqa.selenium.By;

public class ConstantsProductsPage {
    public static final By PRODUCT_DESC = By.xpath("//*[@id=\"search-app\"]/div/div[1]/div[2]/div[1]/div[1]/div/h1"); // Ürün arama açıklamasını tutan element
    public static final By PRODUCT = By.cssSelector(".p-card-chldrn-cntnr a"); //Ürün elementi
}
