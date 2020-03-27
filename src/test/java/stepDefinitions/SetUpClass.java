package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class SetUpClass {

    public static WebDriver driver;

    @Before
    public WebDriver setUp() throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("src\\test\\java\\Utility\\data.properties");
        prop.load(fis);
        String browserName = prop.getProperty("browser");
        String url = prop.getProperty("url");

        switch (browserName.toLowerCase()) {

            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.get(url);
                driver.manage().window().maximize();
                break;

            case "firefox":
                System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\drivers\\geckodriver.exe");
                driver = new FirefoxDriver();
                driver.get(url);
                driver.manage().window().maximize();
                break;

            case "edge":
                System.setProperty("webdriver.edge.driver", "src\\test\\resources\\drivers\\msedgedriver.exe");
                driver = new EdgeDriver();
                driver.get(url);
                driver.manage().window().maximize();
                break;

            default:
                System.out.println("Driver no soportado");
                break;

        }

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        return driver;
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
