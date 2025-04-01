import java.util.Arrays;

public class v3467 {

    public static int[] transformArray(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                arr[i]=0;
            }else{
                arr[i]=1;
            }
        }
        Arrays.sort(arr);
        /*for(int i=0;i<arr.length;i++){
            for(int j=0;j<i-arr.length-1;j++){          // Instead of using manual sort inbuilt function is used.
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }*/
        return arr;
    }
}