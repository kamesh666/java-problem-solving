import java.util.Arrays;
public class arrayClass {
    static int Duplicate_Number(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            System.out.println("i is: "+i);
            System.out.println("nums.length is: "+nums.length);
            if (nums[i] == nums[i-1]) {
                System.out.println("nums[i] is: "+nums[i]);
                System.out.println("nums[i-1] is: "+ nums[i-1]);
                return nums[i];
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,3,4,4,5};
        System.out.println(Duplicate_Number(nums));
    }
}
