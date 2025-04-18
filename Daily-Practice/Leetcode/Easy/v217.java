import java.util.Arrays;

public class v217 {
    /*

    public boolean containsDuplicate(int[] nums) {
        boolean flag=false;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    flag=true;
                }
            }
        }
        return flag;
    }
    */

    /*
    public boolean containsDuplicate(int []nums){
        boolean flag=false;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                flag=true;
            }
        }
        return flag;
    }
    */

    /*
    public boolean containsDuplicate(int nums[]){
        boolean flag=false;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                flag=true;
            }
            map.put(nums[i],i);
        }
        return flag;
    }

    */

    
    public boolean containsDuplicate(int nums[]){
        return Arrays.stream(nums).distinct().count() < nums.length;
    }
}