class Solution {
    public String finalString(String s) {
        if( s.length() == 0  ) return s;
        int start = 0, strLength = s.length();
        String finalString = "";
        while( start < strLength ) {
            if( s.charAt(start) != 'i') finalString += s.charAt(start);
            else {
                finalString = new StringBuilder(finalString).reverse().toString();
            }
            start += 1;
        }
        return finalString;
    }
}
