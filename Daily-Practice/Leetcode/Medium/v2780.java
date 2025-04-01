import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class v2780 {
    public int minimumIndex(List<Integer> nums) {
        Map<Integer,Integer> firstmap=new HashMap<>();
        Map<Integer,Integer> secondmap=new HashMap<>();
        int n=nums.size();

        for(int num:nums){
            secondmap.put(num,secondmap.getOrDefault(num,0)+1);
        }
        for(int index=0;index<n;index++){
            int num=nums.get(index);
            secondmap.put(num,secondmap.get(num)-1);
            firstmap.put(num,firstmap.getOrDefault(num, 0)+1);

            if(firstmap.get(num)*2>index+1 && secondmap.get(num)*2>n-index-1){
                return index;
            }
        }
        return -1;
    }
}
