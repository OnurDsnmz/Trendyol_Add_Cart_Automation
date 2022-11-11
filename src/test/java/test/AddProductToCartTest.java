package test;

import base.BaseTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import page.*;

public class AddProductToCartTest extends BaseTest {
    @Test
    @Order(1)
    public void UserLogin() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        homePage.closeModal();
        homePage.clickSignIn();
        loginPage.sendEmail();
        loginPage.sendPassword();
        loginPage.clickLogin();
        homePage.hoverAccMenu();

        Assertions.assertTrue(homePage.isTrueEmail(),"Login failed!!!"); //Login kontrolü
    }

    @Test
    @Order(2)
    public void searchProduct() {
       HomePage homePage = new HomePage(driver);
       ProductsPage productsPage = new ProductsPage(driver);

        homePage.search("hp laptop");

        Assertions.assertTrue(productsPage.isOnProductsPage("hp laptop"),"Not on products page!"); //Ürün sayfası kontrolü
    }

    @Test
    @Order(3)
    public void selectProduct() {
        ProductsPage productsPage = new ProductsPage(driver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
        productsPage.selectProduct(4);
        Assertions.assertTrue(productDetailsPage.isOnProductDetails(),"Not on product details page"); //Ürün detay sayfası kontrolü
    }

    @Test
    @Order(4)
    public void addToCart() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
        productDetailsPage.addToCart();
        Assertions.assertTrue(productDetailsPage.isProductCountUp(),"The product has not been added to the cart"); //Ürün sepete eklenince sepet sayısı artıyor mu
    }

    @Test
    @Order(5)
    public void goToCart() {
        CartPage cartPage = new CartPage(driver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
        productDetailsPage.goToCart();
        Assertions.assertTrue(cartPage.checkIfProductAdded(),"No product added"); //Sepet sayfasına ürün eklenmiş mi
    }


}
