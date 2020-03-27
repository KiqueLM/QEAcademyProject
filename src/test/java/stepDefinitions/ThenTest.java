package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ThenTest {

    WebDriver driver = GivenTest.driver;

    @Then("User should be logged correctly")
    public void user_should_be_logged_correctly() {
        Assert.assertTrue(driver.getCurrentUrl().equals("http://automationpractice.com/index.php?controller=my-account"));
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
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
