import java.util.Scanner;

public class reversebits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            long a=sc.nextLong();
            long result=revbit(a);
            System.out.println(result);
        }
        sc.close();
    }    
    public static long revbit(long a){
        long result=0;
        for(int i=0;i<32;i++){
            result<<=1;
            result|=(a&1);
            a>>=1;
        }
        return result;
    } 
}
