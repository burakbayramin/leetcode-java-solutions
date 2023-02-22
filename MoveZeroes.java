public class MoveZeroes {
    
    public static void moveZeroes(int[] nums) {
        int pos = 0;
        for(int i = 0;i < nums.length;i++) {
            if(nums[i] != 0) {
                if(i != pos) {
                    nums[pos] = nums[i];
                    nums[i] = 0;
                }
                pos++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,0,2,3,4};
        moveZeroes(nums);
        for (int i : nums) {
            System.out.print(i);
        }
    }
}
