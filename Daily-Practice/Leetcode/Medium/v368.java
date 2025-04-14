import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class v368 {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int dp[]=new int[nums.length];
        int prev[]=new int[nums.length];
        Arrays.fill(dp,1);
        Arrays.fill(prev,-1);
        int max=0;
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0 && dp[i]<dp[j]+1){
                    dp[i]=dp[j]+1;
                    prev[i]=j;
                }
            }
            if(dp[i]>dp[max]) max=i;
        }
        List<Integer> result=new ArrayList<>();
        for(int i=max;i>=0;i=prev[i]){
            result.add(nums[i]);
            if(prev[i]==-1) break;
        }
        return result;
    }
}
