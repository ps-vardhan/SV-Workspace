import java.util.Scanner;

public class apowb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long answer=power(a,b);
            System.out.println(answer);
        }
        sc.close();
    }

    public static long power(long a,long b){
        long result=1;
        long mod=1000000007;
        a=a%mod;
        while(b>0){
            if(b%2==1){
                result=(result*a)%mod;
            }
            a=(a*a)%mod;
            b=b/2;    
        }
        return result;
    }
}