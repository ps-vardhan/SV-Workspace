import java.util.Scanner;

public class bubbleswapcount {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int num=sc.nextInt();
            int arr[]=new int[num];
            for(int i=0;i<num;i++){
                arr[i]=sc.nextInt();
            }
            swapcounter(arr);
        }
        sc.close();
    }
    static void swapcounter(int arr[]){
        int n=arr.length;
        int counter=0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}