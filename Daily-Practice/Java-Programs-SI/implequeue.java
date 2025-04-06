import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class implequeue {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Queue<Integer> queue=new LinkedList<>();
        while(n-->0){
            String str=sc.nextLine();
            String parts[]=str.split(" ");
            
            if(parts[0].equals("Enqueue")){
                int value=Integer.parseInt(parts[1]);
                queue.offer(value);
            }else if(parts[0].equals("Dequeue")){
                if(queue.isEmpty()){
                    System.out.println("Empty");
                }else{
                    System.out.println(queue.poll());
                }
            }
        }
        sc.close();
    }
}