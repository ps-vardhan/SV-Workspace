import java.util.Scanner;
import java.util.Stack;

public class reversesentence {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        while(n-->0){
            Stack<String> stack=new Stack<>();
            String str=sc.nextLine();
            String arr[]=str.split(" ");

            for(String word:arr){
                stack.push(word);
            }
            StringBuilder string=new StringBuilder();
            while(!stack.isEmpty()){
                string.append(stack.pop());
                if(!stack.isEmpty()){
                    string.append(" ");
                }
            }
            System.out.println(string.toString());
        }
        sc.close();
    }
}
