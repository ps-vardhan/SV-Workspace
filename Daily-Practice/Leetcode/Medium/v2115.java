import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class v2115 {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies){
        Set<String> available=new HashSet<>();
        for(String supply:supplies){
            available.add(supply);
        }

        Queue<Integer> reciepeQueue=new LinkedList<>();
        for(int idx=0;idx<recipes.length;++idx){
            reciepeQueue.offer(idx);
        }

        List<String> createdRecip=new ArrayList<>();
        int lastSize=-1;

        while(available.size()>lastSize){
            lastSize=available.size();
            int queueSize=reciepeQueue.size();
            
            while(queueSize-->0){
                int recipeIdx=reciepeQueue.poll();
                boolean canCreate=true;

                for(String ingredent:ingredients.get(recipeIdx)){
                    if(!available.contains(ingredent)){
                        canCreate=false;
                        break;
                    }
                }
                if(!canCreate){
                    reciepeQueue.offer(recipeIdx);
                }else{
                    available.add(recipes[recipeIdx]);
                    createdRecip.add(recipes[recipeIdx]);
                }
            }
        }
        return createdRecip;
    }
}
