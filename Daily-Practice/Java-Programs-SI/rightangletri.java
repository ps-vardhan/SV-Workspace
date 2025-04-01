import java.util.Scanner;

public class rightangletri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int k=0;k<n;k++){
            System.out.println("Case #"+(k+1)+":");
            int x=sc.nextInt();
            for(int i=0;i<x;i++){
                for(int j=0;j<x-i-1;j++){
                    System.out.print(" ");
                }
                for(int j=0;j<=i;j++)
                System.out.print("*");
                System.out.println();
            }
        }
        sc.close();
    }
}
