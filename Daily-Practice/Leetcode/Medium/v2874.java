public class v2874 {
    public long maximumTripletValue(int[] nums) {
        int n=nums.length;
        long result=0,dmax=0,imax=0;

        for(int i=0;i<n;i++){
            result=Math.max(result,dmax*nums[i]);
            dmax=Math.max(dmax,imax-nums[i]);
            imax=Math.max(imax,nums[i]);
        }
        return result;
    }
}
