// Coin Change (Count Ways)

public class NumberOfWaysCoinChange {
    public int count(int coins[], int sum) {
        int dp[] = new int[sum+1];
        dp[0] = 1;
        for(int n : coins)
            for(int i=n;i<=sum;i++){
                dp[i] += dp[i-n];
            }
        return dp[sum];
    }
}
