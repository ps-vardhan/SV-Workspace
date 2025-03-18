import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class findfreq {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();    
        }
        Map<Long,Integer> map=new HashMap<>();
            
            for(long nums:arr){
                map.put(nums,map.getOrDefault(nums, 0)+1);
            }
        long num=sc.nextLong();
        while(num-->0){
            long value=sc.nextLong();

            
            System.out.println(freqfinder(map, value));
        }
    }

    public static long freqfinder(Map<Long,Integer> map,long value){
        return map.getOrDefault(value,0);
        
    }
}
