import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class test01 {

    public  WebDriver driver;

    @Before
    public void setupDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mehme\\IdeaProjects\\selenium-web-automation\\chromedriver.exe");
        driver = new ChromeDriver();
        String url = "https://www.lcwaikiki.com/tr-TR/TR";
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }



    @After
    public void quitDriver(){
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        driver.quit();
    }
}








