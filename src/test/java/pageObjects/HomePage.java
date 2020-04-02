package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.GivenTest;

public class HomePage {

    WebDriver driver = GivenTest.driver;

    public HomePage(WebDriver driver){

        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//a[@class=\"login\"]")
    WebElement signInBtn;

    @FindBy(xpath = " //*[@id=\"homefeatured\"]/li[2]/div")
    WebElement blackBlouseItm;

    public void clickBlackBlouseItm(){ blackBlouseItm.click(); }

    public void clickSignInBtn() { signInBtn.click(); }

}
