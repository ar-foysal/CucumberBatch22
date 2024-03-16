package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class BaseDriver {
    static WebDriver driver;


    public static void startBrowser() {
        String browserName = System.getProperty("browser", "chrome");

        if (browserName.equals("chrome")) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        } else if (browserName.equals("firefox")) {
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        } else {
            driver = new EdgeDriver();
            driver.manage().window().maximize();
        }

        PageDriver.getInstance().setDriver(driver);
    }


    public static void close() {
        driver.quit();
    }

}