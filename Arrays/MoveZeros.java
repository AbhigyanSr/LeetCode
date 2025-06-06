package Arrays;
import java.util.Arrays;
public class MoveZeros {
    public static void moveZeros(int[] nums){
        int index=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                nums[index++]=nums[i];
            }
        }
        while(index<nums.length){
            nums[index++]=0;
        }
        for(int num:nums){
            System.out.print(num);
        }
    }

    public static void main(String[] args) {
        int[] nums={0,0,1,3,13};
        moveZeros(nums);
    }
}