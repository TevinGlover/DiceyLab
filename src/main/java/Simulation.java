public class Simulation {
// create constroctor  ( int number of dies, int numberofTossess)

    int numberOfDices;
    int numberOfTosses;
    Bins bins;

    // create runSumlation Method

    public Simulation(int numberOfDices, int numberOfTosses) {

        this.numberOfDices = numberOfDices;
        this.numberOfTosses = numberOfTosses;
        this.bins = new Bins(this.numberOfDices, this.numberOfDices * 6); // minimal number of dice to max.
    }
    // use values in constructor
    // to simulate the toss throwing


    // create a run simulation
    public void runSimulation() {
        Dice dice = new Dice(this.numberOfDices);


        // forloop tossses for any amount of throws
        for (int i = 0; i < this.numberOfTosses; i++) {
            this.bins.incrementBin(dice.tossAndSum()); // increment the value by the tosses method.

        }
       /* for (int i = 2; i <= numberOfDices * 6; i++) {
            System.out.println(" Value of At bin" + i + " : " + this.bins.getBin(i));
        }*/
    }





    /*
    Format;
    Stars:
    dice;
    number;
    precent;
     */


    public void  printResult(){
        System.out.println("***");
        System.out.println("Sumulation" + this.numberOfDices + " dice tossed for " + this.numberOfTosses +"times") ;
        System.out.println("***");

        for( int i = numberOfDices; i <= numberOfDices * 6; i++){
            // _value:______#tossed__:_Percentage_******\
            //Star
            double percent =(double)this.bins.getBin(i)/this.numberOfTosses;
            int num =(int)(percent * 100);
            String stars = "*".repeat(num);
            String str = String.format( " %2d :%9d: %1.2f ",i, this.bins.getBin(i),
                    (double)this.bins.getBin(i)/this.numberOfTosses);
            System.out.println(str + " " + stars);
        }
    }
}