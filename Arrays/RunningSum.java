package Arrays;

public class RunningSum {
    public static int[] runningSum(int[] nums) {
        int[] sumarr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int j=i,sum=0;
            while(j>=0){
                sum+=nums[j--];
            }
            sumarr[i]=sum;
        }
        return sumarr;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int[] arr=runningSum(nums);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
