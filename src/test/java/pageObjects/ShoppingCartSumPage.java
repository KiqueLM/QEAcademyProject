package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.GivenTest;

public class ShoppingCartSumPage {

    WebDriver driver = GivenTest.driver;

    public ShoppingCartSumPage(WebDriver driver){

        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//a[@class=\"button btn btn-default standard-checkout button-medium\"]")
    WebElement proCheckOutBtn;

    @FindBy(xpath = "//button[@class=\"button btn btn-default button-medium\"]")
    WebElement secondProCheckOutBtn;

    @FindBy(xpath = "//button[@class=\"button btn btn-default standard-checkout button-medium\"]")
    WebElement thirdProCheckOutBtn;

    @FindBy(id = "uniform-cgv")
    WebElement confirmCheckBox;

    @FindBy(xpath = "//a[@class=\"cheque\"]")
    WebElement payByCheckBtn;

    @FindBy(xpath = "//p[@id='cart_navigation']//button")
    WebElement confirmOrderBtn;

    @FindBy(xpath = "//p[@class=\"alert alert-success\"]")
    WebElement successAlert;

    public void clickProceedCheckOutBtn() {
        proCheckOutBtn.click();
    }

    public void clickSecondProceedCheckOutBtn() {
        secondProCheckOutBtn.click();
    }

    public void clickThirdProceedCheckOutBtn() {
        thirdProCheckOutBtn.click();
    }

    public void clickConfrmCheckBox() {
        confirmCheckBox.click();
    }

    public void clickPayByCheckBtn() {
        payByCheckBtn.click();
    }

    public void clickConfirmOrderBtn() {
        confirmOrderBtn.click();
    }

    public String getTextSuccessAlert() {
        String txtSuccessAlert = successAlert.getText();
        return txtSuccessAlert;
    }

}
