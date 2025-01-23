public class LeetCode03 { 
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;

        int sign = 1, i = 0, result = 0;
        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            sign = s.charAt(0) == '-' ? -1 : 1;
            i++;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i++) - '0';
            if (result > (Integer.MAX_VALUE - digit) / 10)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            result = result * 10 + digit;
        }

        return result * sign;
    }

    public static void main(String[] args) {
        LeetCode03 solution = new LeetCode03();

        String[] testCases = {
            "42",              // Output: 42
            "   -42",          // Output: -42
            "4193 with words", // Output: 4193
            "words and 987",   // Output: 0
            "-91283472332",    // Output: -2147483648
            "3.14159",         // Output: 3
            "+1",              // Output: 1
            "00000-42a1234",   // Output: 0
            "   +0 123"        // Output: 0
        };

        for (String testCase : testCases) {
            System.out.println("Input: \"" + testCase + "\" -> Output: " + solution.myAtoi(testCase));
        }
    }
}