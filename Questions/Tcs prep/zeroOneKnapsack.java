public class zeroOneKnapsack{
    public static int knapsack(int w, int wt[], int val[],int n){
        int dp[][] = new int[n+1][w+1];
        int row = dp.length;
        int coln = dp[0].length;
       
        
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < coln; j++) {
                int weight = wt[i-1];
                int value = val[i-1];
                if(j < weight){
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], value+dp[i-1][j-weight]);
                }
            }
        }
        return dp[row-1][coln-1];
    }
    public static void main(String[] args) {
        int wt[] = new int[]{2,5,1,3,4};
        int val[] = new int[]{15,14,10,45,30};
        
        // int wt[] = new int[]{10,10,40,50,90};
        // int val[] = new int[]{10,20,20,50,150};

        
        int ans = knapsack(105, wt, val, 5);
        System.out.println("Ans is "+ans);
    }
}