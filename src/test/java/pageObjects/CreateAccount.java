package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount {
	 public CreateAccount(WebDriver driver) {

	        PageFactory.initElements(driver, this);

	    }

	    @FindBy(xpath = "//a[@class='login']")
	    WebElement singBtn;

	    @FindBy(xpath = "//input[@id='email_create']")
	    WebElement emailbl;
	    
	    @FindBy(xpath = "//button[@id='SubmitCreate']")
	    WebElement subBtn;
	    
	    
	    @FindBy(id = "create_account_error")
	    WebElement alertError;
	    
	    @FindBy(xpath = "//body[@id='authentication']/div[@id='page']/div[@class='columns-container']/div[@id='columns']/div[@class='row']/div[@id='center_column']/div[@id='noSlide']/form[@id='account-creation_form']/div[@class='account_creation']/div[@class='clearfix']/div[1]")
	    WebElement checkL;
        
	    @FindBy(id = "customer_firstname")
	    WebElement fNameC;
	    
	    @FindBy(id = "customer_lastname")
	    WebElement lNameC;
	    
	    @FindBy(id = "email")
	    WebElement nEmail;

	    @FindBy(id = "passwd")
	    WebElement pass2;
	    
	    @FindBy(id = "address1")
	    WebElement address;
	    
	    @FindBy(id = "city")
	    WebElement city;
	    
	    @FindBy(id = "postcode")
	    WebElement post;
	    
	    @FindBy(id = "phone_mobile")
	    WebElement phone;
	    
	    @FindBy(id = "alias")
	    WebElement alias;
	    
	    @FindBy(xpath = "//span[contains(text(),'Register')]" )
	    WebElement regBttn;
	   
	    
	    
	    public void clickSignIn(){
	    	singBtn.click();
	    }
	    
	    public void newEmail(String email){
	    	emailbl.sendKeys(email);
	    }

	    public void clickCreateAcc(){
	    	subBtn.click();
	    }
	    
	    public String alertMessage(){
	    	String txtAlert=alertError.getText();
	    	return txtAlert;
	    }
	    
	    public void radButt(){
	    	subBtn.click();
	    }
	    public void checkL(){
	    	checkL.click();
	    }
	    public void fNameC(String name){
	    	fNameC.sendKeys(name);
	    }
	    public void lNameC(String name){
	    	lNameC.sendKeys(name);
	    }
	    public void nEMail(){
	    	nEmail.click();;
	    }
	    public void Password2(String pass){
	    	pass2.sendKeys(pass);
	    }
	    public void addres(String addr){
	    	address.sendKeys(addr);
	    }
	    public void city(String city1){
	    	city.sendKeys(city1);
	    }
	    public void post(String post1){
	    	post.sendKeys(post1);
	    }
	    public void phone(String phon){
	    	phone.sendKeys(phon);
	    }
	    public void AddresReff(String adRef){
	    	alias.sendKeys(adRef);
	    }
	    public void regButton() {
	    	regBttn.click();
	    }
	    
	    
}
