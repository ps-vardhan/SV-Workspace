public class v416 {

    public boolean canPartition(int[] nums) {
        int totalsum=0;
        for(int num:nums) totalsum+=num;
        if(totalsum%2!=0) return false;
        int targetsum=totalsum/2;
        boolean dp[]=new boolean[targetsum+1];
        for(int num:nums){
            for(int currnum=targetsum;currnum>=num;currnum--){
                dp[currnum]=dp[currnum]|| dp[currnum-num];
            }
        }
        return dp[targetsum];
    }
}