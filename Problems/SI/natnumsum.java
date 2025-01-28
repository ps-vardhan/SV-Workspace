import java.util.Scanner;

public class natnumsum {
    static void counter(int n){
        int temp=0;
        for(int i=1;i<=n;i++){              
            temp+=i;
        }
        System.out.println(temp);
    }    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number : ");
        int a=sc.nextInt();
        System.out.println("The sum of first "+a+" numbers is : ");
        counter(a);
        sc.close();
    }
}
