import java.util.Scanner;
public class trailzero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            long num=sc.nextLong();
            trizeros(num);
        } 
        sc.close();
    }
    static void trizeros(long num){
        long count=0;
        long poweroffive=5;

        while(num>=poweroffive){
            count+=num/poweroffive;
            poweroffive*=5;
        }
        System.out.println(count);
    }
}
