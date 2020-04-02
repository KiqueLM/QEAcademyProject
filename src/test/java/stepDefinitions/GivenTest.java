package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.HeaderPage;
import pageObjects.HomePage;
import pageObjects.LogInPage;


public class GivenTest {

    public static WebDriver driver = SetUpClass.driver;
    LogInPage lg = new LogInPage(driver);
    HomePage homePage = new HomePage(driver);
    HeaderPage hPage = new HeaderPage(driver);

    @Given("User is on Home Page")
    public void user_is_in_the_Home_Page() {
        Assert.assertTrue(driver.getTitle().equals("My Store"));
    }

    @Given("User is on login page")
    public void user_is_on_login_page() {
       // driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account%22");
    	homePage.clickSignInBtn();
    }

    @Given("User is logged in with username as {string} and enters password as {string}")
    public void user_is_logged_in_with_username_as_and_enters_password_as(String email, String pass) {
        homePage.clickSignInBtn();
        lg.sendEmail(email);
        lg.sendPass(pass);
        lg.clickSubmit();
        hPage.clickLogoImg();
    }

}