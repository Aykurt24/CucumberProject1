package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import p_O_m.EditMyAccountInfo;
import p_O_m.MyAccountNavigateBar;
import p_O_m.ParentClass;

public class EditMyInfoSteps extends ParentClass {


    MyAccountNavigateBar myAccountNavigateBar = new MyAccountNavigateBar();
    EditMyAccountInfo editMyAccountInfo = new EditMyAccountInfo();

    @Given("^Navigate to my personal information page$")
    public void navigate_to_my_personal_information_page(){
        myAccountNavigateBar.findElementAndClickFunction("PersonalInfo");
    }

    @When("^Change the first name\"([^\"]*)\", enter the current password\"([^\"]*)\", new password\"([^\"]*)\", confirmation\"([^\"]*)\", and click on the save button$")
    public void change_the_first_name_enter_the_current_password_new_password_confirmation_and_click_on_the_save_button(String arg1, String arg2, String arg3, String arg4)  {

        editMyAccountInfo.findElementAndSendKeys("firstname",arg1);
        editMyAccountInfo.findElementAndSendKeys("oldPasswd",arg2);
        editMyAccountInfo.findElementAndSendKeys("newPasswd",arg3);
        editMyAccountInfo.findElementAndSendKeys("confirmation",arg4);
        editMyAccountInfo.saveButton.click();


    }

    @Then("^Edited successfully\"([^\"]*)\"$")
    public void edited_successfully(String arg1) {

        elementContainsText(editMyAccountInfo.editedName,arg1);

    }
}
