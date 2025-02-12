import java.util.Scanner;
public class bonappite {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int a=n*x;
        int b=m*y;
        System.out.println(a+b);
        sc.close();
    }
}
