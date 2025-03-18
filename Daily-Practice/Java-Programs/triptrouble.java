import java.util.HashMap;
import java.util.Scanner;

public class triptrouble {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long a=sc.nextLong();
            long arr[]=new long[(int)a];
            HashMap<Long,Integer> map=new HashMap<>();
            for(int i=0;i<a;i++){
                arr[i]=sc.nextLong();
            }
           // List<Long> duplicates=new ArrayList<>();
            for(int i=0;i<a;i++){
                if(map.containsKey(arr[i])){
             //       duplicates.add(arr[i]);
                    map.put(arr[i], map.get(arr[i]) + 1);
                }
                else{
                    map.put(arr[i],1);
                }
            }
            for (int i = 0; i < a; i++) {
                if (map.get(arr[i]) == 1) {
                System.out.print(arr[i] + " ");
            }
        }
        }
        sc.close();
    }
}
