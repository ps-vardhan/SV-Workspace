import java.util.Scanner;

public class lifeofeveryspoj {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        while(true){
            int n=sc.nextInt();
            if(n==42){
                break;
            }
            System.out.println(n);
        }
        sc.close();
    }    
}
