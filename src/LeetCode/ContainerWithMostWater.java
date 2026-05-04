package LeetCode;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    // we will solve this by two pointer approach
    private static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int resultArea = 0;
        while (left < right) {
            int area = 0;
            int width = right - left;
            // check if height at left is greater than equal to height at right, if yes that we will length
            if (height[left] >= height[right]) {
                area = height[right--] * width;
            }
            else {
                area = height[left++] * width;
            }

            // after getting area we will use Math.max function to get max area value for each height
            resultArea = Math.max(resultArea, area);
        }

        return resultArea;
    }
}
