import java.util.Scanner;
public class primeornot {
    static void primefinder(int n){
        if(n==2){
            System.out.println("Yes its a prime");
            return;
        }
        if(n%2==0||n<=1){
            System.out.println("No its not a prime");
            return;
        }
        for(int i=3;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println("No its not a prime");
                return;
            }
        }
        System.out.println("Yes its a prime");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        primefinder(n);
        sc.close();
    }
    
}
