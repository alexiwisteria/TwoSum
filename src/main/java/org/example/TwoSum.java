package org.example;

import java.util.HashMap;

/**
 * The {@code Solution} class provides a method to solve the Two Sum problem.
 * <p>
 * The Two Sum problem is defined as finding two numbers in an array that add up to a specific target.
 * This class includes a method {@code twoSum} that returns the indices of these two numbers.
 * </p>
 *
 * <p>
 * <strong>Example:</strong>
 * </p>
 * <pre>{@code
 * int[] nums = {2, 7, 11, 15};
 * int target = 9;
 * Solution solution = new Solution();
 * int[] result = solution.twoSum(nums, target);
 * // result should be [0, 1] because nums[0] + nums[1] = 2 + 7 = 9
 * }</pre>
 *
 * <p>
 * This implementation uses a {@link HashMap} to store numbers and their indices for quick lookup,
 * achieving an efficient solution with a time complexity of O(n).
 * </p>
 *
 * @author Alexis Binch
 * @since 2024-04-27
 */
public class TwoSum {

    /**
     * Finds the indices of the two numbers in the {@code nums} array that add up to the {@code target}.
     * <p>
     * The method works by iterating through the array and storing each number along with its index in a
     * {@code HashMap}. For each number, it calculates the complement needed to reach the target. If the
     * complement is already in the map, it means we've found the two numbers that add up to the target,
     * and their indices are returned.
     * </p>
     *
     * @param nums   An array of integers where each element represents a number.
     *               For example, {@code [2, 7, 11, 15]}.
     * @param target The target sum for which two numbers in {@code nums} should add up.
     *               For example, {@code 9}.
     * @return An array of two integers representing the indices of the numbers that add up to {@code target}.
     *         For example, {@code [0, 1]} because {@code nums[0] + nums[1] = 2 + 7 = 9}.
     * @throws IllegalArgumentException If no two numbers in {@code nums} add up to {@code target}.
     *
     * @implNote This implementation uses a single-pass hash table to achieve O(n) time complexity,
     * which is more efficient than a brute-force approach with O(n²) time complexity.
     *
     * @see HashMap
     */
    public int[] twoSum(int[] nums, int target) {

        // Create a HashMap to store numbers and their corresponding indices.
        // The key is the number, and the value is its index in the array.
        HashMap<Integer, Integer> numMap = new HashMap<>();

        // Loop through each number in the array.
        for (int index = 0; index < nums.length; index++) {
            // Calculate the complement that would add up to the target.
            int complement = target - nums[index];

            // Check if the complement number exists in the map.
            if (numMap.containsKey(complement)) {
                // If it exists, we have found the two numbers that add up to the target.
                // Return their indices as an array.
                return new int[]{numMap.get(complement), index};
            }

            // If the complement does not exist in the map, add the current number and its index to the map.
            numMap.put(nums[index], index);
        }

        // If no pair is found that adds up to the target, throw an exception.
        throw new IllegalArgumentException("No solution.");
    }
}
