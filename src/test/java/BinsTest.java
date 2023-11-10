import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinsTest {

    @Test
public void testBinConstructor(){
        int min= 2;
        int max = 12;
        Bins bins = new Bins(min, max);
        Assert.assertNotNull(bins);

    }
public void testGetBin(){

        int min = 2;
        int max = 12;
    Bins bins = new Bins(min, max);

   Integer actual = bins.getBin(4);
   Assert.assertEquals(0,actual.intValue());
}




}