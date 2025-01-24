import java.util.Arrays;
import java.util.Scanner;
public class anagrams {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        while(n-->0){
            String line=sc.nextLine();
            String arr[]=line.split(" ");
            String str1=arr[0];
            String str2=arr[1];

            if(isanagram(str1,str2)){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }
        sc.close();
    }
    static boolean isanagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        char chararr1[]=str1.toCharArray();
        char chararr2[]=str2.toCharArray();
        Arrays.sort(chararr1);
        Arrays.sort(chararr2);

        return Arrays.equals(chararr1, chararr2);
    }
}