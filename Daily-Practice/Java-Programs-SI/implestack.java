import java.util.Scanner;
import java.util.Stack;

public class implestack {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Stack<Integer> stack=new Stack<>();
        while(n-->0){
            String str=sc.nextLine();
            String parts[]=str.split(" ");
            
            if(parts[0].equals("push")){
                int value=Integer.parseInt(parts[1]);
                stack.push(value);
            }else if(parts[0].equals("pop")){
                if(stack.isEmpty()){
                    System.out.println("Empty");
                }else{
                    System.out.println(stack.pop());
                }
            }
        }
        sc.close();
    }
}