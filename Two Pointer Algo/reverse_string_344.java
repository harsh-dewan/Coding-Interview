class Solution {
    public void reverseString(char[] s) {

        //using two pointer we can solve this questions
        int start = 0, end = s.length-1;
        while( start < end ) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start += 1;
            end -= 1;
        }
        return ;
        
    }
}
