import java.util.Scanner;

public class messironaldo {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int mg=sc.nextInt();
        int mass=sc.nextInt();
        int rg=sc.nextInt();
        int gass=sc.nextInt();
        int messi=(mg*2)+mass;
        int ronaldo=(rg*2)+gass;
        if(messi==ronaldo){
            System.out.println("EQUAL");
        }else if(messi>ronaldo){
            System.out.println("Messi");
        }else{
            System.out.println("Ronaldo");
        }
        sc.close();
    }    
}
