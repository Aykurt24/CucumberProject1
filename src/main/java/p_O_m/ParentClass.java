package p_O_m;

import Utilis.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ParentClass {

    WebDriver driver;
    WebDriverWait wait;

    public ParentClass(){

        driver = Driver.getDriver();
        wait = new WebDriverWait(driver,10);
    }

    public void waitUntilClickable(WebElement elementToWait){
        wait.until(ExpectedConditions.elementToBeClickable(elementToWait));

    }

    public void waitUntilVisible(WebElement elementToWait){
        wait.until(ExpectedConditions.visibilityOf(elementToWait));
    }

    public void clickFunction (WebElement element){

        waitUntilClickable(element);
        element.click();

    }

    public  void clickKeysFunction (WebElement element, String value){

        waitUntilVisible(element);
        element.clear();
        element.sendKeys(value);

    }

    public void elementContainsText (WebElement element, String text){

        waitUntilVisible(element);
        Assert.assertTrue(element.getText().contains(text));

    }


}
