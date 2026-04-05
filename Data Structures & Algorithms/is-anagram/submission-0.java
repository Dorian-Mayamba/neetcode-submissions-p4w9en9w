class Solution {
    public boolean isAnagram(String s, String t) {
        char [] sArray = s.toCharArray();
        char [] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        String sortedS = "";
        String sortedT = "";

        for (char c: sArray){
            sortedS+= c;
        }

        for (char c: tArray){
            sortedT+= c;
        }

        return sortedS.equals(sortedT);
    }
}
