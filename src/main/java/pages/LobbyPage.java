package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.Note;
import utils.Pause;

import java.time.Duration;
import java.util.List;

public class LobbyPage extends BasePage<LobbyPage> {

    public LobbyPage(WebDriver driver) {
        super(driver);
    }


    public static final String SUSTAIN_CHECKBOX = "//div[@class='sustain-div']//span[@class='slider slider-accent']";
    public static final String COLLAPSE_CHAT_BUTTON = "//i[@class='bi bi-arrows-collapse']";
    public static final String PIANO_LOCATOR = "//div[@class='user-piano myPiano']";

    public void play(List<?> notes) {
        Actions actions = new Actions(driver);

        for (Object object : notes) {
            if (object instanceof Note note) {
                for (String key : note.getKeys()) {
                    actions.keyDown(key).perform();
                }
                if (note.getHoldDuration() > 0) {
                    if (note.getSubNotes() != null) {
                        play(note.getSubNotes());
                    }
                    actions.pause(Duration.ofNanos(note.getHoldDuration())).perform();
                }
                for (String key : note.getKeys()) {
                    actions.keyUp(key).perform();
                }
            } else if (object instanceof Pause(long duration)) {
                actions.pause(Duration.ofNanos(duration)).perform();
            }
        }
    }

    public enum PlayingParts {
        ACCOMPANIMENT, MELODY
    }

    public void configureLobby(PlayingParts playingParts) {
        WebElement sustainCheckbox = driver.findElement(By.xpath(SUSTAIN_CHECKBOX));
        wait.until(ExpectedConditions.visibilityOf(sustainCheckbox));
        if (!sustainCheckbox.isSelected()) {
            sustainCheckbox.click();
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(COLLAPSE_CHAT_BUTTON))).click();
        wait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath(PIANO_LOCATOR))));
        switch (playingParts) {
            case MELODY:
                Actions actions1 = new Actions(driver);
                actions1.keyDown(Keys.ARROW_UP).keyUp(Keys.ARROW_UP)
                        .keyDown(Keys.ARROW_UP).keyUp(Keys.ARROW_UP)
                        .keyDown(Keys.ARROW_UP).keyUp(Keys.ARROW_UP)
                        .keyDown(Keys.ARROW_UP).keyUp(Keys.ARROW_UP)
                        .perform();
                break;
            case ACCOMPANIMENT:
                Actions actions2 = new Actions(driver);
                actions2.keyDown(Keys.ARROW_LEFT).keyUp(Keys.ARROW_LEFT)
                        .perform();
                break;
            default:
                System.out.println("Unknown part.");
        }
    }

    @Override
    public LobbyPage waitForPageToLoad() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SUSTAIN_CHECKBOX)));
        return this;
    }
}
