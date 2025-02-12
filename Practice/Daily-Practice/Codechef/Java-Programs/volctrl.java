import java.util.Scanner;

public class volctrl {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a>b){
                System.out.println(-(b-a));
            }else{
                System.out.println(b-a);
            }
        }
        sc.close();
    }    
}
