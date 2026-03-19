public class CountOccurrences {
    public static int count(int[] arr, int target) {
        int first = -1, last = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (first == -1) {
                    first = i; 
                }
                last = i; 
            }
        }
        if (first == -1) {
            return 0;
        }
        return last - first + 1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4};
        int target = 2;
        System.out.println("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println(); // new line
        int result = count(arr, target);
        System.out.println("Target: " + target);
        System.out.println("Count: " + result);
    }
}