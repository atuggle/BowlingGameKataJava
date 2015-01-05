import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {
    
    private Game game = new Game();
    
    public GameTest() {
    }
        
    @Test
    public void canBowlGutterGame() {        
        rollMany(20, 0);
        
        assertEquals(0, game.score());
    }

    @Test
    public void canBowlSpare() {
        game.roll(5);
        game.roll(5);
        game.roll(2);
        game.roll(1);
        rollMany(16,0);
        
        assertEquals(15, game.score());
    }
    
    @Test
    public void canBowlStrike() {
        game.roll(10);
        game.roll(5);
        game.roll(2);
        game.roll(1);
        rollMany(15,0);
        
        assertEquals(25, game.score());
    }
    
    @Test
    public void canBowlPerfectGame() {
        rollMany(21, 10);
        
        assertEquals(300, game.score());
    }
    
    private void rollMany(int times, int pins) {
        for (int i=0; i<times; i++)
            game.roll(pins);
    }
    
}
