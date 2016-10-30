import java.util.ArrayList;
import java.util.List;

/**
 * Write a program that outputs the string representation of numbers from 1 to n.

 * But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”.
 * For numbers which are multiples of both three and five output “FizzBuzz”.
 * No 412
 * Created by Hillyson on 16/10/30.
 */
public class No412 {
    public List<String> solution(int n){
        List<String> list = new ArrayList<String>();
        int[] deltaNumArray = { 3, 2, 1, 3, 1, 2, 3};
        String[] deltaWordArray = {"Fizz", "Buzz", "Fizz", "Fizz", "Buzz", "Fizz", "FizzBuzz"};
        int deltaIndex = 0;
        int lastNum = deltaNumArray[deltaIndex];
        for (int i = 1 ; i <= n ; i++) {
            if(i == lastNum)
            {
                list.add(deltaWordArray[deltaIndex++]);
                if(deltaIndex == 7){
                    deltaIndex = 0;
                }
                lastNum += deltaNumArray[deltaIndex];
            }
            else
            {
                list.add(Integer.toString(i));
            }
        }
        return list;
    }
}
