import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length ; i++) {
            int res = target - nums[i];
            if (map.containsKey(res) && map.get(res) != i){
                return new int[] {i, map.get(res)};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No such data!");
    }

    public static void main(String[] args) {
        int[] nums = {1, 14, 4, 6, 1};
        System.out.println(Arrays.toString(twoSum(nums, 10)));
    }
}
