import java.util.Scanner;
public class bubblesortadhoc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        while(n-->0){
            int n1=sc.nextInt();
            int arr[]=new int[n1];
            for(int i=0;i<n1;i++){
                arr[i]=sc.nextInt();
            }
            int swapcount=bubsorter(arr, n1);
            System.out.println(swapcount);
        }
        sc.close();
    }
    static int bubsorter(int arr[],int n1){
        int swapcount=0;
        for(int i=0;i<n1-1;i++){
            for(int j=0;j<n1-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapcount++;
                }
            }
        }
        return swapcount;
    }
    
}
