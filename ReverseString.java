public class ReverseString {
    
    public static void reverseString(char[] s) {
        int start = 0, end = s.length-1;
        char temp;
        while(start <= end) {
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        char[] s = {'a','b','c'};
        reverseString(s);
        for (char c : s) {
            System.out.print(c);
        }
    }
}
