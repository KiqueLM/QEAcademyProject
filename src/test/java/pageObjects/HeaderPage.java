package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage {

    public HeaderPage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//img[@class=\"logo img-responsive\"]")
    WebElement logoImg;

    @FindBy(className = "sf-with-ul")
    WebElement womenTab;

    public void clickWomenTab(){
        womenTab.click();
    }

    public void clickLogoImg() {logoImg.click();}

}
