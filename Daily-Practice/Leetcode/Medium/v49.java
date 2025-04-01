import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class v49 {
    public List<List<String>> groupAnagrams(String[] strs){
        Map<String,List<String>> map=new HashMap<>();
        for(String word:strs){
            char chars[]=word.toCharArray();
            Arrays.sort(chars);
            String sortword=new String(chars);

            if(!map.containsKey(sortword)){
                map.put(sortword,new ArrayList<>());
            }
            map.get(sortword).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
