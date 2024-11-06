package org.example;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> numMap = new HashMap<>();

        for ( int index = 0; index < nums.length; index++ ){
            int complement = target - nums[index];

            if(numMap.containsKey(complement)){

                return new int[] { numMap.get(complement), index };

            }

            numMap.put(nums[index],index);
        }
        throw new IllegalArgumentException("No solution.");

    }

}
