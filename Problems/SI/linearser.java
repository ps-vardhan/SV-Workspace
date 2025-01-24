import java.util.Scanner;
public class linearser {
    static void linsearch(int n,long arr[],long key){
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                System.out.println(i+1);
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your numbers and key: ");
        int n=sc.nextInt();
        long arr[]=new long[n];
        long key=sc.nextLong();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        linsearch(n, arr, key);
        sc.close();
    }
}
