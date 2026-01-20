/*
Problem:
Find the majority element in an array.
The majority element appears more than n/2 times.

Approach:
Boyer-Moore Voting Algorithm

- Maintain a candidate and a count
- If count becomes 0, choose current element as candidate
- Increment count if same as candidate, else decrement

Since the problem guarantees a majority element,
the final candidate will be the answer.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class MajorityElement {

    public static int findMajorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }

    // Test
    public static void main(String[] args) {
        int[] nums = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        System.out.println(findMajorityElement(nums));
    }
}
