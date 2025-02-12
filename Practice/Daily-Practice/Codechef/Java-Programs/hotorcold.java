import java.util.Scanner;

public class hotorcold{
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int a=sc.nextInt();
            if(a>20){
                System.out.println("Hot");
            }else{
                System.out.println("Cold");
            }
        }
        sc.close();
	}
}
