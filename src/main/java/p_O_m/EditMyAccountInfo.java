package p_O_m;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditMyAccountInfo extends ParentClass {

    public EditMyAccountInfo (){

        PageFactory.initElements(driver,this);
    }

    @FindBy (css = "#old_passwd")
    private WebElement oldPasswd;
    @FindBy (css = "#passwd")
    private WebElement newPasswd;
    @FindBy (css = "#confirmation")
    private WebElement confirmation;
    @FindBy (css = "#lastname")
    private WebElement lastname;
    @FindBy (css = "#email")
    private WebElement email;
    @FindBy (css ="#firstname")
    private WebElement firstname;
    @FindBy (css = ".form-group>button")
    public WebElement saveButton;
    @FindBy (css = "a.account")
    public WebElement editedName;
    @FindBy (css = "li>a.btn")
    public WebElement backtoAccountButton;




    WebElement myElement;

    public void findElementAndSendKeys (String elementName, String text){


        switch (elementName) {
            case "oldPasswd":
                myElement = oldPasswd;
                break;
            case "newPasswd":
                myElement = newPasswd;
                break;
            case "confirmation":
                myElement = confirmation;
                break;
            case "lastname":
                myElement = lastname;
                break;
            case "email":
                myElement = email;
                break;
            case "firstname":
                myElement = firstname;
                break;
        }

        clickKeysFunction(myElement,text);

    }

}
