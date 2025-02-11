import java.util.Scanner;

public class intdesign {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            int sum1=a+b;
            int sum2=c+d;
            if(sum1>=sum2){
                System.out.println(sum2);
            }else{
                System.out.println(sum1);
            }
        }
        sc.close();
    }
    
}
