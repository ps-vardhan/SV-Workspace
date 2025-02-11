import java.util.Scanner;
public class ticketrush {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(b>a){
                System.out.println(0);
            }else{
                int x=a-b;
                System.out.println(x);
            }
        }
        sc.close();
    }
}
