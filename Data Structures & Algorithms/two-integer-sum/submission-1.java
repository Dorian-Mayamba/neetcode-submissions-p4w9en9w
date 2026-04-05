class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            int difference = target - nums[i];
            if (!map.containsKey(difference)){
                map.put(nums[i], i);
            } else if (map.containsKey(difference)){
                indices.add(map.get(difference));
                indices.add(i);
            }
        }

        return indices.stream()
            .mapToInt(i -> i).toArray();
        
    }
}
