package Arrays;
import java.util.Arrays;

public class Missing_Numbers {
    public int missingNumber(int[] nums){
        int S1=0;
        for(int num:nums){
            S1+=num;
        }
        int n=nums.length;
        int S2=(n*(n+1))/2;
        return S2-S1;
    }
}
