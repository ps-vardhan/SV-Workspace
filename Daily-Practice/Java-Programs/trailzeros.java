import java.util.Scanner;

public class trailzeros {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            long x=sc.nextLong();
            long count=0;
            while(x>=5){
                count=count+(x/5);
                x/=5;
            }
            System.out.println(count);
        }
        sc.close();
    }    
}
