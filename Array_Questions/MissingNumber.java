public class MissingNumber {
    public static int findMissing(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2;
        int currentSum = 0;

        for (int num : arr) {
            currentSum += num;
        }

        return totalSum - currentSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6};
        System.out.println("Missing Number: " + findMissing(arr, 6));
    }
}
