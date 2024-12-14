package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LobbyPage extends BasePage<LobbyPage> {

    public LobbyPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()=\"'s room\"]")
    private WebElement lobbyTitle;
    @FindBy(xpath = "//div[@class='sustain-div']//span[@class='slider slider-accent']")
    private WebElement sustainCheckbox;
    @FindBy(xpath = "//i[@class='bi bi-arrows-collapse']")
    private WebElement collapseChat;
    @FindBy(xpath = "//div[@data-key='36']")
    private WebElement d;
    @FindBy(xpath = "//div[@data-key='48']")
    private WebElement ddo;
    @FindBy(xpath = "//div[@data-key='51']")
    private WebElement mi;
    @FindBy(xpath = "//div[@data-key='55']")
    private WebElement sol;

    public void playTheGameIsOn() {
        Actions actions = new Actions(driver);
        actions
                .keyDown(Keys.ARROW_UP).keyUp(Keys.ARROW_UP)
                .keyDown(Keys.ARROW_UP).keyUp(Keys.ARROW_UP)
                .keyDown(Keys.ARROW_UP).keyUp(Keys.ARROW_UP)
                .keyDown(Keys.ARROW_UP).keyUp(Keys.ARROW_UP);
        actions.keyDown("1").pause(Duration.ofMillis(250)).keyUp("1")
                .keyDown("5").pause(Duration.ofMillis(250)).keyUp("5")
                .pause(Duration.ofMillis(250))
                .keyDown("5").pause(Duration.ofMillis(250)).keyUp("5")
                .keyDown("r").pause(Duration.ofMillis(125)).keyUp("r")
                .keyDown("5").pause(Duration.ofMillis(125)).keyUp("5")
                .keyDown("t").pause(Duration.ofMillis(500)).keyUp("t")
                .keyDown("5").pause(Duration.ofMillis(250)).keyUp("5")
                .keyDown("4").pause(Duration.ofMillis(250)).keyUp("4")
                .keyDown("8").pause(Duration.ofMillis(1750)).keyUp("8")
                .keyDown("4").pause(Duration.ofMillis(250)).keyUp("4")
                .keyDown("8").pause(Duration.ofMillis(250)).keyUp("8")
                .pause(Duration.ofMillis(250))
                .keyDown("8").pause(Duration.ofMillis(250)).keyUp("8")
                .keyDown("u").pause(Duration.ofMillis(125)).keyUp("u")
                .keyDown("8").pause(Duration.ofMillis(125)).keyUp("8")
                .keyDown("9").pause(Duration.ofMillis(500)).keyUp("9")
                .keyDown("8").pause(Duration.ofMillis(250)).keyUp("8")
                .keyDown("o").pause(Duration.ofMillis(2000)).keyUp("o")
                .keyDown("=").pause(Duration.ofMillis(250)).keyUp("=")
                .keyDown("8").pause(Duration.ofMillis(250)).keyUp("8")
                .pause(Duration.ofMillis(250))
                .keyDown("8").pause(Duration.ofMillis(250)).keyUp("8")
                .keyDown("9").pause(Duration.ofMillis(250)).keyUp("9")
                .keyDown("o").pause(Duration.ofMillis(250)).keyUp("o")
                .keyDown("9").pause(Duration.ofMillis(60)).keyUp("9")
                .keyDown("o").pause(Duration.ofMillis(60)).keyUp("o")
                .keyDown("9").pause(Duration.ofMillis(60)).keyUp("9")
                .keyDown("8").pause(Duration.ofMillis(310)).keyUp("8")
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
                .keyDown("8").pause(Duration.ofMillis(2500));


        actions.perform();

    }

    /* .keyDown("1").keyDown("w").keyDown("5").pause(Duration.ofMillis(250))
              .keyUp("1").keyUp("w").keyUp("5").pause(Duration.ofMillis(250))
              .keyDown("1").keyDown("w").keyDown("5").pause(Duration.ofMillis(250))
              .keyUp("1").keyUp("w").keyUp("5").pause(Duration.ofMillis(250))
              .keyDown("1").keyDown("w").keyDown("5").pause(Duration.ofMillis(250))
              .keyUp("1").keyUp("w").keyUp("5").pause(Duration.ofMillis(250))
              .keyDown("1").keyDown("w").keyDown("5").pause(Duration.ofMillis(250))
              .keyUp("1").keyUp("w").keyUp("5").keyUp("8");*/
    public LobbyPage configureLobby() {
        waitElementToBeVisible(sustainCheckbox);
        if (!sustainCheckbox.isSelected()) {
            sustainCheckbox.click();
        }
        waitElementToBeVisible(collapseChat);
        collapseChat.click();
        return this;
    }

    @Override
    public LobbyPage waitForPageToLoad() {
        waitElementToBeVisible(sustainCheckbox);
        return this;
    }
}
