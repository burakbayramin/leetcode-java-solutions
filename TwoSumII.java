import java.util.HashMap;

public class TwoSumII {
    
    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if(map.containsKey(target - numbers[i])){
                return new int[] {map.get(target-numbers[i])+1, i+1};
            }
            map.put(numbers[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        System.out.println(twoSum(nums, 9));
    }
}
