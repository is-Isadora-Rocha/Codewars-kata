package oppositeNumber;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OppositeExampleTests {
    @Test
    public void tests(){
        assertEquals(-1, KataOpposite.opposite(1));
    }
}
