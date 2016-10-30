import org.junit.Assert;
import org.junit.Test;

/**
 * No 344 Test
 * Created by Hillyson on 16/10/30.
 */
public class No344Test {
    @Test
    public void solutionTest(){
        No344 testClass = new No344();
        Assert.assertTrue(testClass.solution("hello").equals("olleh"));
    }
}
