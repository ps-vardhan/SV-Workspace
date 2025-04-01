import java.util.Arrays;
import java.util.Scanner;

public class checkanagram {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        while(n-->0){
            String str=sc.nextLine();
            String st[]=str.split(" ");
            String str1=st[0];
            String str2=st[1];
            if(anagramchecker(str1,str2)){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }
        sc.close();
    }    
    public static boolean anagramchecker(String str1,String str2){
        char chstr1[]=str1.toCharArray();               // convert to a character array
        char chstr2[]=str2.toCharArray();
        Arrays.sort(chstr1);                            // sorting the character array
        Arrays.sort(chstr2);
        return (Arrays.equals(chstr1,chstr2));          // comparing both array if both are equal
    }
}
