package myPro1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by user-pc on 12/08/2017.
 */
public class DriverManager {
        public static WebDriver driver;
        public void openBrowser(){

            System.setProperty("web.chrome.driver","C:\\Users\\user-pc\\IdeaProjects\\chromedriver.exe");
            driver = new ChromeDriver();
            //driver= new FirefoxDriver();
            driver.get("");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

        public void closeBrowser(){
            driver.quit();

    }
}
