class Solution {
    public static int strStr(String haystack, String needle) {
        if (needle == "")
            return 0;
        if (needle == null || haystack == null)
            return -1;

        for (int i = 0; i < (haystack.length() - needle.length()) + 1; i++) {
            int count = 0;
            while (count < needle.length() && haystack.charAt(i + count) == needle.charAt(count)) {
                count++;
            }
            if (count == needle.length())
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        String haystack = "helloworld";
        String needle = "or";
        int substrIndex = strStr(haystack, needle);
        if (substrIndex >= 0)
            System.out.println("Needle found at index " + substrIndex);
        else
            System.out.println("Needle not found :(");

    }
}