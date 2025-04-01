import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class repeatnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            long a=sc.nextLong();
            long arr[]=new long[(int)a];
            HashMap<Long,Integer> map=new HashMap<>();
            for(int i=0;i<a;i++){
                arr[i]=sc.nextLong();
            }

            List<Long> list=new ArrayList<>();
            for(int i=0;i<a;i++){
                if(map.containsKey(arr[i])){
                    list.add(arr[i]);
                }
                else{
                    map.put(arr[i],i);
                }
            }
            Collections.sort(list);
            for(long num:list){
                System.out.print(num+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
