
import java.util.Scanner;

class multitable {
    static void multi(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+(i*n));      
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your input here : ");
        int a=sc.nextInt();
        multi(a);
        sc.close();
    }
    
}