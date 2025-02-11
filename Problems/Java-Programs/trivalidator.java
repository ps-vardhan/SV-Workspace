import java.util.Scanner;
public class trivalidator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of A & B & C : ");
        long A=sc.nextLong();
        long B=sc.nextLong();
        long C=sc.nextLong();
        if((A+B>C)&&(B+C>A)&&(C+A>B)){
            System.out.println("Yes the values can form a Triangle");
        }else{
            System.out.println("No the values cant form a Triangle");
        }
        sc.close();
    }
}
