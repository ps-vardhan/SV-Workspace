import java.util.Scanner;

public class ageing {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            int ans=x-10;
            System.out.println(ans);
        }
        sc.close();
    }    
}
