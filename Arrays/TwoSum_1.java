package Arrays;

import java.util.Arrays;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target
public class TwoSum_1 {
    public static int[] twoSum(int[] nums, int target){
        int length = nums.length;
        int[] list = new int[2];
        int k=0;
        for(int i = 0; i<length; i++){
            for(int j=i+1;j<length;j++){
                if(nums[i]+nums[j]==target){
                    list[k]=nums[i];
                    list[k+1]=nums[j];
                    k++;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,5,6,7};
        int target=6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
