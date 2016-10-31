/**
 * No 136 Solution
 * Created by Hillyson on 16/10/31.
 */
public class No136 {
    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length - 2;i+=2){//i必定为偶数, 最后剩两个数字无需比较，最后一个必定是Single Number
            for (int j = i + 1;j < nums.length;j++){
                //遇到j位数字与i位数字相同，则j位和i+1位交换
                if(nums[i] == nums[j]){
                    //交换两个数字
                    int temp = nums[i+1];
                    nums[i+1] = nums[j];
                    nums[j] = temp;
                    break;
                }
            }
            //若i位不等于i+1位数字，则i位为Single Number
            if(nums[i] != nums[i+1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}
