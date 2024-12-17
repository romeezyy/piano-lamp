import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LobbyPage;
import pages.StartPage;

import java.time.Duration;

public abstract class BaseTest {

    protected static ThreadLocal<WebDriver> driver = ThreadLocal.withInitial(() -> {
        WebDriverManager.chromedriver().setup();
        WebDriver d = new ChromeDriver();
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        d.manage().window().maximize();
        return d;
    });

    protected static ThreadLocal<LobbyPage> lobbyPage = ThreadLocal.withInitial(() -> new LobbyPage(driver.get()));
    protected static ThreadLocal<StartPage> startPage = ThreadLocal.withInitial(() -> new StartPage(driver.get()));

    @BeforeAll
    public static void setup() {
        WebDriverManager.chromedriver().setup();


    }

    @BeforeEach
    public void setupTestData() {
        driver.get().manage().deleteAllCookies();
        startPage.get().openStartPage();
    }

    @AfterEach
    public void tearDown() {
        if (driver.get() != null) {
            driver.get().quit();
        }
    }
}
