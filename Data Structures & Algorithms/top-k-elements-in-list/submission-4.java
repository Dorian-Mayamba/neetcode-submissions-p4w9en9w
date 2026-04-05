class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new TreeMap<>();

        for (int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Integer> freq = new LinkedList<>(map.keySet());

        freq.sort((a, b) -> map.get(b) - map.get(a));

        return freq.stream().limit(k).mapToInt(i -> i).toArray();
    }
}
