package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.*;

public class WhenTest {

    public static WebDriver driver = GivenTest.driver;

    LogInPage lg = new LogInPage(driver);
    HeaderPage hPage = new HeaderPage(driver);
    WomenSection wSec = new WomenSection(driver);
    ShoppingCartSumPage shCartSum = new ShoppingCartSumPage(driver);
    HomePage homePage = new HomePage(driver);
    ProductPage proPage = new ProductPage(driver);

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
        hPage.clickWomenTab();
    }

    @When("User adds the first item that appears in that section")
    public void user_adds_the_first_item_that_appears_in_that_section() {
        wSec.moveToShort();
        wSec.clickAddToCartBtn();
    }

    @When("User clics on the Proceed to checkout button in the frame")
    public void user_clics_on_the_Proceed_to_checkout_button_in_the_frame() {
        wSec.clickCheckOutBtn();
    }

    @When("User clics on the first Proceed to checkout button")
    public void user_clics_on_the_first_Proceed_to_checkout_button() {
        shCartSum.clickProceedCheckOutBtn();
    }

    @When("User clics on the second Proceed to checkout button")
    public void user_clics_on_the_second_Proceed_to_checkout_button() {
        shCartSum.clickSecondProceedCheckOutBtn();
    }

    @When("User clics on the checkmark button")
    public void user_clics_on_the_checkmark_button() {
        shCartSum.clickConfrmCheckBox();
    }

    @And("User clics on the  last Proceed to checkout button")
    public void userClicsOnTheLastProceedToCheckoutButton() {
        shCartSum.clickThirdProceedCheckOutBtn();
    }

    @When("User selects Pay by check")
    public void user_selects_Pay_by_check() {
        shCartSum.clickPayByCheckBtn();
    }

    @When("User clics on the I confirm my order button")
    public void user_clics_on_the_I_confirm_my_order_button() {
        shCartSum.clickConfirmOrderBtn();
    }

    @When("User clics on any item from the shop")
    public void user_clics_on_any_item_from_the_shop() {
    homePage.clickBlackBlouseItm();
    }

    @When("User puts the number two on the quantity option")
    public void user_puts_the_number_on_the_quantity_option() {
    proPage.clickPlusBtn();
    }

    @When("User selects medium size")
    public void user_selects_medium_size() {
        proPage.selectMediumSize();
    }

    @When("User selects a different color")
    public void user_selects_a_different_color() {
        proPage.clickWhiteColor();
    }

    @When("User clics on Add to cart button")
    public void user_clics_on_Add_to_cart_button() {
        proPage.clickAddToCartBtn();
    }

}
