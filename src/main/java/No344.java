/**
 * No344 Solution
 * Reverse String
 * Created by Hillyson on 16/10/30.
 */
public class No344 {
    public String solution(String s) {
        return new StringBuilder(s).reverse().toString();

//        char[] list = s.toCharArray();
//        int i = 0;
//        int j = list.length - 1;
//        char exchange;
//        while(i < j){
//            exchange = list[i];
//            list[i++] = list[j];
//            list[j--] = exchange;
//        }
//        return new String(list);
    }
}
