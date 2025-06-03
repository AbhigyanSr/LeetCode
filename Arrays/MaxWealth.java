package Arrays;
public class MaxWealth {
    public static int maximumWealth(int[][] accounts) {
        int max=0,rows=accounts.length,cols=accounts[0].length;
        for (int i = 0; i < rows; i++) {
            int sum=0;
            for (int j = 0; j < cols; j++) {
                sum+=accounts[i][j];
            }
            if(sum>max) max=sum;
        }

        return max;
    }

    public static void main(String[] args) {
        int[][] accounts={{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(accounts));
    }
}
