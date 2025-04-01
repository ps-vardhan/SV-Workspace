import java.util.Scanner;
public class sumofelem {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int x=sc.nextInt();
            long sum=0;
            for(int i=0;i<x;i++){
                // int num=sc.nextInt();           // for small array values
                // sum=sum+num;
                long num=sc.nextLong();
                sum=sum+num;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
