import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class triptrouble {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int n1=sc.nextInt();
            int arr[]=new int[n1];
            for(int i=0;i<n1;i++){
                arr[i]=sc.nextInt();
            }

            System.out.println(tripletrouble(arr));
        }
        sc.close();
    }
    static int tripletrouble(int arr[]){
        Set<Integer> seenonce=new HashSet<>();
        Set<Integer> seentwice=new HashSet<>();
        for(int num:arr){
            if(seenonce.contains(num)){
                seentwice.add(num);
            }else{
                seenonce.add(num);
            }

        }
        seenonce.removeAll(seentwice);
        return seenonce.iterator().next();
    }
}
