package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import pageObjects.CreateAccount;
import pageObjects.LogInPage;


public class GivenTest {

    LogInPage lg = new LogInPage(driver);
    public static WebDriver driver = SetUpClass.driver;

    @Given("User is on login page")
    public void user_is_on_login_page() {
        //driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @Given("User is logged in with username as {string} and enters password as {string}")
    public void user_is_logged_in_with_username_as_and_enters_password_as(String email, String pass) {
        //driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        lg.sendEmail(email);
        lg.sendPass(pass);
        lg.clickSubmit();
    }

    @Given("User is on Home Page")
    public void user_is_on_Home_Page() {
        driver.get("http://automationpractice.com/index.php?");
        
        
    }

}


