package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

    public LogInPage(WebDriver driver){

        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "email")
    WebElement emailLbl;

    @FindBy(id = "passwd")
    WebElement passwdLbl;

    @FindBy(id = "SubmitLogin")
    WebElement submitBtn;

    public void sendEmail(String email){
        emailLbl.sendKeys(email);
    }

    public void sendPass(String pass){
        passwdLbl.sendKeys(pass);
    }

    public void clickSubmit(){
        submitBtn.click();
    }

}
