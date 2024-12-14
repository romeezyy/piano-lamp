import org.testng.annotations.Test;

import static pages.StartPage.PASSWORD;

public class HappyPathTest extends BaseTest {

    @Test
    public void PLAY_THE_SONG_TEST() {
      startPage
              .waitForPageToLoad()
              .createNewRoom(PASSWORD);
      lobbyPage
              .waitForPageToLoad()
              .configureLobby()
              .playTheGameIsOn();
    }
}
