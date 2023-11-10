
public class Bins {
    int min;
    int max;
int [] possibleValues;
    public Bins(int min, int max) {// have to create a constructor(int min, max)
        this.min = min;
        this.max = max;
        possibleValues = new int[max - min +1]; // create array
    }


   public Integer getBin(int binNumber){// create get bin (int bin number)

        return this.possibleValues[binNumber - this.min];
   }

    public void incrementBin(int binNumber) {
        this.possibleValues[binNumber -this.min]++; //is incrementing

    }

    // find the value at bin number

   //return value

    // increment binBin(int binNumber)
    // increment value at binNumber +1
}
