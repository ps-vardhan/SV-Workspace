import java.util.Arrays;

class linearserh{
    static void linsearch(int arr[],int tar){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==tar){                                                //compares array index element with target    
                System.out.println("The index of target element is : "+i);  
                break;
            }
        }
        System.out.println("The element is not present in the array");
    }
    public static void main(String[]args){
        int arr[]={45,96,46,28,46};
        System.out.println("The Input array : "+Arrays.toString(arr));
        int tar=28;
        linsearch(arr, tar);
    }
}