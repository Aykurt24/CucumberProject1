package p_O_m;

import Utilis.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountNavigateBar extends ParentClass {

    public MyAccountNavigateBar (){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//span[text()='Order history and details']")
    private WebElement OrderHistory;
    @FindBy(xpath = "//span[text()='My credit slips']")
    private WebElement CreditSlips;
    @FindBy(xpath = "//span[text()='My addresses']")
    private WebElement Addresses;
    @FindBy(xpath = "//span[text()='My personal information']")
    private WebElement PersonalInfo;
    @FindBy(xpath = "//span[text()='My wishlists']")
    private WebElement Wishlists;

    WebElement myElement;

    public void findElementAndClickFunction(String elementName){

        switch (elementName){
            case "OrderHistory":
                myElement = OrderHistory;
                break;
            case "CreditSlips":
                myElement = CreditSlips;
                break;
            case "Addresses":
                myElement = Addresses;
                break;
            case "PersonalInfo":
                myElement = PersonalInfo;
                break;
            case "Wishlists":
                myElement = Wishlists;
                break;

        }

        clickFunction(myElement);

    }

}
