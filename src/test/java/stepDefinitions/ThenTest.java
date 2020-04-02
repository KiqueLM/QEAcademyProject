package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObjects.ProductPage;
import pageObjects.ShoppingCartSumPage;

public class ThenTest {

    ShoppingCartSumPage ShCartSum = new ShoppingCartSumPage(driver);
    ProductPage proPage = new ProductPage(driver);

    public static WebDriver driver = GivenTest.driver;

    @Then("User should be logged correctly")
    public void user_should_be_logged_correctly() {
        Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php?controller=my-account");
    }

    @Then("User should not get logged in")
    public void user_should_not_get_logged_in() {
        WebElement alertError = driver.findElement(By.xpath("//p[contains(text(),'There is 1 error')]"));
        String txtAlertError = alertError.getText();
        Assert.assertEquals(txtAlertError, "There is 1 error");
        System.out.println(txtAlertError);

    }

    @Then("User should get a message with the approval")
    public void user_should_get_a_message_with_the_approval() {
        Assert.assertEquals(ShCartSum.getTextSuccessAlert(), "Your order on My Store is complete.");
        System.out.println(ShCartSum.getTextSuccessAlert());
    }

    @Then("User should get a success message")
    public void user_should_get_a_success_message() {
        WebElement crossImg = driver.findElement(By.xpath("//span[@class='cross']"));
        boolean imagePresent = crossImg.isEnabled();
        Assert.assertTrue(imagePresent, "No image displayed");
    }
}
