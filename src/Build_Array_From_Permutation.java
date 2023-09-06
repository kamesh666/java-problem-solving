import java.util.Arrays;

public class Build_Array_From_Permutation {
    public static int[] buildArray(int[] nums){
//        int n= nums.length;
//        for (int i=0; i<n; i++){
//            nums[i] = nums[i] + n*(nums[nums[i]] % n);
//            System.out.print("first for loop" +nums[i]);
//            System.out.println(" ");
//        }
//        for (int i = 0; i < n; i++) {
//            nums[i] = nums[i]/n;
//            System.out.print("sendfor for loop" +nums[i]);
//            System.out.println(" ");
//        }
//        return nums;
        int[] ans = new int[nums.length];
//        System.out.println("ans is: "+ Arrays.toString(ans));
        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[nums[i]];
//            System.out.println("nums[i]"+nums[i]);
//            System.out.println("nums[nums[i]] is: "+ nums[nums[i]]);
//            System.out.println("ans[i] is: "+ans[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }
}
