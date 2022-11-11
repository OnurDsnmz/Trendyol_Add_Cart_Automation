package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {

    WebDriver driver = null;
    WebDriverWait wait = null;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 20);
    }

    public WebElement findElement(By by){
        return driver.findElement(by);
    }

    public List<WebElement> findAll (By by) { return driver.findElements(by); }

    public void clickElement(By by){
        findElement(by).click();
    }

    public void sendKeys(By by, String keys){
        findElement(by).sendKeys(keys);
    }

    public void sendKeys(By by,Keys keys) { findElement(by).sendKeys(keys); }

    public void hoverElement(By by){
        wait(3000);
        WebElement element = findElement(by);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    public void waitToVisibility(By by){ wait.until(ExpectedConditions.visibilityOfElementLocated(by)); }

    public void wait(int ms){
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException e)
        {
            throw new RuntimeException("Error!");
        }
    }

    public boolean isDisplayed(By by, String text){
        try{
            return findElement(by).getText().toLowerCase().equals(text);
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isAddedProduct(By by) {
        waitToVisibility(by);
        int count = Integer.parseInt(findElement(by).getText());
        return count > 0;
    }

    public void navigate(WebElement element){
        String link = element.getAttribute("href");
        driver.navigate().to(link);
    }

}
