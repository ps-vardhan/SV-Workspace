import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class sumsubarr {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);

        int n=Integer.parseInt(br.readLine());
        long[] arr=new long[n];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i]=Long.parseLong(st.nextToken());
        }

        long prefix[]=new long[n+1];
        for(int i=1;i<=n;i++){
            prefix[i]=prefix[i-1]+arr[i-1];
        }

        int q=Integer.parseInt(br.readLine());
        for(int i=0;i<q;i++){
            st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());

            if(a>b){
                int temp=a;
                a=b;
                b=temp;
            }


            long sum=prefix[b+1]-prefix[a];
            out.println(sum);
        }
        out.flush();
    }    
}


        

        

          
