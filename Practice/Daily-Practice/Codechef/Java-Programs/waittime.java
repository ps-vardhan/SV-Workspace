import java.util.Scanner;

public class waittime {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int week=sc.nextInt();
            int wait=sc.nextInt();
            int sum=(week*7)-wait;
            System.out.println(sum);
        }
        sc.close();
    }    
}
