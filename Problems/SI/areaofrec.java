import java.util.Scanner;

public class areaofrec {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Area and Breadth of rectangle : ");
        long length = sc.nextInt();
        long breadth = sc.nextInt();
        System.out.println((length * breadth));                    
        sc.close();
    }
}