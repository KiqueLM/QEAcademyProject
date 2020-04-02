package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import pageObjects.*;

public class WhenTest {

    public static WebDriver driver = GivenTest.driver;

    LogInPage lg = new LogInPage(driver);
    HeaderPage hPage = new HeaderPage(driver);
    WomenSection wSec = new WomenSection(driver);
    ShoppingCartSumPage shCartSum = new ShoppingCartSumPage(driver);
    HomePage homePage = new HomePage(driver);
    ProductPage proPage = new ProductPage(driver);
    CreateAccount ac = new CreateAccount(driver);

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
    
   
    @When("User click in Sign in")
    public void user_click_in_Sign_in() {
    	
        ac.clickSignIn();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }
    
    @When("User enters new email as {string}")
    public void user_enters_new_email_as(String email) {
    	
       ac.newEmail(email);
       driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }

    @When("User click Create Account")
    public void user_click_Create_Account() {
       ac.clickCreateAcc();
       driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    	
    }
    
    @When("User click on Mr Radio Button") 
    public void User_click_on_Mr_Radio_Button()  {
    	ac.checkL();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }

    @When("User Introduce Firts Name as {string}")
    public void User_Introduce_Firts_Name(String name) {
    	ac.fNameC(name);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }

    @When("User Introduce Last Name as {string}") 
    public void User_Introduce_Last_Name(String lastName) {
    	ac.lNameC(lastName);
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }

    @When("User insert a Email as {string}")
    public void User_insert_a_Email(String email) {
    	ac.nEMail();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }

    @When("User write a Password as {string}")
    public void User_write_a_Password_with_right_format(String password) {
        ac.Password2(password);
    	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @When("User enter his Address as {string}")
    public void User_enter_his_Address(String address) {
    	ac.addres(address);
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
    }

    @When("User write a city as {string}") 
    public void User_write_a_city(String city) {
    	ac.city(city);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
    }

    @When("select an state on list box")
    public void select_an_state_on_list_box() {
    	Select drpState= new Select(driver.findElement(By.id("id_state")));
        drpState.selectByVisibleText("Alabama");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("User Writes a Zipcode as {string}")
    public void User_Writes_a_Zipcode(String zpcode)  {
    	ac.post(zpcode);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @When("User select an state on country box")
    public void User_select_an_state_on_country_box() {
    	Select drpState= new Select(driver.findElement(By.id("id_country")));
        drpState.selectByVisibleText("United States");
        
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @When("User write a mobile number in Mobile Phone as {string}")
    public void User_write_a_mobile_number_in_Mobile_Phone(String cel) {
    	ac.phone(cel);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @When("Assign an address on alias for future reference as {string}")
    public void Assign_an_address_on_alias_for_future_reference(String addressR){
    	WebElement radButt = driver.findElement(By.id("alias"));
      radButt.sendKeys(addressR);
        
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);      
    }
  
    @When("click on Register button")
    public void click_on_Register_button()  {
    	ac.regButton();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
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
