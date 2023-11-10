
public class Bins {
    int min;
    int max;
Integer [] possibleValues;
    public Bins(int min, int max) {// have to create a constructor(int min, max)
        this.min = min;
        this.max = max;
        possibleValues = new Integer[max - min +1]; // create array
    }


   public Integer getBin(int binNumber){// create get bin (int bin number)

        return this.possibleValues[binNumber - this.min];
   }

   // find the value at bin number

   //return value

    // increment binBin(int binNumber)
    // increment value at binNumber +1
}
