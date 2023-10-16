import java.util.Arrays;

class Solution {
    public static void main(String[] arg) {
        String s1 = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s1));
    }

    public static int lengthOfLongestSubstring(String s) {
         int n = s.length();
    if (n == 0) {
        return 0;
    }

    int[] charIndex = new int[256]; // Assuming ASCII characters
    Arrays.fill(charIndex, -1); // Initialize all character indices to -1
    int maxLength = 0;
    int start = 0;

    for (int end = 0; end < n; end++) {
        char currentChar = s.charAt(end);
        if (charIndex[currentChar] >= start) {
            start = charIndex[currentChar] + 1;
        }
        charIndex[currentChar] = end;
        maxLength = Math.max(maxLength, end - start + 1);
    }

    return maxLength;

    }
    // public static int lengthOfLongestSubstring(String s) {

    // int bigCount=1;
    // int count = 1;
    // for (int i = 0; i < s.length(); i++) {
    // count = 1;
    // for (int j = i + 1; j < s.length(); j++) {
    // if (s.charAt(i) != s.charAt(j)) {
    // count++;
    // if(count>bigCount){
    // bigCount=count;
    // }
    // } else {

    // count = 1;
    // break;
    // }

    // }
    // if(bigCount>0){
    // return bigCount;
    // }

    // }
    // return bigCount;
    // }
}