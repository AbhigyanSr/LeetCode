package Arrays;

public class SingleNumber {
    public static int singleNumber(int[] nums){
        if(nums.length==0) return nums[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if((nums[i]^nums[j])==0){
                    nums[i]=0;
                    nums[j]=0;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0) System.out.println(nums[i]);
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] nums={1};
        singleNumber(nums);
    }
}
