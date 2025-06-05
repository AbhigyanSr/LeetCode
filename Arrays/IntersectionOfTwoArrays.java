package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr= new ArrayList<>();
        for (int j : nums1) {
            for (int k : nums2) {
                if (j == k) {
                    arr.add(j);
                    break;
                }
            }
        }
        int[] nums = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            nums[i] = arr.get(i);
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};
        int[] nums=intersection(nums1,nums2);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
