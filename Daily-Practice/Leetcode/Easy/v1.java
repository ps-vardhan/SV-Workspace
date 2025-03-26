import java.util.HashMap;
import java.util.Map;

public class v1 {
    public static void main(String[] args) {

        v1 solution = new v1();

        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Result for test case 1: [" + result1[0] + ", " + result1[1] + "]");
    }

    
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int comp=target-nums[i];
            if(map.containsKey(comp)){
                return new int[]{map.get(comp),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
    
    
    /*
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){ 
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    */

    /*
    public int [] twoSum(int nums[],int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(map.containsKey(diff) && map.get(diff)!=i){
                return new int[]{i,map.get(diff)};
            }
        }
        return new int[]{};
    }
    */

}




