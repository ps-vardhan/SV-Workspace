import java.util.Scanner;

public class powerof2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int a=sc.nextInt();
            boolean flag=true;
            while(a>1){
                if(a%2!=0){
                    flag=false;
                    break;
                }
                a=a/2;  
            }

            if(flag){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }

        sc.close();
    }    
}
