import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * No 344 Test
 * Created by Hillyson on 16/10/30.
 */
public class No412Test {
    @Test
    public void solutionTest() {
        No412 testClass = new No412();
        List<String> target = new ArrayList<String>(){{
            add("1");
            add("2");
            add("Fizz");
            add("4");
            add("Buzz");
            add("Fizz");
            add("7");
            add("8");
            add("Fizz");
            add("Buzz");
            add("11");
            add("Fizz");
            add("13");
            add("14");
            add("FizzBuzz");
        }};
        Assert.assertArrayEquals(testClass.solution(15).toArray(),target.toArray());
    }
}
