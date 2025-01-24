import java.util.Arrays;
import java.util.Scanner;

public class reversearr {

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The Orginal array: "+Arrays.toString(arr));
        System.out.println("The Reversed Array: ");
        for(int i=arr.length-1;i>=0;i--){               //arr.length gives length value 
            System.out.print(arr[i]+" ");               //ex: 1 2 3 =3
        }
        System.out.println();
        sc.close();
    }
}