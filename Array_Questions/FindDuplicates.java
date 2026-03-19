import java.util.*;

public class FindDuplicates {

    public static List<Integer> findDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int num : arr) {

            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 3, 6, 6, 2};
        System.out.println("Original Array: " + Arrays.toString(arr));
        List<Integer> result = findDuplicates(arr);
        System.out.println("Duplicate Elements: " + result);
    }
}