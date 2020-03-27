package stepDefinitions;

import io.cucumber.java.en.When;
import okhttp3.internal.http2.Header;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.HeaderPage;
import pageObjects.LogInPage;

public class WhenTest {

    LogInPage lg = new LogInPage(driver);
    HeaderPage hpage = new HeaderPage(driver);
    public static WebDriver driver = GivenTest.driver;

    @When("User enters username as {string}")
    public void user_enters_username_as(String email) {
        lg.sendEmail(email);
    }

    @When("User enters password as {string}")
    public void user_enters_password_as(String password) {
        lg.sendPass(password);
    }

    @When("User clics on sign in button")
    public void user_clics_on_sign_in_button() {
        lg.clickSubmit();
    }

    @When("User clics on the WOMEN tab")
    public void user_clics_on_the_WOMEN_tab() {
        hpage.clickWomenTab();
    }

    @When("User adds the first item that appears in that section")
    public void user_adds_the_first_item_that_appears_in_that_section() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User clics on the Proceed to checkout button in the frame")
    public void user_clics_on_the_Proceed_to_checkout_button_in_the_frame() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User clics on the Proceed to checkout button")
    public void user_clics_on_the_Proceed_to_checkout_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User clics on the checkmark button")
    public void user_clics_on_the_checkmark_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User selects Pay by check")
    public void user_selects_Pay_by_check() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User clics on the I confirm my order button")
    public void user_clics_on_the_I_confirm_my_order_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
