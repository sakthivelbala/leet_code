// Coin Change (Minimum Coins)

public class MinCoinsForTarget {
    public int minCoins(int coins[], int sum) {
        int dp[] = new int[sum+1];
        for(int i=0;i<=sum;i++){
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for(int n : coins){
            for(int i=n;i<=sum;i++){
                if(dp[i-n] != Integer.MAX_VALUE)
                    dp[i] = Math.min(dp[i], dp[i-n]+1);
            }
        }
        return dp[sum]==Integer.MAX_VALUE ? -1 : dp[sum];
    }
}
