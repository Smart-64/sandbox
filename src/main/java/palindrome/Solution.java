package palindrome;


public class Solution {
    public static void main(String[] args) {

        int number = 1000021;
        System.out.println(isPalindrome(number));
    }

    public static boolean isPalindrome(int x) {
        String strNumber = String.valueOf(x);
        boolean isTrue = false;
        for (int i = 0; i < strNumber.length(); i++) {
            if (strNumber.charAt(i) == strNumber.charAt(strNumber.length() - 1 - i)) {
                isTrue = true;
            } else {
                return false;
            }
            if (i == strNumber.length() - 1 - i) return isTrue;
        }
        return isTrue;
    }
}
