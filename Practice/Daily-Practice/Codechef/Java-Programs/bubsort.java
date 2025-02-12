import java.util.Scanner;

public class bubsort{
    static void bubsorter(int n,int arr[]){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            for(int k=0;k<n;k++){
                System.out.print(arr[k]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter String of Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        bubsorter(n,arr);
        sc.close();
    }
}