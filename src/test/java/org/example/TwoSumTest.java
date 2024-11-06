package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * The {@code SolutionTest} class contains unit tests for the {@link TwoSum} class's {@code twoSum} method.
 * <p>
 * Each test case is designed to validate a specific scenario, ensuring that the {@code twoSum} method behaves correctly
 * under various conditions. These tests help in verifying the correctness and robustness of the implementation.
 * </p>
 *
 * <p>
 * <strong>Note:</strong> These tests use JUnit 5 for testing. Make sure JUnit 5 is included in your project's dependencies
 * to run these tests successfully.
 * </p>
 *
 * <p>
 * <strong>Example Usage:</strong>
 * </p>
 * <pre>{@code
 * // Example of running a single test method
 * SolutionTest test = new SolutionTest();
 * test.twoSum_NormalCase();
 * }</pre>
 *
 * @version 1.0
 * @since 2024-04-27
 */
public class TwoSumTest {

    /**
     * Tests the {@code twoSum} method with a standard case where a valid pair of numbers exists that adds up to the target.
     * <p>
     * Given the array {@code [2, 7, 11, 15]} and target {@code 9}, the expected indices are {@code [0, 1]} because
     * {@code nums[0] + nums[1] = 2 + 7 = 9}.
     * </p>
     */
    @Test
    void twoSum_NormalCase() {
        // Create an instance of the Solution class
        TwoSum twoSum = new TwoSum();

        // Define the input array and target value
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Define the expected result
        int[] expected = {0, 1};

        // Call the twoSum method and store the result
        int[] result = twoSum.twoSum(nums, target);

        // Assert that the expected and actual results are equal
        assertArrayEquals(expected, result, "The two indices should be [0, 1]");
    }

    /**
     * Tests the {@code twoSum} method where the same element is used twice to reach the target sum.
     * <p>
     * Given the array {@code [3, 3]} and target {@code 6}, the expected indices are {@code [0, 1]} because
     * {@code nums[0] + nums[1] = 3 + 3 = 6}.
     * </p>
     */
    @Test
    void twoSum_SameElementTwice() {
        // Create an instance of the Solution class
        TwoSum twoSum = new TwoSum();

        // Define the input array and target value
        int[] nums = {3, 3};
        int target = 6;

        // Define the expected result
        int[] expected = {0, 1};

        // Call the twoSum method and store the result
        int[] result = twoSum.twoSum(nums, target);

        // Assert that the expected and actual results are equal
        assertArrayEquals(expected, result, "The two indices should be [0, 1]");
    }

    /**
     * Tests the {@code twoSum} method with negative numbers in the array.
     * <p>
     * Given the array {@code [-3, 4, 3, 90]} and target {@code 0}, the expected indices are {@code [0, 2]} because
     * {@code nums[0] + nums[2] = -3 + 3 = 0}.
     * </p>
     */
    @Test
    void twoSum_NegativeNumbers() {
        // Create an instance of the Solution class
        TwoSum twoSum = new TwoSum();

        // Define the input array and target value
        int[] nums = {-3, 4, 3, 90};
        int target = 0;

        // Define the expected result
        int[] expected = {0, 2};

        // Call the twoSum method and store the result
        int[] result = twoSum.twoSum(nums, target);

        // Assert that the expected and actual results are equal
        assertArrayEquals(expected, result, "The two indices should be [0, 2]");
    }

