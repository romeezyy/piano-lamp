package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class StartPage extends BasePage<StartPage> {

    public StartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='notif success']")
    private WebElement successNotificator;
    public static final String CREATE_ROOM_BUTTON = "//div[@class='create']";
    public static final String ROOM_PASSWORD_FIELD = "//input[@placeholder='ROOM PASSWORD (OPTIONAL)']";
    public static final String PASSWORD = "778234";
    public static final String FINAL_CREATE_BUTTON = "//div[@class='button button-accent' and text()=' CREATE ']";
    public static final String ALLOW_SPECTATORS_CHECKBOX = "//div[text()='Allow spectators to join without password']" +
            "/following-sibling::div//span[@class='slider slider-accent']";

    public void createNewRoom(String password) {
        driver.findElement(By.xpath(CREATE_ROOM_BUTTON)).click();
        driver.findElement(By.xpath(ROOM_PASSWORD_FIELD)).sendKeys(password);
        WebElement checkbox = driver.findElement(By.xpath(ALLOW_SPECTATORS_CHECKBOX));
        if (checkbox.isSelected()) {
            checkbox.click();
        }
        try {
            Thread.sleep(Duration.ofSeconds(1));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath(FINAL_CREATE_BUTTON)).click();
    }

    @Override
    public StartPage waitForPageToLoad() {
        waitElementToBeVisible(successNotificator);
        return this;
    }


}
