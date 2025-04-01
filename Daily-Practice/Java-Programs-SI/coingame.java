import java.util.Scanner;

public class coingame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            long x=sc.nextLong();
            long y=sc.nextLong();
            if((x+y)%3==0 && 2*y>=x && 2*x>=y){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();

   }
}
