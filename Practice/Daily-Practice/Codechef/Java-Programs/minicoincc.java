import java.util.Scanner;

public class minicoincc {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int x=sc.nextInt();
            int sum=x%10;
            System.out.println(sum);
        }
        sc.close();
    }    
}
