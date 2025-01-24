import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class repnums {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int n1=sc.nextInt();
            int arr[]=new int[n1];
            for(int j=0;j<n1;j++){
                arr[j]=sc.nextInt();
            }
            repnumfinder(arr);
            sc.close();
        }
    }
    static void repnumfinder(int arr[]){
        Set<Integer> setter=new HashSet<>();
        List<Integer> duplicate=new ArrayList<>();
        for(int num:arr){
            if(setter.contains(num)){
                duplicate.add(num);
            }else{
                setter.add(num);
            }
        }
        Collections.sort(duplicate);
        System.out.println(duplicate.get(0)+" "+duplicate.get(1));
    }
}