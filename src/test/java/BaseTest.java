import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.LobbyPage;
import pages.StartPage;

import java.time.Duration;

public abstract class BaseTest {

    protected static WebDriver driver;
    protected static LobbyPage lobbyPage;
    protected static StartPage startPage;

    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();
        lobbyPage = new LobbyPage(driver);
        startPage = new StartPage(driver);

    }

    @BeforeMethod
    public void setupTestData() {
        driver.manage().deleteAllCookies();
        startPage.openStartPage();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
