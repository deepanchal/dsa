class Solution {
    public static boolean isValid(Character c1, Character c2) {
        if ((Character.toUpperCase(c1) == Character.toUpperCase(c2))
                && ((Character.isLowerCase(c1) && Character.isUpperCase(c2))
                        || (Character.isUpperCase(c1) && Character.isLowerCase(c2))))
            return true;
        return false;
    }

    public static String makeGood(String s) {
        String result = s;
        if (result.length() == 0 || (result.length() == 2 && isValid(result.charAt(0), result.charAt(1))))
            return "";

        for (int i = 0; i < result.length() - 1; i++) {
            if (result.length() == 1)
                return result;
            while (result.length() >= 2 && isValid(result.charAt(i), result.charAt(i + 1))) {
                if (result.length() == 2 && isValid(result.charAt(0), result.charAt(1)))
                    return "";
                String targetToRemove = result.substring(i, i + 2);
                result = result.replace(targetToRemove, "");
                i = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] testCases = { "Pp", "abBAc", "qFxXfQo", "leeEetcode", "gOoGglaEedDd" };

        for (String s : testCases) {
            String x = makeGood(s);
            System.out.println(s + " -> " + x);
        }
    }
}