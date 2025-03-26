import java.util.Scanner;

public class insertionsort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int a=sc.nextInt();
            int arr[]=new int[a];
            for(int i=0;i<a;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=1;i<arr.length;i++){
                int key=arr[i];
                int j=i-1;
                while(j>=0 && arr[j]>key){
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+1]=key;
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
