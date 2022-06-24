import java.util.*;

class Solution {
    public static int romanToInt(String s) {
        s = s.toUpperCase();
        HashMap<Character, Integer> dict = new HashMap<Character, Integer>();
        dict.put('I', 1);
        dict.put('V', 5);
        dict.put('X', 10);
        dict.put('L', 50);
        dict.put('C', 100);
        dict.put('D', 500);
        dict.put('M', 1000);

        int res = dict.get(s.charAt(s.length() - 1));
        if (s.length() == 1)
            return dict.get(s.charAt(0));

        for (int i = s.length() - 2; i >= 0; i--) {
            int prevInd = i + 1;

            if (dict.get(s.charAt(i)) >= dict.get(s.charAt(prevInd)))
                res += dict.get(s.charAt(i));
            else
                res -= dict.get(s.charAt(i));
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(romanToInt("MCMXCIV"));
    }
}