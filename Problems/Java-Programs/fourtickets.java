import java.util.Scanner;

public class fourtickets {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            int ans=x*4;
            if(ans<=1000){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }    
}
