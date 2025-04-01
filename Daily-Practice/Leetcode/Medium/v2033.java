import java.util.ArrayList;
import java.util.Collections;

public class v2033 {
    public int minOperations(int[][] grid, int x){
        ArrayList<Integer> numsarray=new ArrayList<>();
        int result=0;

        for(int row=0;row<grid.length;row++){
            for(int col=0;col<grid[0].length;col++){
                numsarray.add(grid[row][col]);
            }
        }

        Collections.sort(numsarray);

        int length=numsarray.size();
        int finalcomnum=numsarray.get(length/2);

        for(int number:numsarray){
            if(number%x!=finalcomnum%x){
                return -1;
            }
            result+=Math.abs(finalcomnum-number)/x;
        }
        return result;
    }
}
