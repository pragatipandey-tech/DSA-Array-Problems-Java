import java.util.Arrays;

public class MoveZeroes {

    public static void moveZeroes(int[] arr) {
        int index = 0; 

        for (int num : arr) {
            if (num != 0) {
                arr[index] = num;
                index++;
            }
        }

        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        System.out.println("Original Array: " + Arrays.toString(arr));

        moveZeroes(arr);

        System.out.println("After Moving Zeroes: " + Arrays.toString(arr));
    }
}