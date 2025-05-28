package Arrays;

public class BuySellStock {
    public int stockBuySell(int[] arr, int n) {
        if (n == 0) return 0;
        int minPrice = arr[0];
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] < minPrice) {
                minPrice = arr[i];
            } else {
                int profit = arr[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}
