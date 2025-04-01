import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class pairwithK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int a=sc.nextInt();
            int k=sc.nextInt();
            long arr[]=new long[a];
            for(int i=0;i<a;i++){
                arr[i]=sc.nextLong();
            }
            System.out.println(pairk(arr,k));
        }
        sc.close();
    }
    public static boolean pairk(long arr[],int k){
        Set<Long> set=new HashSet<>();
        for(long num:arr){
            if(set.contains(num+k) || set.contains(num-k)){
                return true;
            }
            set.add(num);
        }
        return false;
    }  
}
