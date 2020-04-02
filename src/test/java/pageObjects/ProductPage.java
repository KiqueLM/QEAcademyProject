package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import stepDefinitions.GivenTest;

public class ProductPage {

    WebDriver driver = GivenTest.driver;

    public ProductPage(WebDriver driver){

        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//i[@class=\"icon-plus\"]")
    WebElement plusBtn;

    @FindBy(xpath = "//select[@id=\"group_1\"]")
    WebElement sizeDropdown;

    @FindBy(id = "color_8")
    WebElement whiteColor;

    @FindBy(xpath = "//button[@name='Submit']")
    WebElement addToCartBtn;

    @FindBy(xpath = "//i[@class='icon-ok']")
    String okImg;

    public void clickPlusBtn(){ plusBtn.click(); }

    public void selectMediumSize() {
        Select sel = new Select(sizeDropdown);
        sel.selectByVisibleText("M");
    }

    public void clickWhiteColor() {
        whiteColor.click();
    }

    public void clickAddToCartBtn() {
        addToCartBtn.click();
    }

}
