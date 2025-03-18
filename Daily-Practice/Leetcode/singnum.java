public class singnum {
    public int singleNumber(int[] nums) {
        
        for (int i = 0; i < nums.length; i++) {
            int count = -1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
                if (count < 0) {
                    System.out.println(i);
                    break;
                }
            }

        }
    }
}