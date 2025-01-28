import java.util.Arrays;
import java.util.HashMap;

class LTCode005 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        LTCode005 solution = new LTCode005();

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        try {
            int[] result = solution.twoSum(nums, target);
            System.out.println("Indices: " + Arrays.toString(result));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        try {
            int[] result2 = solution.twoSum(nums2, target2);
            System.out.println("Indices: " + Arrays.toString(result2));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        int[] nums3 = {3, 3};
        int target3 = 6;
        try {
            int[] result3 = solution.twoSum(nums3, target3);
            System.out.println("Indices: " + Arrays.toString(result3));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
