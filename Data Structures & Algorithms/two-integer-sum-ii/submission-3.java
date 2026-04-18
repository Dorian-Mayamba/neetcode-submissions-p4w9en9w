class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1;
        List<Integer> indices = new ArrayList<>();
        while (start < end){
            if (numbers[start] + numbers[end] == target){
                indices.add(start + 1);
                indices.add(end + 1);
                break;
            } else if (numbers[start] + numbers[end] < target){
                start++;
            } else if (numbers[start] + numbers[end] > target){
                end--;
            }
        }
        return indices.stream().mapToInt(i -> i).toArray();
    }
}
