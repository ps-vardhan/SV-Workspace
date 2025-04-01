import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class guessprob1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        while(n-->0){
            String string[]=sc.nextLine().split(" ");
            String A=string[0];
            String B=string[1];

            Set<Character> seta=new HashSet<>();

            for(char ch:A.toCharArray()){
                seta.add(ch);
            }
            
            StringBuilder str=new StringBuilder();
            for(char ch:B.toCharArray()){
                if(!seta.contains(ch)){
                   str.append(ch);
                    //setb.remove(ch);
                }
            }

           System.out.println(str.toString());
        }
        sc.close();
    }
}
