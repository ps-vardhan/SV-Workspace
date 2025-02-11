import java.util.Scanner;

public class website {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        if(n==404){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("FOUND");
        }
        sc.close();
    }    
}
