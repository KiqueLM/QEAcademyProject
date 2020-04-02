package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pageObjects.CreateAccount;
import pageObjects.HeaderPage;
import pageObjects.LogInPage;
import pageObjects.ShoppingCartSumPage;
import pageObjects.WomenSection;

public class WhenTest {

    LogInPage lg = new LogInPage(driver);
    HeaderPage hpage = new HeaderPage(driver);
    WomenSection wsec = new WomenSection(driver);
    ShoppingCartSumPage ShCartSum = new ShoppingCartSumPage(driver);
    CreateAccount ac = new CreateAccount(driver);
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
        
        //WebElement radButt = driver.findElement(By.xpath("//body[@id='authentication']/div[@id='page']/div[@class='columns-container']/div[@id='columns']/div[@class='row']/div[@id='center_column']/div[@id='noSlide']/form[@id='account-creation_form']/div[@class='account_creation']/div[@class='clearfix']/div[1]"));
        //System.out.println(radButt.getText());
        //radButt.click();
    	ac.checkL();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }

    @When("User Introduce Firts Name as {string}")
    public void User_Introduce_Firts_Name(String name) {
        
        //WebElement radButt = driver.findElement(By.id("customer_firstname"));
        //radButt.sendKeys(name);
    	ac.fNameC(name);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }

    @When("User Introduce Last Name as {string}") 
    public void User_Introduce_Last_Name(String lastName) {
    	//WebElement radButt = driver.findElement(By.id("customer_lastname"));
        //radButt.sendKeys(lastName);
    	ac.lNameC(lastName);
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }

    @When("User insert a Email as {string}")
    public void User_insert_a_Email(String email) {
    	//WebElement radButt = driver.findElement(By.id("email"));
        //radButt.click();
    	ac.nEMail();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }

    @When("User write a Password as {string}")
    public void User_write_a_Password_with_right_format(String password) {
    	//WebElement radButt = driver.findElement(By.id("passwd"));
        //radButt.sendKeys(password);
        ac.Password2(password);
    	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @When("User enter his Address as {string}")
    public void User_enter_his_Address(String address) {
    	
    	//WebElement radButt = driver.findElement(By.id("address1"));
        //radButt.sendKeys(address);
    	ac.addres(address);
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
    }

    @When("User write a city as {string}") 
    public void User_write_a_city(String city) {
    	//WebElement radButt = driver.findElement(By.id("city"));
        //radButt.sendKeys(city);
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
    	//WebElement radButt = driver.findElement(By.id("postcode"));
        //radButt.sendKeys(zpcode);
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
    	//WebElement radButt = driver.findElement(By.id("phone_mobile"));
        //radButt.sendKeys(cel);
    	ac.phone(cel);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @When("Assign an address on alias for future reference as {string}")
    public void Assign_an_address_on_alias_for_future_reference(String addressR){
    	//WebElement radButt = driver.findElement(By.id("alias"));
        //radButt.sendKeys(addressR);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        
    }
    @When("click on Register button")
    public void click_on_Register_button()  {
    	//WebElement radButt = driver.findElement(By.xpath("//span[contains(text(),'Register')]"));
        //radButt.click();
    	ac.regButton();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    

}
