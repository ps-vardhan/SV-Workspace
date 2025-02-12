public class twosumlc {
    public static void twosum(int arr[],int n){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==n){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}