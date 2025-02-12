import java.util.Scanner;

public class sixfriendscc {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int sum1=a*3;
            int sum2=b*2;
            if(sum1<sum2){
                System.out.println(sum1);
            }else{
                System.out.println(sum2);
            }
        }
        sc.close();
    }    
}
