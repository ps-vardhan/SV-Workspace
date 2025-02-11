import java.util.Arrays;
import java.util.Scanner;
public class meamedmod {
    static void men(int n,int arr[]){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        double mean=(double)sum/n;
        System.out.printf("Mean:%.2f",mean);
    }
    static void medmod(int n,int arr[]){
        Arrays.sort(arr);    
        if(n%2==1){
                double median=(double)arr[n/2];
                System.out.printf("Median: %.2f",median);
            }else{
                double median=(double)((arr[n/2]+arr[n/2-1])/2.0);
                System.out.printf("Median: %.2f",median);
            }
            
            double mode=arr[0];
            int currentcount=1;
            int maxcount=1;
            for(int i=1;i<n;i++){
                if(arr[i]==arr[i-1]){
                    currentcount++;
                }else{
                    currentcount=1;
                }
                if(maxcount<currentcount){
                    maxcount=currentcount;
                    mode=arr[i];
                }
            }
            System.out.printf("Mode: %.2f",mode);
    }
        
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your values: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        men(n,arr);
        medmod(n, arr);
        sc.close();
    } 
}