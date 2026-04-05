class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean hasDuplicate = false;


        Set<Integer> seen = new HashSet<>();

        for (int i = 0; i < nums.length; i++){
            if (seen.contains(nums[i])) hasDuplicate = true;
            seen.add(nums[i]);
        }

        return hasDuplicate;
    }
}