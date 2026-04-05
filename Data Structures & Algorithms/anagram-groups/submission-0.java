class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new LinkedHashMap<>();

        List<List<String>> groupAnagrams = new ArrayList<>();

        for (String str: strs){
            char [] charArray = str.toCharArray();

            Arrays.sort(charArray);

            String sortedStr = new String(charArray);

            if (map.containsKey(sortedStr)){
                map.get(sortedStr).add(str);
            } else if (!map.containsKey(sortedStr)){
                List<String> anagrams = new ArrayList<>();
                anagrams.add(str);
                map.put(sortedStr, anagrams);
            }
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()){
            groupAnagrams.add(entry.getValue());
        }

        return groupAnagrams;
    }
}
