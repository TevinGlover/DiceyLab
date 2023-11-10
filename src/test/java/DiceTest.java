import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiceTest {

    @Test
    public void diceRoll() {
        int numberOfDice= 2;
        Dice dice = new Dice(numberOfDice);

        Assert.assertNotNull(dice);
    }
public void testTossAndSum() {
    int numberOfDice =2;
    int max = numberOfDice * 6;
    Dice dice = new Dice(numberOfDice);

    Integer actual = dice.tossAndSum();

    Assert.assertTrue((actual<= max)); // the max
    Assert.assertTrue((actual>= numberOfDice)); // the lows
    }
}

