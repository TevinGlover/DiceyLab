import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimulationTest {


    @Test
    public void testSmulationConsturtor(){
        int numberOfDice =2;
        int numberOfTosses = 10;
        Simulation simulation = new Simulation(numberOfDice, numberOfTosses);
        Assert.assertNotNull(simulation);
    }

    @Test
    void testRunSimulation() {
        int numberOfDice =2;
        int numberOfTosses = 10;
        Simulation simulation = new Simulation(numberOfDice, numberOfTosses);


    }
}