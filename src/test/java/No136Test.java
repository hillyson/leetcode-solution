import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * No 136 Test
 * Created by Hillyson on 16/10/30.
 */
public class No136Test {
    @Test
    public void solutionTest() {
        No136 testClass = new No136();
        Assert.assertEquals(testClass.singleNumber(new int[]{1,2,0,2,1,}), 0);
        Assert.assertEquals(testClass.singleNumber(new int[]{1,2,3,7,9,0,3,4,2,9,1,0,7}),4);
    }
}
