import java.util.*;
public class MajorityElementNby3 {

    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // Check condition > n/3
        for (int key : map.keySet()) {
            if (map.get(key) > nums.length / 3) {
                result.add(key);
            }
        }
        return result;
    }
   
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 2, 2};
        System.out.println("Input Array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println(); // new line
        List<Integer> result = majorityElement(nums);
        System.out.println("Majority Elements (> n/3): " + result);
    }
}