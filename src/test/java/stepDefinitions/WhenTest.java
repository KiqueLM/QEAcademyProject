package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.HeaderPage;
import pageObjects.LogInPage;
import pageObjects.ShoppingCartSumPage;
import pageObjects.WomenSection;

public class WhenTest {

    LogInPage lg = new LogInPage(driver);
    HeaderPage hpage = new HeaderPage(driver);
    WomenSection wsec = new WomenSection(driver);
    ShoppingCartSumPage ShCartSum = new ShoppingCartSumPage(driver);

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
        wsec.moveToShort();
        wsec.clickAddToCartBtn();
    }

    @When("User clics on the Proceed to checkout button in the frame")
    public void user_clics_on_the_Proceed_to_checkout_button_in_the_frame() {
        wsec.clickCheckOutBtn();
    }

    @When("User clics on the first Proceed to checkout button")
    public void user_clics_on_the_first_Proceed_to_checkout_button() {
        ShCartSum.clickProceedCheckOutBtn();
    }

    @When("User clics on the second Proceed to checkout button")
    public void user_clics_on_the_second_Proceed_to_checkout_button() {
        ShCartSum.clickSecondProceedCheckOutBtn();
    }

    @When("User clics on the checkmark button")
    public void user_clics_on_the_checkmark_button() {
        ShCartSum.clickConfrmCheckBox();
    }

    @And("User clics on the  last Proceed to checkout button")
    public void userClicsOnTheLastProceedToCheckoutButton() {
        ShCartSum.clickThirdProceedCheckOutBtn();
    }

    @When("User selects Pay by check")
    public void user_selects_Pay_by_check() {
        ShCartSum.clickPayByCheckBtn();
    }

    @When("User clics on the I confirm my order button")
    public void user_clics_on_the_I_confirm_my_order_button() {
        ShCartSum.clickConfirmOrderBtn();
    }


}
