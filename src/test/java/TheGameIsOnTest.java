import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import pages.LobbyPage;
import songs.TheGameIsOnSong;

import java.util.concurrent.Phaser;

import static pages.StartPage.PASSWORD;

@Execution(ExecutionMode.CONCURRENT)

public class TheGameIsOnTest extends BaseTest {

    private static final Phaser phaser = new Phaser(2);

    @Test
    public void playMelodyTest() {
        startPage.get().waitForPageToLoad().createNewRoom(PASSWORD);
        lobbyPage.get().waitForPageToLoad().configureLobby(LobbyPage.PlayingParts.MELODY);
        phaser.arriveAndAwaitAdvance();
        lobbyPage.get().play(TheGameIsOnSong.melody());
    }

    @Test
    public void playAccompanimentTest() {
        startPage.get().waitForPageToLoad().createNewRoom(PASSWORD);
        lobbyPage.get().waitForPageToLoad().configureLobby(LobbyPage.PlayingParts.ACCOMPANIMENT);
        phaser.arriveAndAwaitAdvance();
        lobbyPage.get().play(TheGameIsOnSong.accompaniment());
    }

}
