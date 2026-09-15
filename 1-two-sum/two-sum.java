class Solution {
    public int[] twoSum(int[] nums, int target)
     {
        int[] result = new int[2];
        int l = nums.length;
        
        // 2. Outer loop picks the first number
        for (int i = 0; i < l - 1; i++) {
            
            // 3. Inner loop picks the second number (starts at i + 1 to avoid matching with itself)
            for (int j = i + 1; j < l; j++) {
                
                // 4. Check if the two numbers add up to the target
                if (nums[i] + nums[j] == target) {
                    result[0] = i; // Save the first index
                    result[1] = j; // Save the second index
                    return result; // Return the answer immediately
                }
            }
        }
        
        // Return an empty array if no solution is found
        return new int[0]; 
    }
}
