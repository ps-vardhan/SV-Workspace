import java.util.Arrays;
import java.util.Scanner;

public class palindrome {

    static void palchecker(int n){
        String str=Integer.toString(n);
        int arr[]=new int[str.length()];
        for(int i=0;i<str.length();i++){
            arr[i]=str.charAt(i)-'0';
        }
        int arr1[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            arr1[i]=arr[i];
        }
        if(Arrays.equals(arr, arr1)){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        palchecker(n);
        sc.close();
    }   
}
