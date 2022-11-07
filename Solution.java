// Algorithm
public class Solution {
    // A + B Problem
    /**
     * @param a: An integer
     * @param b: An integer
     * @return: The sum of a and b
     */
    public int aplusb(int a, int b) {
        return a + b;
    }

    // Trailing Zeroes
    /**
     * @param n: A long integer
     * @return: An integer, denote the number of trailing zeros in n!
     */
    public long trailingZeros(long n) {
        long res = 0;
        while (n != 0){
            n /= 5;
            res += n;
        }
        return res;
    }

    // Fizz Buzz
    /**
     * @param n: An integer
     * @return: A list of strings.
     */
    public List<String> fizzBuzz(int n) {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 1; i < n + 1; i ++){
            if (i % 15 == 0){
                list.add("fizz buzz");
            }
            else if(i % 3 == 0){
                list.add("fizz");
            }
            else if(i % 5 == 0){
                list.add("buzz");
            }else {
                list.add(Integer.toString(i));
            }
        }
        return list;
    }

    // Reverse Words in a String
    /**
     * @param s: A string
     * @return: A string
     */
    public String reverseWords(String s) {
        s = s.trim();

        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }

    // Jump Game
    public boolean canJump(int[] a) {
        int n = a.length;
        int rightMostPosition = 0;

        for (int i = 0; i < n; i ++){
            if (i <= rightMostPosition){
                rightMostPosition = Math.max(i + a[i], rightMostPosition);

                if (rightMostPosition >= n - 1) return true;

            }
            else return false;
        }
        return false;

    }

    // Lower to Upper
    public String lowercaseToUppercase2(String letters) {
        return letters.toUpperCase();
    }

    // String to Integer
    /**
     * @param target: A string
     * @return: An integer
     */
    public int stringToInteger(String target) {
        if (target == null || target.isEmpty()){
            return 0;
        }

        boolean isNegative = target.charAt(0) == '-';

        int start = isNegative ? 1 : 0;

        int res = 0;
        for (int i = start; i < target.length(); i++){
            char ch1 = target.charAt(i);

            int digit = ch1 - '0';

            if (!isNegative){
                res = res * 10 + digit;
            }else {
                res = res * 10 - digit;
            }

        }
        return res;
    }

    // Leap Year
    /**
     * @param n: a number represent year
     * @return: whether year n is a leap year.
     */
    public boolean isLeapYear(int n) {
        return n % 4 == 0 && n % 100 != 0 || n % 400 == 0;
    }

    // Valid Palindrome II

    /**
     * @param s: a string
     * @return: whether you can make s a palindrome by deleting at most one character
     */
    public boolean validPalindrome(String s) {
        if (s == null || s.isEmpty()){
            return false;
        }
        int i = 0, j = s.length() -1;
        while(i < j){
            if (s.charAt(i) != s.charAt(j)){
                break;
            }
            i++;
            j--;

            if (i >= j) return true;
        }
        return isValid(s, i + 1, j) || isValid(s, i, j - 1);
    }

    public boolean isValid(String s, int start, int end){
        while (start < end){
            if (s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Capitalize the First Letter
    /**
     * @param s: a string
     * @return: a string after capitalizes the first letter
     */
    public String capitalizesFirst(String s) {
        // Write your code here
        StringBuilder sb = new StringBuilder(s);

        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        for (int i = 1; i < sb.length(); i++) {
            if (sb.charAt(i - 1) == ' ') {
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
            }else{
                sb.setCharAt(i, sb.charAt(i));
            }
        }
        return sb.toString();
    }

    // Palindrome Data Stream
    /**
     * @param s: The data stream
     * @return: Return the judgement stream
     */
    public int[] getStream(String s) {
        if (s == null || s.isEmpty()){
            return null;
        }
        int [] res = new int[s.length()];
        int oddCount = 0;
        int[] letters = new int[26];

        for (int i = 0; i < s.length(); i++){
            letters[s.charAt(i) - 'a']++;
            if (letters[s.charAt(i) - 'a'] % 2 == 1){
                oddCount++;
            }else{
                oddCount--;
            }
            res[i] = oddCount > 1 ? 0 : 1;
        }
        return res;
    }

    // Fibonacci easy
    /**
     * @param n: an integer
     * @return: an ineger f(n)
     */
    public int fibonacci(int n) {
        if (n < 1) return -1;
        if (n ==1) return 0;

        int first = 0;
        int second = 1;
        int count = 2;

        while(count < n){
            int third = first + second;
            first = second;
            second = third;
            count ++;
        }
        return second;
    }

    // Longest Semi Alternating Substring
    /**
     * @param s: the string
     * @return: length of longest semi alternating substring
     */
    public int longestSemiAlternatingSubstring(String s) {
        if (s == null || s.isEmpty()){
            return 0;
        }
        if (s.length() < 3){
            return s.length();
        }
        int endDupCount = 1;
        int maxLen = 0;
        int start = 0;

        for (int end = 1; end < s.length(); end++){
            char prevChar = s.charAt(end - 1);
            char currChar = s.charAt(end);
            if (prevChar == currChar){
                endDupCount++;
                if (endDupCount ==3){
                    start = end -1;
                    endDupCount = 2;
                }
            }else{
                endDupCount =1;
            }
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }


}
