// Last updated: 7/8/2026, 10:31:56 PM
class Solution {

    public boolean isPalindrome(int x) {

        // Negative numbers are not palindrome
        // Numbers ending in 0 (except 0) are not palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;

        while (x > reversedHalf) {

            reversedHalf = reversedHalf * 10 + (x % 10);
            x = x / 10;
        }

        // Even length OR odd length check
        return (x == reversedHalf ||
                x == reversedHalf / 10);
    }
}