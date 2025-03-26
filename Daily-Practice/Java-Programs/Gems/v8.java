import java.util.Scanner;

public class v8{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        while(n-->0){
            int a=sc.nextInt();
            if(a%3==0 ||a==0){
               System.out.println("normal");
            }else if((a-1)%3==0){
                System.out.println("huge");
            }else{
                System.out.println("Small");
            }
        }
        sc.close();
    }    
}
