import java.util.Scanner;

public class bullorbear {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a==b){
                System.out.println("NEUTRAL");
            }else if(a>b){
                System.out.println("LOSS");
            }else{
                System.out.println("WIN");
            }
        }
        sc.close();
    }    
}
