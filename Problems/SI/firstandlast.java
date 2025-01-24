import java.util.Scanner;

public class firstandlast {
    static void finder(int n,int arr[],int key){
        int first=-1;
        int last=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                if(first==-1){
                    first=i;
                }
                last=i;
            }
        }
        System.out.println(first+" "+last);
    }   
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Values: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter your Key value: ");
        int key=sc.nextInt();
        finder(n, arr, key);
        sc.close();
    } 
}
