/* Given an integer find the square root of the number */

import java.util.Scanner;

public class squarerootinb {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        while(n-->0){
            int a=sc.nextInt();
            int sum=(int)Math.sqrt(a);
            System.out.println(sum);
        }
        sc.close();
    }    
}
