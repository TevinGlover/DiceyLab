import java.util.Random;

public class Dice {
// need constructor (int number of dice)
    int numberOfDice;
public Dice(int numberOfDice){
     this.numberOfDice = numberOfDice;
}
// create a method
    // toss dice & add up andd addcup the value
    public Integer tossAndSum(){
    Integer sum = 0;

    Random random = new Random();
    // need a for loop to add
    for (int i = 0; i < this.numberOfDice; i++){
        sum += random.nextInt(6)+1;
        }
    return sum;

    }
}
