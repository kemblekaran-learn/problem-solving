public class PatternMatcher {

    /*
     * Given two strings, check if they have the same pattern.
     * for example:
     * "AATTRA" and "OOPPUO" have the same pattern AND
     * "WWERR" and "SSDFT" do not have the same pattern
     */
    public static void main(String[] args) {
        boolean isValidPattern = isValidPattern("WWERR", "SSDFT");
        System.out.println("Is valid pattern: " + isValidPattern);
    }

    public static boolean isValidPattern(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }

        // check if the pattern of the first string is equal to the pattern of the
        // second string
        return getPattern(first).equals(getPattern(second));
    }

    /*
     * Given a string, return the pattern of the string.
     * for example:
     * "AATTRA" => "**-**-" and "OOPPUO" => "**-**-"
     * "WWERR" => "*--*" and "SSDFT" => "*--*-"
     */
    private static String getPattern(String string) {
        char[] firstArray = string.toCharArray();
        String pattern = "";
        for (int i = 0; i < firstArray.length - 1; i++) {
            char c = firstArray[i];
            if (c == firstArray[i + 1])

            {
                pattern = pattern + "*";
            } else {
                pattern = pattern + "-";
            }

            c = firstArray[i];
        }

        System.out.println(String.format("Pattern for %s : %s", string, pattern));
        return pattern;
    }
}
