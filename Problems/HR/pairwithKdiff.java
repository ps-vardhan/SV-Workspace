import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class pairwithKdiff {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++){
            int n1=sc.nextInt();
            int key=sc.nextInt(); 
            int arr[]=new int[n1];
            for(int j=0;j<n1;j++){
                arr[j]=sc.nextInt();
            }
            if(pairfinder(key,arr)){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        } 
        sc.close();
    }
    static boolean pairfinder(int key,int arr[]){
        Set<Integer> seen=new HashSet<>();
        for(int num:arr){
            if(seen.contains(num-key)||seen.contains(num+key)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
