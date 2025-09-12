    package ua.opnu;

    public class Main {
        /**
         * Constant for number 9.
         * */
        private static final int NUM = 9;

        /**
         *the main method of the program.
         * @param args
         */
    public static void main(final String[] args) {
        System.out.println("Hello world!");
    }

    // ======== Logical operations ========
    /**
     * Given two temperatures, return true if one is less than
     * 0 and the other is greater than 100.
     * Example:
     * icyHot(120, -1) → true
     * icyHot(-1, 120) → true
     * icyHot(2, 120) → false
     * =======================================================
     * @param temp1 the first temperature.
     * @param temp2 the second temperature.
     * @return true if one temperature < 0 and the other > 100.
     */
        public boolean icyHot(final int temp1, final int temp2) {
            final int max = 100;
            return (temp1 > max && temp2 < 0)
                || (temp1 < 0 && temp2 > max);
    }

    /**
     * Given 2 int values, return true if either of them is in the range 10.
     * .20 inclusive.
     * Example:
     * in1020(12, 99) → true
     * in1020(21, 12) → true
     * in1020(8, 99) → false
     * ===================================================================
     * @param a first number of the range.
     * @param b  second number of the range.
     * @return true if either a or b is between 10 and 20 inclusive.
     */
    public boolean in1020(final int a, final int b) {
        final int minRan = 10;
        final int maxRan = 20;
        return (a >= minRan && a <= maxRan) || (b >= minRan && b <= maxRan);
    }

    /**
     * We'll say that a number is "teen" if it is in the range 13.
     * .19 inclusive.
     * Given 3 int values, return true if 1 or more of them are teen.
     * Example:
     * hasTeen(13, 20, 10) → true
     * hasTeen(20, 19, 10) → true
     * hasTeen(20, 10, 13) → true
     * =========================================================
     * @param a the first number.
     * @param b the second number.
     * @param c the third number.
     * @return true if at least one of a, b or c is a teen number.
     */
    public boolean hasTeen(final int a, final int b, final int c) {
        final int minTeen = 13;
        final int maxTeen = 19;
        return (a >= minTeen && a <= maxTeen)
            || (b >= minTeen && b <= maxTeen)
            || (c >= minTeen && c <= maxTeen);
    }

    // ======== Boolean expressions ========

    /**
     * The parameter weekday is true if it is a weekday.
     * and the parameter vacation is true if we are on vacation.
     * We sleep in if it is not a weekday or we're on vacation.
     * Return true if we sleep in.
     * Example:
     * sleepIn(false, false) → true
     * sleepIn(true, false) → false
     * sleepIn(false, true) → true
     * =========================================================
     * @param weekday first element.
     * @param vacation second element.
     * @return true if we can sleep in.
     */
    public boolean sleepIn(final boolean weekday, final boolean vacation) {
        return !weekday || vacation;
    }

    /**
     * We have two monkeys, a and b, and the parameters aSmile.
     * and bSmile indicate if each is smiling. We are in trouble.
     * if they are both smiling.
     * or if neither of them is smiling. Return true if we are in trouble.
     * Example:
     * monkeyTrouble(true, true) → true
     * monkeyTrouble(false, false) → true
     * monkeyTrouble(true, false) → false
     * =============================================
     * @param aSmile true if monkey a is smiling.
     * @param bSmile true if monkey b is smiling.
     * @return true if we are in trouble.
     */
    public boolean monkeyTrouble(final boolean aSmile, final boolean bSmile) {
        return (aSmile && bSmile) || (!aSmile && !bSmile);
    }

    /**
     * Given 2 int values, return true if one is negative.
     *  And one is positive. Except if the parameter "negative"
     * is true, then return true only if both are negative.
     * Example:
     * posNeg(1, -1, false) → true
     * posNeg(-1, 1, false) → true
     * posNeg(-4, -5, true) → true
     * ===================================================
     * @param a the first integer.
     * @param b the second integer.
     * @param negative true, then return true only if both are negative.
     * @return the result.
     */
    public boolean posNeg(final int a, final int b, final boolean negative) {
        return negative ? (a < 0 && b < 0) : (a < 0 ^ b < 0);
    }

    // ======== Loops and Arrays ========

    /**
     * Given an array of ints, return the number of 9's in the array.
     * Example:
     * arrayCount9([1, 2, 9]) → 1
     * arrayCount9([1, 9, 9]) → 2
     * arrayCount9([1, 9, 9, 3, 9]) → 3
     * ===================================
     * @param nums the array of integers.
     * @return the count of 9.
     */
    public int arrayCount9(final int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (i == NUM) {
                count++;
            }
        }
        return count;
    }

    /**
     * Given an array of ints, return true.
     * if one of the first 4 elements in the array is a 9.
     * The array length may be less than 4.
     * Example:
     * arrayFront9([1, 2, 9, 3, 4]) → true
     * arrayFront9([1, 2, 3, 4, 9]) → false
     * arrayFront9([1, 2, 3, 4, 5]) → false
     * ========================================
     * @param nums the array of integers.
     * @return if a 9 appears in the first 4 elements.
     */
    public boolean arrayFront9(final int[] nums) {
        final int elements = 4;
        for (int i = 0; i < nums.length && i < elements; i++) {
            if (nums[i] == NUM) {
                return true;
            }
        }
        return false;
    }

    /**
     * Given an array of ints, return true if the sequence.
     * Of numbers 1, 2, 3 appears in the array somewhere.
     * Example:
     * array123([1, 1, 2, 3, 1]) → true
     * array123([1, 1, 2, 4, 1]) → false
     * array123([1, 1, 2, 1, 2, 3]) → true
     * =======================================
     * @param nums the array of integers.
     * @return true if the sequence 1, 2, 3 is found.
     */
    public boolean array123(final int[] nums) {
        final int number = 3;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == number) {
                return true;
            }
        }
        return false;
    }

    // ======== Strings ========

    /**
     * Given a string name, e.g. "Bob", return a greeting of the form "Hello
     * Bob!".
     * Example:
     * helloName("Bob") → "Hello Bob!"
     * helloName("Alice") → "Hello Alice!"
     * helloName("X") → "Hello X!"
     * ======================================
     * @param name the name to greet.
     * @return the greeting string.
     */
    public String helloName(final String name) {
        return String.format("Hello %s!", name);
    }

    /**
     * Given a string of any length, return a new string where the last 2 chars.
     * if present, are swapped, so "coding" yields "codign".
     * Example:
     * lastTwo("coding") → "codign"
     * lastTwo("cat") → "cta"
     * lastTwo("ab") → "ba"
     * ======================================
     * @param str the input string.
     * @return the string with the last two swapped.
     */
    public String lastTwo(final String str) {
        if (str.length() < 2) {
            return str;
        }
        String start = str.substring(0, str.length() - 2);
        char secondLast = str.charAt(str.length() - 2);
        char last = str.charAt(str.length() - 1);
        return start + last + secondLast;
    }
    /**
     * Given a string of even length, return a string made of the middle
     * two chars, so the string "string" yields "ri".
     * The string length will be at least 2.
     * middleTwo("string") → "ri"
     * middleTwo("code") → "od"
     * middleTwo("Practice") → "ct"
     * ====================================
     * @param str the input string.
     * @return the middle two chars.
     */
    public String middleTwo(final String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
    }


}
