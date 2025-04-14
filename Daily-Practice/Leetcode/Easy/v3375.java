import java.util.HashMap;

public class v3375 {
    public int minOperations(int[] nums, int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            if(i<k){
                return -1;
            }else if(i>k){
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        return map.size();
    }
}
