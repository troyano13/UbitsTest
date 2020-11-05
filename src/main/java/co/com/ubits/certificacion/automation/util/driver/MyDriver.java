package co.com.ubits.certificacion.automation.util.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MyDriver {

    static WebDriver driver;

    public static MyDriver web() {
        System.setProperty("webdriver.chrome.driver", "resources//driver//chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-infobars", "--start-maximized","--no-sandbox", "--incognito","--lang=es","--disable-popup-blocking","--disable-download-notification","--start-maximized","--test-type","--ignore-certificate-errors","--allow-running-insecure-content","--disable-translate", "--always-authorize-plugins");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("pageLoadStrategy", "none");
        options.merge(capabilities);
        driver = new ChromeDriver(options);
        return new MyDriver();
    }

    public WebDriver inPage(String url) {
        driver.get(url);
        return driver;
    }

}