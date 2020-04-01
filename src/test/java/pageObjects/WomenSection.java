package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.GivenTest;
import stepDefinitions.SetUpClass;

public class WomenSection {

    WebDriver driver = GivenTest.driver;
    public WomenSection(WebDriver driver){

        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//img[@src=\"http://automationpractice.com/img/p/1/1-home_default.jpg\"]")
    WebElement itemToSelect;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]")
    WebElement addToCartBtn;

    @FindBy(xpath = "//a[@class=\"btn btn-default button button-medium\"]")
    WebElement checkOutBtn;

    public void moveToShort(){
        Actions actions = new Actions(driver);
        actions.moveToElement(itemToSelect).build().perform();
    }

    public void clickAddToCartBtn(){
        addToCartBtn.click();
    }

    public void clickCheckOutBtn(){
        checkOutBtn.click();
    }

}
