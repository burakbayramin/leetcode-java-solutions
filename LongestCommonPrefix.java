public class LongestCommonPrefix {
    
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String str = strs[i];
            int j = 0;
            while (j < prefix.length()) {
                if (str.length() <= j || str.charAt(j) != prefix.charAt(j)) {
                    prefix = prefix.substring(0, j);
                    break;
                }
                j++;
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));        
    }
}
