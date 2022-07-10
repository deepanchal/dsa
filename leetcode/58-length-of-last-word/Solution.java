class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        boolean wordStart = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (wordStart) break;
                continue;
            }
            wordStart = true;
            count++;
        }
        return count;
    }
}

