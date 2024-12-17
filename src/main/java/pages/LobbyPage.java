package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class LobbyPage extends BasePage<LobbyPage> {

    public LobbyPage(WebDriver driver) {
        super(driver);
    }


    public static final String SUSTAIN_CHECKBOX = "//div[@class='sustain-div']//span[@class='slider slider-accent']";
    public static final String COLLAPSE_CHAT_BUTTON = "//i[@class='bi bi-arrows-collapse']";
    public static final String PIANO_LOCATOR = "//div[@class='user-piano myPiano']";

    public void playTheGameIsOn() {
        Actions actions = new Actions(driver);
        actions
                .keyDown("0").pause(Duration.ofMillis(500)).keyUp("0")
                .pause(Duration.ofMillis(500))
                .keyDown("0").pause(Duration.ofMillis(500)).keyUp("0")
                .pause(Duration.ofMillis(500))
                .keyDown("0").pause(Duration.ofMillis(500)).keyUp("0")
                .pause(Duration.ofMillis(500))
                .keyDown("1").pause(Duration.ofMillis(250)).keyUp("1")
                .keyDown("5").pause(Duration.ofMillis(250)).keyUp("5")
                .pause(Duration.ofMillis(250))
                .keyDown("5").pause(Duration.ofMillis(250)).keyUp("5")
                .keyDown("r").pause(Duration.ofMillis(125)).keyUp("r")
                .keyDown("5").pause(Duration.ofMillis(125)).keyUp("5")
                .keyDown("t").pause(Duration.ofMillis(500)).keyUp("t")
                .keyDown("5").pause(Duration.ofMillis(250)).keyUp("5")
                .keyDown("4").pause(Duration.ofMillis(250)).keyUp("4")
                .keyDown("8").pause(Duration.ofMillis(1900)).keyUp("8")
                .keyDown("4").pause(Duration.ofMillis(250)).keyUp("4")
                .keyDown("8").pause(Duration.ofMillis(250)).keyUp("8")
                .pause(Duration.ofMillis(250))
                .keyDown("8").pause(Duration.ofMillis(250)).keyUp("8")
                .keyDown("u").pause(Duration.ofMillis(125)).keyUp("u")
                .keyDown("8").pause(Duration.ofMillis(125)).keyUp("8")
                .keyDown("9").pause(Duration.ofMillis(500)).keyUp("9")
                .keyDown("8").pause(Duration.ofMillis(250)).keyUp("8")
                .keyDown("o").pause(Duration.ofMillis(2100)).keyUp("o")
                .keyDown("=").pause(Duration.ofMillis(250)).keyUp("=")
                .keyDown("8").pause(Duration.ofMillis(250)).keyUp("8")
                .pause(Duration.ofMillis(250))
                .keyDown("8").pause(Duration.ofMillis(250)).keyUp("8")
                .keyDown("9").pause(Duration.ofMillis(250)).keyUp("9")
                .keyDown("o").pause(Duration.ofMillis(250)).keyUp("o")
                .keyDown("9").pause(Duration.ofNanos(62500000)).keyUp("9")
                .keyDown("o").pause(Duration.ofNanos(62500000)).keyUp("o")
                .keyDown("9").pause(Duration.ofNanos(62500000)).keyUp("9")
                .keyDown("8").pause(Duration.ofNanos(312500000)).keyUp("8")
                .keyDown("-").pause(Duration.ofMillis(250)).keyUp("-")
                .keyDown("8").pause(Duration.ofMillis(250)).keyUp("8")
                .pause(Duration.ofMillis(1250))
                .keyDown("8").pause(Duration.ofMillis(125)).keyUp("8")
                .keyDown("9").pause(Duration.ofMillis(125)).keyUp("9")
                .keyDown("o").pause(Duration.ofMillis(250)).keyUp("o")
                .keyDown("o").pause(Duration.ofMillis(125)).keyUp("o")
                .keyDown("-").pause(Duration.ofMillis(125)).keyUp("-")
                .keyDown("9").pause(Duration.ofMillis(250)).keyUp("9")
                .keyDown("9").pause(Duration.ofMillis(125)).keyUp("9")
                .keyDown("o").pause(Duration.ofMillis(125)).keyUp("o")
                .keyDown("8").pause(Duration.ofMillis(250)).keyUp("8")
                .keyDown("8").pause(Duration.ofMillis(125)).keyUp("8")
                .keyDown("9").pause(Duration.ofMillis(125)).keyUp("9")
                .keyDown("u").pause(Duration.ofMillis(250)).keyUp("u")
                .keyDown("5").pause(Duration.ofMillis(125)).keyUp("5")
                .keyDown("r").pause(Duration.ofMillis(125)).keyUp("r")
                .keyDown("8").pause(Duration.ofMillis(250)).keyDown("1").keyDown("w").keyDown("5")
                .pause(Duration.ofMillis(250)).keyUp("1").keyUp("w").keyUp("5")
                .pause(Duration.ofMillis(250)).keyDown("1").keyDown("w").keyDown("5")
                .pause(Duration.ofMillis(250)).keyUp("1").keyUp("w").keyUp("5")
                .pause(Duration.ofMillis(250)).keyDown("1").keyDown("w").keyDown("5")
                .pause(Duration.ofMillis(250)).keyUp("1").keyUp("w").keyUp("5")
                .pause(Duration.ofMillis(250)).keyDown("1").keyDown("w").keyDown("5")
                .pause(Duration.ofMillis(250)).keyUp("1").keyUp("w").keyUp("5").keyUp("8")
                .keyDown("=").pause(Duration.ofMillis(250)).keyUp("=")
                .keyDown("8").pause(Duration.ofMillis(250)).keyUp("8")
                .pause(Duration.ofMillis(250))
                .keyDown("8").pause(Duration.ofMillis(250)).keyUp("8")
                .keyDown("9").pause(Duration.ofMillis(250)).keyUp("9")
                .keyDown("o").pause(Duration.ofMillis(250)).keyUp("o")
                .keyDown("9").pause(Duration.ofNanos(62500000)).keyUp("9")
                .keyDown("o").pause(Duration.ofNanos(62500000)).keyUp("o")
                .keyDown("9").pause(Duration.ofNanos(62500000)).keyUp("9")
                .keyDown("8").pause(Duration.ofNanos(312500000)).keyUp("8")
                .keyDown("-").pause(Duration.ofMillis(250)).keyUp("-")
                .keyDown("8").pause(Duration.ofMillis(250)).keyUp("8")
                .pause(Duration.ofMillis(1250))
                .keyDown("8").pause(Duration.ofMillis(125)).keyUp("8")
                .keyDown("9").pause(Duration.ofMillis(125)).keyUp("9")
                .keyDown("o").pause(Duration.ofMillis(250)).keyUp("o")
                .keyDown("o").pause(Duration.ofMillis(125)).keyUp("o")
                .keyDown("-").pause(Duration.ofMillis(125)).keyUp("-")
                .keyDown("9").pause(Duration.ofMillis(250)).keyUp("9")
                .keyDown("9").pause(Duration.ofMillis(125)).keyUp("9")
                .keyDown("o").pause(Duration.ofMillis(125)).keyUp("o")
                .keyDown("8").pause(Duration.ofMillis(250)).keyUp("8")
                .keyDown("8").pause(Duration.ofMillis(125)).keyUp("8")
                .keyDown("9").pause(Duration.ofMillis(125)).keyUp("9")
                .keyDown("u").pause(Duration.ofMillis(250)).keyUp("u")
                .keyDown("5").pause(Duration.ofMillis(125)).keyUp("5")
                .keyDown("r").pause(Duration.ofMillis(125)).keyUp("r")
                .keyDown("1").keyDown("8").keyDown("w").keyDown("5").pause(Duration.ofMillis(250)).keyUp("1").keyUp("8").keyUp("w").keyUp("5")
                .pause(Duration.ofMillis(250))
                .keyDown("5") .keyDown("=").keyUp("w").keyDown("8").pause(Duration.ofMillis(250)).keyUp("5").keyUp("=").keyUp("8").keyUp("w")
                .pause(Duration.ofMillis(250))
                .keyDown("1").keyDown("8").keyDown("w").keyDown("5").pause(Duration.ofMillis(250)).keyUp("1").keyUp("8").keyUp("w").keyUp("5")
                .pause(Duration.ofMillis(750)).perform();

    }

    public void playAccompaniment() {
        Actions actions = new Actions(driver);
        actions
                .keyDown("3").pause(Duration.ofMillis(500)).keyUp("3")
                .pause(Duration.ofMillis(500))
                .keyDown("3").pause(Duration.ofMillis(500)).keyUp("3")
                .pause(Duration.ofMillis(500))
                .keyDown("3").pause(Duration.ofMillis(500)).keyUp("3")
                .pause(Duration.ofMillis(500))
                .keyDown("c").pause(Duration.ofMillis(250)).keyUp("c")
                .keyDown("3").keyDown("5").keyDown("u")
                .pause(Duration.ofMillis(250)).keyUp("3").keyUp("5").keyUp("u")
                .pause(Duration.ofMillis(250)).keyDown("5").keyDown("u")
                .pause(Duration.ofMillis(250)).keyUp("5").keyUp("u")
                .keyDown("3").pause(Duration.ofMillis(250)).keyUp("3")
                .keyDown("5").keyDown("u").pause(Duration.ofMillis(250)).keyUp("5").keyUp("u")
                .keyDown("m").pause(Duration.ofMillis(250)).keyUp("m")
                .keyDown("5").keyDown("u").pause(Duration.ofMillis(250)).keyUp("5").keyUp("u")
                .keyDown("h").pause(Duration.ofMillis(250)).keyUp("h")
                .keyDown("6").keyDown("8").keyDown("0").pause(Duration.ofMillis(250)).keyUp("6").keyUp("8").keyUp("0")
                .keyDown("3").pause(Duration.ofMillis(250)).keyUp("3")
                .keyDown("8").keyDown("0").pause(Duration.ofMillis(250)).keyUp("8").keyUp("0")
                .keyDown("6").pause(Duration.ofMillis(250)).keyUp("6")
                .keyDown("8").keyDown("0").pause(Duration.ofMillis(250)).keyUp("8").keyUp("0")
                .keyDown("3").pause(Duration.ofMillis(250)).keyUp("3")
                .keyDown("8").keyDown("0").pause(Duration.ofMillis(250)).keyUp("8").keyUp("0")
                .keyDown("6").pause(Duration.ofMillis(250)).keyUp("6")
                .keyDown("8").keyDown("0").pause(Duration.ofMillis(250)).keyUp("8").keyUp("0")
                .keyDown("3").pause(Duration.ofMillis(250)).keyUp("3")
                .keyDown("8").keyDown("0").pause(Duration.ofMillis(250)).keyUp("8").keyUp("0")
                .keyDown("6").pause(Duration.ofMillis(250)).keyUp("6")
                .keyDown("8").keyDown("0").pause(Duration.ofMillis(250)).keyUp("8").keyUp("0")
                .keyDown("3").pause(Duration.ofMillis(250)).keyUp("3")
                .keyDown("8").keyDown("0").pause(Duration.ofMillis(250)).keyUp("8").keyUp("0")
                .keyDown("c").pause(Duration.ofMillis(250)).keyUp("c")
                .keyDown("3").keyDown("5").keyDown("u").pause(Duration.ofMillis(250)).keyUp("3").keyUp("5").keyUp("u")
                .keyDown("m").pause(Duration.ofMillis(250)).keyUp("m")
                .keyDown("5").keyDown("u").pause(Duration.ofMillis(250)).keyUp("5").keyUp("u")
                .keyDown("3").pause(Duration.ofMillis(250)).keyUp("3")
                .keyDown("5").keyDown("u").pause(Duration.ofMillis(250)).keyUp("5").keyUp("u")
                .keyDown("m").pause(Duration.ofMillis(250)).keyUp("m")
                .keyDown("5").keyDown("u").pause(Duration.ofMillis(250)).keyUp("5").keyUp("u")
                .keyDown("3").pause(Duration.ofMillis(250)).keyUp("3")
                .keyDown("5").keyDown("u").pause(Duration.ofMillis(250)).keyUp("5").keyUp("u")
                .keyDown("m").pause(Duration.ofMillis(250)).keyUp("m")
                .keyDown("5").keyDown("u").pause(Duration.ofMillis(250)).keyUp("5").keyUp("u")
                .keyDown("3").pause(Duration.ofMillis(250)).keyUp("3")
                .keyDown("5").keyDown("u").pause(Duration.ofMillis(250)).keyUp("5").keyUp("u")
                .keyDown("m").pause(Duration.ofMillis(250)).keyUp("m")
                .keyDown("5").keyDown("u").pause(Duration.ofMillis(250)).keyUp("5").keyUp("u")
                .keyDown("h").pause(Duration.ofMillis(250)).keyUp("h")
                .keyDown("6").keyDown("8").keyDown("0").pause(Duration.ofMillis(250)).keyUp("6").keyUp("8").keyUp("0")
                .keyDown("3").pause(Duration.ofMillis(250)).keyUp("3")
                .keyDown("8").keyDown("0").pause(Duration.ofMillis(250)).keyUp("8").keyUp("0")
                .keyDown("6").pause(Duration.ofMillis(250)).keyUp("6")
                .keyDown("8").keyDown("0").pause(Duration.ofMillis(250)).keyUp("8").keyUp("0")
                .keyDown("3").pause(Duration.ofMillis(250)).keyUp("3")
                .keyDown("8").keyDown("0").pause(Duration.ofMillis(250)).keyUp("8").keyUp("0")
                .keyDown("6").pause(Duration.ofMillis(250)).keyUp("6")
                .keyDown("8").keyDown("0").pause(Duration.ofMillis(250)).keyUp("8").keyUp("0")
                .keyDown("3").pause(Duration.ofMillis(250)).keyUp("3")
                .keyDown("8").keyDown("0").pause(Duration.ofMillis(250)).keyUp("8").keyUp("0")
                .keyDown("6").pause(Duration.ofMillis(250)).keyUp("6")
                .keyDown("8").keyDown("0").pause(Duration.ofMillis(250)).keyUp("8").keyUp("0")
                .keyDown("3").pause(Duration.ofMillis(250)).keyUp("3")
                .keyDown("8").keyDown("0").pause(Duration.ofMillis(250)).keyUp("8").keyUp("0")
                .keyDown("3").keyDown("c").keyDown("0").pause(Duration.ofMillis(250)).keyUp("3").keyUp("c").keyUp("0")
                .pause(Duration.ofMillis(250))
                .keyDown("r").keyDown("v").keyDown("[").pause(Duration.ofMillis(250)).keyUp("r").keyUp("v").keyUp("[")
                .pause(Duration.ofMillis(250))
                .keyDown("5").keyDown("g").keyDown("=").pause(Duration.ofMillis(250)).keyUp("5").keyUp("g").keyUp("=")
                .pause(Duration.ofMillis(250))
                .keyDown("m").keyDown("u").pause(Duration.ofMillis(250)).keyUp("m").keyUp("u")
                .pause(Duration.ofMillis(250))
                .keyDown("3").pause(Duration.ofMillis(250)).keyUp("3")
                .keyDown("5").keyDown("u").pause(Duration.ofMillis(250)).keyUp("5").keyUp("u")
                .keyDown("m").pause(Duration.ofMillis(250)).keyUp("m")
                .keyDown("5").keyDown("u").pause(Duration.ofMillis(250)).keyUp("5").keyUp("u")
                .keyDown("3").pause(Duration.ofMillis(250)).keyUp("3")
                .keyDown("5").keyDown("u").pause(Duration.ofMillis(250)).keyUp("5").keyUp("u")
                .keyDown("m").pause(Duration.ofMillis(250)).keyUp("m")
                .keyDown("5").keyDown("u").pause(Duration.ofMillis(250)).keyUp("5").keyUp("u")
                .keyDown("h").pause(Duration.ofMillis(250)).keyUp("h")
                .keyDown("6").keyDown("8").keyDown("0").pause(Duration.ofMillis(250)).keyUp("6").keyUp("8").keyUp("0")
                .keyDown("3").pause(Duration.ofMillis(250)).keyUp("3")
                .keyDown("8").keyDown("0").pause(Duration.ofMillis(250)).keyUp("8").keyUp("0")
                .keyDown("6").pause(Duration.ofMillis(250)).keyUp("6")
                .keyDown("8").keyDown("0").pause(Duration.ofMillis(250)).keyUp("8").keyUp("0")
                .keyDown("3").pause(Duration.ofMillis(250)).keyUp("3")
                .keyDown("8").keyDown("0").pause(Duration.ofMillis(250)).keyUp("8").keyUp("0")
                .keyDown("6").pause(Duration.ofMillis(250)).keyUp("6")
                .keyDown("8").keyDown("0").pause(Duration.ofMillis(250)).keyUp("8").keyUp("0")
                .keyDown("3").pause(Duration.ofMillis(250)).keyUp("3")
                .keyDown("8").keyDown("0").pause(Duration.ofMillis(250)).keyUp("8").keyUp("0")
                .keyDown("6").pause(Duration.ofMillis(250)).keyUp("6")
                .keyDown("8").keyDown("0").pause(Duration.ofMillis(250)).keyUp("8").keyUp("0")
                .keyDown("3").pause(Duration.ofMillis(250)).keyUp("3")
                .keyDown("8").keyDown("0").pause(Duration.ofMillis(250)).keyUp("8").keyUp("0")
                .keyDown("3").keyDown("c").keyDown("0").pause(Duration.ofMillis(250)).keyUp("3").keyUp("c").keyUp("0")
                .pause(Duration.ofMillis(250))
                .keyDown("r").keyDown("v").keyDown("[").pause(Duration.ofMillis(250)).keyUp("r").keyUp("v").keyUp("[")
                .pause(Duration.ofMillis(250))
                .keyDown("5").keyDown("g").keyDown("=").pause(Duration.ofMillis(250)).keyUp("5").keyUp("g").keyUp("=")
                .pause(Duration.ofMillis(250))
                .keyDown("3").keyDown("0").pause(Duration.ofMillis(250)).keyUp("3").keyUp("0")
                .pause(Duration.ofMillis(250))
                .keyDown("m").keyDown("u").pause(Duration.ofMillis(250)).keyUp("m").keyUp("u")
                .pause(Duration.ofMillis(250))
                .keyDown("c").keyDown("3").keyDown("0").pause(Duration.ofMillis(250)).keyUp("c").keyUp("3").keyUp("0")
                .pause(Duration.ofMillis(750)).perform();
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
                actions1.keyDown(Keys.ARROW_UP).keyUp(Keys.ARROW_UP).keyDown(Keys.ARROW_UP).keyUp(Keys.ARROW_UP).keyDown(Keys.ARROW_UP).keyUp(Keys.ARROW_UP).keyDown(Keys.ARROW_UP).keyUp(Keys.ARROW_UP).perform();
                break;
            case ACCOMPANIMENT:
                Actions actions2 = new Actions(driver);
                actions2.keyDown(Keys.ARROW_LEFT).keyUp(Keys.ARROW_LEFT).perform();
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
