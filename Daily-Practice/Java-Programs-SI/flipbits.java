import java.util.Scanner;

public class flipbits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int xor=a^b;
            int count=0;
            while(xor>0){
                count+=xor&1;
                xor>>=1;
            }
            System.out.println(count);
        }
        sc.close();
    }
    
}
