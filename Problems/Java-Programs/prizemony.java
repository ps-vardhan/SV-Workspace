import java.util.Scanner;

public class prizemony {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int ans=a*10+b*90;
            System.out.println(ans);
        }
        sc.close();
    }    
}
