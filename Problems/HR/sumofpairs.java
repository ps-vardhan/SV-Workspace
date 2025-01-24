import java.util.HashSet;
import java.util.Scanner;
public class sumofpairs {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int n1=sc.nextInt();
            int key=sc.nextInt();
            int arr[]=new int[n1];
            for(int i=0;i<n1;i++){
                arr[i]=sc.nextInt();
            }
            if(pairfinder(key,arr)){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }
        sc.close();
    }
    static boolean pairfinder(int key,int arr[]){
        HashSet<Integer> hash=new HashSet<>();
        for(int num:arr){
            int comp=key-num;
            if(hash.contains(comp)){
                return true;
            }
            hash.add(num);
        }
        return false;
    }
}