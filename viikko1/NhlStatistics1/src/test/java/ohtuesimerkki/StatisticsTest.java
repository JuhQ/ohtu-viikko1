package ohtuesimerkki;

import ohtuesimerkki.Reader;
import ohtuesimerkki.Statistics;

import java.util.ArrayList;
import java.util.List;
import ohtuesimerkki.Player;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class StatisticsTest {

    Reader readerStub = new Reader() {

        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<Player>();

            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri",   "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));

            return players;
        }
    };

    Statistics stats;

    @Before
    public void setUp(){
        // luodaan Statistics-olio joka käyttää "stubia"
        stats = new Statistics(readerStub);
    }

    @Test
    public void searchTest() {
        assertEquals("Kurri", stats.search("Kurri").getName());
        assertEquals(53, stats.search("Kurri").getAssists());
        assertEquals(37, stats.search("Kurri").getGoals());
        assertEquals(90, stats.search("Kurri").getPoints());
        assertEquals("EDM", stats.search("Kurri").getTeam());
        assertEquals(null, stats.search("null"));
    }

    @Test
    public void teamTest() {
        assertEquals(3, stats.team("EDM").size());
        assertEquals(0, stats.team("null").size());
    }

    @Test
    public void topScorersTest() {
        assertEquals(4, stats.topScorers(3).size());
        assertEquals(1, stats.topScorers(0).size());
        assertEquals(0, stats.topScorers(-1).size());
    }
}
