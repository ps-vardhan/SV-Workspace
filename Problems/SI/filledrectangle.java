import java.util.Scanner;

public class filledrectangle {
    static void patmaker(int a,int b){
        int n=a;
        int m=b;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("#");              //n is for rows and m is for columns
            }                                       //first an row and then columns take over
            System.out.println();
        }        
    }    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the any 2 numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        patmaker(a, b);
        sc.close();
    }
}
