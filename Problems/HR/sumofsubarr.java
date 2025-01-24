import java.util.Scanner;

public class sumofsubarr {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        long prefix[]=new long[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=arr[i]+prefix[i-1];
        }
        int nums=sc.nextInt();
        for(int j=0;j<nums;j++){
            int a=sc.nextInt();
            int b=sc.nextInt();

            long sum;
            if(a==0){
                sum=prefix[b];
            }else{
                sum=prefix[b]-prefix[a-1];
            }
            System.out.println(sum);
        }
        sc.close();
    }
}