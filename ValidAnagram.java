import java.util.Arrays;

public class ValidAnagram {
    
    public static boolean isAnagram(String s, String t) {
        char[] sc = s.toCharArray();
        Arrays.sort(sc);
        char[] tc = t.toCharArray();
        Arrays.sort(tc); 
        if(Arrays.equals(sc, tc)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "rac";
        String t = "car";
        System.out.println(isAnagram(s, t));
    }
}
