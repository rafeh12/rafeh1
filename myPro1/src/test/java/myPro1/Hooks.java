package myPro1;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by user-pc on 11/08/2017.
 */
public class Hooks {
    public static WebDriver driver;
    @Before

    public void setup(){
       new DriverManager().openBrowser();
        System.setProperty("web.chrome.driver","C:\\Users\\user-pc\\IdeaProjects\\chromedriver.exe");
        driver = new ChromeDriver();
        //driver= new FirefoxDriver();
        driver.get("");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void teardown(){
       new DriverManager().closeBrowser();
    }


}
