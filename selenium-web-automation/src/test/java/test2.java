import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class test2 {

    public WebDriver driver;

    //public WebDriverWait wait;
    @Before
    public void setupDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mehme\\IdeaProjects\\selenium-web-automation\\chromedriver.exe");
        driver = new ChromeDriver();
        String url = "https://www.lcwaikiki.com/tr-TR/TR";
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void TestSearch() {

        /* 'Pantolon' kelimesinin aranması */
        WebElement searchBox = driver.findElement(By.className("search-box__input"));
        searchBox.click();
        searchBox.sendKeys("Pantolon");
        driver.findElement(By.className("search-box__button")).click();


        @After
        public void quitDriver () {
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            driver.quit();
        }
    }
}

