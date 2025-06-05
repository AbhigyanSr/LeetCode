package Arrays;

public class MajorityElement {
    public static int majorityElement(int[] nums){
        if (nums == null) return 0;
        if(nums.length==1) return nums[0];
        int yes=0;
        for (int i = 0; i < nums.length; i++) {
            int count=0;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                        count++;
                }
            }
            if(count>=(nums.length/2)) yes=nums[i];
        }
        return yes;
    }

    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,1};
        System.out.println(majorityElement(nums));
    }
}
