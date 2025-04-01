import java.math.BigInteger;
import java.util.Scanner;

public class checkisprime {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        while(n-->0){
            String str=sc.nextLine();
            if(sieveoferthos(str)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
        sc.close();
    }

    public static boolean sieveoferthos(String str){
        BigInteger bigstr=new BigInteger(str);
        return bigstr.isProbablePrime(1);

        // boolean isprime[]=new boolean[bigstr+1];
        // int n=bigstr.length();
        // for(int i=0;i<=n;i++){
        //     isprime[i]=true;
        // }

        // isprime[0]=isprime[1]=false;

        // for(int i=2;i*i<=n;i++){
        //     if(isprime[p]){
        //         for(int j=i*i;j<=n;j+=i){
        //             isprime[j]=false;
        //         }
        //     }
        // }
        // for(int i=2;i<=n;i++){
        //     if(isprime[i]){
        //         return true;
        //     }
        // }
        // return false;
    }
}
