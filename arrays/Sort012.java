/*
Problem:
Sort an array of 0's, 1's and 2's without using extra space.

Approach:
Dutch National Flag Algorithm (3 pointers)

- low: boundary for 0
- mid: current element
- high: boundary for 2

Rules:
- If nums[mid] == 0 → swap with low, low++, mid++
- If nums[mid] == 1 → mid++
- If nums[mid] == 2 → swap with high, high--

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class Sort012 {

    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else { // nums[mid] == 2
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Test
    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 1, 0};
        sortColors(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
