// Last updated: 7/8/2026, 10:31:58 PM
class Solution {

    public int myAtoi(String s) {

        int i = 0;
        int n = s.length();

        // 1. Ignore spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // 2. Check sign
        int sign = 1;

        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        long result = 0;

        // 3. Convert digits
        while (i < n && Character.isDigit(s.charAt(i))) {

            int digit = s.charAt(i) - '0';

            result = result * 10 + digit;

            // 4. Clamp overflow
            if (result * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (result * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int)(result * sign);
    }
}