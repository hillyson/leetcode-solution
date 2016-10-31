import org.junit.Assert;
import org.junit.Test;

/**
 * No 371 Test
 * Created by Hillyson on 16/10/30.
 */
public class No371Test {
    @Test
    public void solutionTest() {
        No371 testClass = new No371();
        Assert.assertEquals(testClass.getSum(2,7), 9);
        Assert.assertEquals(testClass.getSum(2,3), 5);
        Assert.assertEquals(testClass.getSum(1,6), 7);
        Assert.assertEquals(testClass.getSum(6,7), 13);
        Assert.assertEquals(testClass.getSum(101,213), 314);
        Assert.assertEquals(testClass.getSum(4891,115632), 120523);
    }
}
