/*
 * dividing the string into 2k substrings by two pointer and 
 * then for each substring string, according to its length, making new string
 */


class Solution {

    public String reverseStr(String s, int k) {
        int start  = 0, end = 2*k;
        int strLength  = s.length();
        String finalString = "";
        int totalLength = s.length();
        String inhandStr = "";
        while( start < totalLength ) {
            end = start + 2*k;
            if ( end > totalLength )  {
                inhandStr = s.substring(start);
            }
            else {
                inhandStr = s.substring(start, end);
            }
            strLength = inhandStr.length();
            if( strLength == 2*k || strLength >= k) {
                finalString += new StringBuilder(inhandStr.substring(0, k)).reverse().toString() + inhandStr.substring(k);
            }
            else if( strLength < k ) {
                finalString += new StringBuilder(inhandStr).reverse().toString();
            }
            start = end;
        }
        return finalString;

    }
}
