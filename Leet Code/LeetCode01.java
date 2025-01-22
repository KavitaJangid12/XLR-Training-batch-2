class LeetCode01 {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reversed = 0;
        while (x > reversed) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return x == reversed || x == reversed / 10;
    }
    public static void main(String[] args) {
        LeetCode01 solution = new LeetCode01();
        int[] testCases = {121, -121, 10};
        for (int testCase : testCases) {
            System.out.println("Is " + testCase + " a palindrome? " + solution.isPalindrome(testCase));
        }
    }
}