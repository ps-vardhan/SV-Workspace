import java.util.Scanner;

public class binaryrepres {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int num=sc.nextInt();
            // String ans=Integer.toBinaryString(num);          // inbuilt function
            // System.out.println(ans);
            System.out.println(binrepres(num));
        }
        sc.close();
    }    
    public static String binrepres(int num){
        if(num==0){
            return "0";
        }
        StringBuilder ass=new StringBuilder();
        while(num>0){
            int nums=num%2;
            ass.append(nums);
            num=num/2;
        }
        return ass.reverse().toString();
    }
}
