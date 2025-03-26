import java.math.BigInteger;
import java.util.Scanner;

public class v3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            BigInteger big=BigInteger.ONE;
            int a=sc.nextInt();
            for(int i=1;i<=a;i++){
                big=big.multiply(BigInteger.valueOf(i));
            }
            
            System.out.println(big);
        }
        sc.close();
    }
}
