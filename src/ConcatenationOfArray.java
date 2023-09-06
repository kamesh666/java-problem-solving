import java.util.Arrays;

public class ConcatenationOfArray {
    public static int[] getConcatenation(int[] nums) {
        int n= nums.length;
        int[] ans = new int[0];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            System.out.println("ans[i] is: "+ ans[i]);
//            System.out.println("nums[i+n] is: "+ nums[i+n]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
}
