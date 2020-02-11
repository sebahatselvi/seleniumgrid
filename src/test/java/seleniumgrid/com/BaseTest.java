package seleniumgrid.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    public WebDriver driver;
     DesiredCapabilities capabilities;

    @BeforeMethod
    public void beforeMethod() throws MalformedURLException {
        FirefoxProfile profile = new FirefoxProfile();
        capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability(FirefoxDriver.PROFILE,profile);
        capabilities.setCapability("marionette",true);


      /*  ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);*/


        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
    }



    @AfterMethod
    public void AfterMethod(){
        driver.quit();
    }
}
