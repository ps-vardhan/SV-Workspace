import java.util.Scanner;

public class chairsreq {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int ans=a-b;
            if(ans<0){
                System.out.println(0);
            }else{
                System.out.println(ans);
            }
            
        }
        sc.close();
    }    
}
