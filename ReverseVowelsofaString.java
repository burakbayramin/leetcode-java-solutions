public class ReverseVowelsofaString {
    
    public String reverseVowels(String s) {
        if(s == null || s.length()==0) return s;
        String vowels = "aeiouAEIOU";
        char[] ch = s.toCharArray();
        int start = 0, end = ch.length-1;
        while(start <= end) {
            while(start < end && !vowels.contains(ch[start]+"")) {
                start++;
            }
            while(start < end && !vowels.contains(ch[end]+"")) {
                end--;
            }
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        return new String(ch);   
    }

    public static void main(String[] args) {
        
    }
}
