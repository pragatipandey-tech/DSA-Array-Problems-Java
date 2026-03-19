public class TrappingRainwater {
    public static int trap(int[] height) {
        int water = 0;

        for (int i = 1; i < height.length - 1; i++) {
            int leftMax = 0;
            int rightMax = 0;
            for (int j = 0; j <= i; j++) {
                leftMax = Math.max(leftMax, height[j]);
            }
            for (int j = i; j < height.length; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }
            water += Math.min(leftMax, rightMax) - height[i];
        }

        return water;
    }
    public static void main(String[] args) {

        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Height Array:");
        for (int h : height) {
            System.out.print(h + " ");
        }
        System.out.println(); 
        int result = trap(height);
        System.out.println("Trapped Water: " + result);
    }
}