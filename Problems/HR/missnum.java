import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class missnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int n1=sc.nextInt();
            int arr[]=new int[n1];
            for(int i=0;i<n1;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(missingnum(arr));
        }
        sc.close();
    }
    static int missingnum(int arr[]){
        Set<Integer> seen=new HashSet<>();
        for(int num:arr){
            seen.add(num);
        }
        for(int i=1;i<=arr.length+1;i++){
            if(!seen.contains(i)){
                return i;
            }
        }
        return -1;
    }    
}