    /**
     * Tests the {@code twoSum} method when no valid solution exists in the array.
     * <p>
     * Given the array {@code [1, 2, 3, 4]} and target {@code 8}, there are no two numbers that add up to the target.
     * The method is expected to throw an {@link IllegalArgumentException} with the message "No solution.".
     * </p>
     */
    @Test
    void twoSum_NoSolution() {
        // Create an instance of the Solution class
        TwoSum twoSum = new TwoSum();

        // Define the input array and target value
        int[] nums = {1, 2, 3, 4};
        int target = 8;

        // Attempt to call the twoSum method and expect an exception
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            twoSum.twoSum(nums, target);
        });

        // Define the expected exception message
        String expectedMessage = "No solution.";

        // Get the actual exception message
        String actualMessage = exception.getMessage();

        // Assert that the actual message contains the expected message
        assertTrue(actualMessage.contains(expectedMessage), "Exception message should contain 'No solution.'");
    }

    /**
     * Tests the {@code twoSum} method with an empty array.
     * <p>
     * Given an empty array {@code []} and target {@code 0}, there are no numbers to add up to the target.
     * The method is expected to throw an {@link IllegalArgumentException} with the message "No solution.".
     * </p>
     */
    @Test
    void twoSum_EmptyArray() {
        // Create an instance of the Solution class
        TwoSum twoSum = new TwoSum();

        // Define the input array (empty) and target value
        int[] nums = {};
        int target = 0;

        // Attempt to call the twoSum method and expect an exception
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            twoSum.twoSum(nums, target);
        });

        // Define the expected exception message
        String expectedMessage = "No solution.";

        // Get the actual exception message
        String actualMessage = exception.getMessage();

        // Assert that the actual message contains the expected message
        assertTrue(actualMessage.contains(expectedMessage), "Exception message should contain 'No solution.'");
    }

    /**
     * Tests the {@code twoSum} method with a single-element array.
     * <p>
     * Given the array {@code [1]} and target {@code 1}, there is only one number in the array.
     * The method is expected to throw an {@link IllegalArgumentException} with the message "No solution.".
     * </p>
     */
    @Test
    void twoSum_SingleElement() {
        // Create an instance of the Solution class
        TwoSum twoSum = new TwoSum();

        // Define the input array (single element) and target value
        int[] nums = {1};
        int target = 1;

        // Attempt to call the twoSum method and expect an exception
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            twoSum.twoSum(nums, target);
        });

        // Define the expected exception message
        String expectedMessage = "No solution.";

        // Get the actual exception message
        String actualMessage = exception.getMessage();

        // Assert that the actual message contains the expected message
        assertTrue(actualMessage.contains(expectedMessage), "Exception message should contain 'No solution.'");
    }

    /**
     * Tests the {@code twoSum} method when multiple valid solutions exist in the array.
     * <p>
     * Given the array {@code [1, 2, 3, 4, 5]} and target {@code 6}, there are two possible valid pairs:
     * {@code [0, 4]} (1 + 5) and {@code [1, 3]} (2 + 4). This test verifies that the result matches one of these pairs.
     * </p>
     */
    @Test
    void twoSum_MultipleSolutions() {
        // Create an instance of the Solution class
        TwoSum twoSum = new TwoSum();

        // Define the input array and target value
        int[] nums = {1, 2, 3, 4, 5};
        int target = 6;

        // Call the twoSum method and store the result
        int[] result = twoSum.twoSum(nums, target);

        // Define the possible valid solutions
        // Possible solutions: [0,4] (1 + 5), [1,3] (2 + 4)
        boolean isValid = (result[0] == 0 && result[1] == 4) || (result[0] == 1 && result[1] == 3);

        // Assert that the result matches one of the valid solutions
        assertTrue(isValid, "The two indices should be either [0, 4] or [1, 3]");
    }

    /**
     * Tests the {@code twoSum} method with large integer values to ensure it handles integer boundaries correctly.
     * <p>
     * Given the array {@code [Integer.MAX_VALUE, -1, 0]} and target {@code Integer.MAX_VALUE - 1}, the expected indices are
     * {@code [0, 1]} because {@code nums[0] + nums[1] = Integer.MAX_VALUE + (-1) = Integer.MAX_VALUE - 1}.
     * </p>
     */
    @Test
    void twoSum_LargeNumbers() {
        // Create an instance of the Solution class
        TwoSum twoSum = new TwoSum();

        // Define the input array with large integer values and target value
        int[] nums = {Integer.MAX_VALUE, -1, 0};
        int target = Integer.MAX_VALUE - 1;

        // Define the expected result
        int[] expected = {0, 1};

        // Call the twoSum method and store the result
        int[] result = twoSum.twoSum(nums, target);

        // Assert that the expected and actual results are equal
        assertArrayEquals(expected, result, "The two indices should be [0, 1]");
    }

    /**
     * Tests the {@code twoSum} method when the target sum is zero.
     * <p>
     * Given the array {@code [0, 4, 3, 0]} and target {@code 0}, the expected indices are {@code [0, 3]} because
     * {@code nums[0] + nums[3] = 0 + 0 = 0}.
     * </p>
     */
    @Test
    void twoSum_TargetIsZero() {
        // Create an instance of the Solution class
        TwoSum twoSum = new TwoSum();

        // Define the input array and target value
        int[] nums = {0, 4, 3, 0};
        int target = 0;

        // Define the expected result
        int[] expected = {0, 3};

        // Call the twoSum method and store the result
        int[] result = twoSum.twoSum(nums, target);

        // Assert that the expected and actual results are equal
        assertArrayEquals(expected, result, "The two indices should be [0, 3]");
    }
}
