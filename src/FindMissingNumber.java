public class FindMissingNumber {
    public static int findMissingNumber(int[] nums, int n){
        int expectedSum = (n * (n+1))/2;
        System.out.println(expectedSum);

        int actualSum = 0;
        for (int num:nums){
            System.out.println("num value is: " + num);
            actualSum += num;
            System.out.println("actualsum value is: " + actualSum);
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,5};
        int n=5;
        int missingNumber = findMissingNumber(nums,n);
        System.out.println(missingNumber);
    }
}
