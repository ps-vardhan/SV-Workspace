import java.util.Scanner;

public class discount {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int x=sc.nextInt();
            int sum=100-x;
            System.out.println(sum);
        }
        sc.close();
    }
}
