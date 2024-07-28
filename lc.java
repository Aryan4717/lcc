Q .3234. Count the Number of Substrings With Dominant Ones
Attempted
Medium
Companies

Hint
You are given a binary string s.

Return the number of 
substrings
 with dominant ones.

A string has dominant ones if the number of ones in the string is greater than or equal to the square of the number of zeros in the string.

 

Example 1:

Input: s = "00011"

Output: 5

Explanation:

The substrings with dominant ones are shown in the table below.

CODE:

class Solution {
    public int numberOfSubstrings(String s) {
        int l = s.length();
        int[] opposition = new int[l + 1];
        int[] zii = new int[l + 1];

        for (int i = 0; i < l; i++) {
            opposition[i + 1] = opposition[i] + (s.charAt(i) == '1' ? 1 : 0);
            zii[i + 1] = zii[i] + (s.charAt(i) == '0' ? 1 : 0);
        }

        int scie = 0;

        for (int beg = 0; beg < l; beg++) {
            for (int end = beg; end < l; end++) {
                int ois = opposition[end + 1] - opposition[beg];
                int zis = zii[end + 1] - zii[beg];

                if (ois >= zis * zis) {
                    scie++;
                }
            }
        }

        return scie;
    }
}


