package pages;

import org.openqa.selenium.*;

import org.openqa.selenium.support.ui.ExpectedConditions;

import static pages.LobbyPage.PIANO_LOCATOR;

public class StartPage extends BasePage<StartPage> {

    public StartPage(WebDriver driver) {
        super(driver);
    }

    public static final String SUCCESS_NOTIFICATOR = "//div[@class='notif success']";
    public static final String CREATE_ROOM_BUTTON = "//div[@class='create']";
    public static final String ROOM_PASSWORD_FIELD = "//input[@placeholder='ROOM PASSWORD (OPTIONAL)']";
    public static final String PASSWORD = "778234";
    public static final String FINAL_CREATE_BUTTON = "//div[@class='button button-accent' and text()=' CREATE ']";
    public static final String ALLOW_SPECTATORS_CHECKBOX = "//div[text()='Allow spectators to join without password']" + "/following-sibling::div//span[@class='slider slider-accent']";

    public void createNewRoom(String password) {
        boolean isLobbyCreated = false;
        int attempts = 0;
        do {
            attempts++;
            if (attempts > 1) {
                resetAndRefreshBrowserState();
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SUCCESS_NOTIFICATOR)));
            }
            driver.findElement(By.xpath(CREATE_ROOM_BUTTON)).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ROOM_PASSWORD_FIELD))).sendKeys(password);
            WebElement checkbox = driver.findElement(By.xpath(ALLOW_SPECTATORS_CHECKBOX));
            if (checkbox.isSelected()) {
                checkbox.click();
            }
            WebElement finalCreate = driver.findElement(By.xpath(FINAL_CREATE_BUTTON));
            wait.until(ExpectedConditions.visibilityOf(finalCreate));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", finalCreate);
            try {
                if (driver.findElement(By.xpath(PIANO_LOCATOR)).isDisplayed()) {
                    isLobbyCreated = true;
                }
            } catch (NoSuchElementException e) {
                System.out.println("The server was unable to process the request to create a lobby. Number of attempts remaining: " + (5 - attempts));
            }
        } while (!isLobbyCreated && attempts < 5);
        if (isLobbyCreated) {
            System.out.println("Test lobby successfully created.");
        } else System.out.println("The lobby could not be created after 5 attempts.");
    }

    public void resetAndRefreshBrowserState() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().deleteAllCookies();
        js.executeScript("window.localStorage.clear();");
        js.executeScript("window.sessionStorage.clear();");
        driver.navigate().refresh();
        System.out.println("Cleaning is complete, page is prepared for the next attempt.");

    }

    @Override
    public StartPage waitForPageToLoad() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SUCCESS_NOTIFICATOR)));
        return this;
    }


}
