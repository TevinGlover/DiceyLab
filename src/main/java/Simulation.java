public class Simulation {
// create constroctor  ( int number of dies, int numberofTossess)

    int numberOfDices;
    int numberOfTosses;

    // create runSumlation Method

    public Simulation(int numberOfDices, int numberOfTosses) {

        this.numberOfDices = numberOfDices;
        this.numberOfTosses = numberOfTosses;
    }
    // use values in constructor
    // to simulate the toss throwing


    // create a run simulation
    public void runSimulation() {
        Dice dice = new Dice(this.numberOfDices);
        Bins bins = new Bins(this.numberOfDices, this.numberOfDices * 6); // minimal number of dice to max.

        // forloop tossses for any amount of throws
        for (int i = 0; i < this.numberOfTosses; i++) {
            bins.incrementBin(dice.tossAndSum()); // increment the value by the tosses method.

        }
        for (int i = 2; i < numberOfDices * 6; i++) {
            System.out.println(" Value of At bin" + i + " how many times : " + bins.getBin(i));
        }
    }
}