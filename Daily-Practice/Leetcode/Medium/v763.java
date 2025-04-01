import java.util.ArrayList;
import java.util.List;

public class v763 {
    public List<Integer> partitionLabels(String s){
        int lastocc[]=new int[26];
        for(int i=0;i<s.length();++i){
            lastocc[s.charAt(i)-'a']=i;
        }

        int partiend=0,partistat=0;
        List<Integer> partisize=new ArrayList<>();
        for(int i=0;i<s.length();++i){
            partiend=Math.max(partiend,lastocc[s.charAt(i)-'a']);

            if(i==partiend){
                partisize.add(i-partistat+1);
                partistat=i+1;
            }
        }
        return partisize;
    }
    
}
