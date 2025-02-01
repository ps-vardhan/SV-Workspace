import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array {
    public static void main(String[]args){
        // Initilization
        int arr[]=new int[5];                       // initialize an array of size 5
        int arr1[]={45,89,25,36,15};                // initialize an array with set elements
        int mat1[][]=new int[2][2];                 // a matrix array of size 5
        int mat2[][]={{4,8},{6,9}};                 // a matrix array with predefined values

        // Inserting and updating
        arr[0]=56;                                  // static insertion 
        arr[2]=55;
        ArrayList<Integer> list=new ArrayList<>();  // arraylist object creation
        list.add(45);                               // dynamic insertion
        list.add(96);

        // Deleting 
        list.remove(0);                             // ArrayList remove
        int indexrem=0;
        for(int i=indexrem;i<arr1.length-1;i++){    // moving the elements manually avoids conflits
            arr[i]=arr[i+1];
        }

        // Searching - linear search , binary search

        // Sorting 
        Arrays.sort(arr1);                          // sort in ascending order
        Integer ara[]={45,35,86};                   // making an array integer specific
        Arrays.sort(ara,Collections.reverseOrder());// using collections to print array in reverse order

        // Filling an array
        Arrays.fill(arr1,0);                        // fills the entire array with 0

        // Converting
        List<Integer> lis=Arrays.asList(45,89,23,41,96);    // converts an array into list
        Integer[] arrs=list.toArray(new Integer[0]);        // converts an list into array

        // functions
        int max=Arrays.stream(arr1).max().getAsInt();       // finds the maximum element
        int min=Arrays.stream(arr1).min().getAsInt();       // finds the minimum element
        int sum=Arrays.stream(arr1).sum();                  // finds sum of an array 
        Arrays.stream(arr1).forEach(System.out::println);   // foreach loop
        boolean exists=Arrays.stream(arr1).anyMatch(x->x==3);// specific element match function
    }
}
