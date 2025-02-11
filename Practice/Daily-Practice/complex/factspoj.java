import java.util.Scanner;
public class factspoj {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int x=sc.nextInt();
            System.out.println(trailzerofinder(x));
        }
        sc.close();
    }

    private static int trailzerofinder(int x){
        int count=0;
        while(x>=5){
            count=count+x/5;
            x=x/5;
        }
        return count;
    }
}
