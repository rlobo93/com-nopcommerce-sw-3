package browsertesting;

import com.sun.org.apache.bcel.internal.classfile.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseTest extends Utility {

    String BaseUrl = "https://demo.nopcommerce.com/";
    public static WebDriver driver;


    public void openBrowser(String BaseUrl){
        //setting up browser for incognito mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        //browser setup
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(BaseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }





    //closing browser
    public void closeBrowser() {
        driver.quit();
    }


}

