import java.util.*;

class NonReaptingLongestSubstring {
    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~ ";
        int maxlen = lengthOfLongestSubstring(s);
        System.err.println(maxlen);
    }

    static int lengthOfLongestSubstring(String s) {
        ArrayList<String> al = allSubstrings(s);
        int len = -1;
        for (int i=0; i<al.size(); i++){
            String s1 = al.get(i);
            if (repChar(s1)){
                al.remove(s1);
            }
            else {
                if(s1.length()>len){
                    len = s1.length();
                    System.out.println(s1);
                }
            }
        }
        return len;
    }

    static ArrayList<String> allSubstrings(String str){
        ArrayList<String> al = new ArrayList<>(); 
        for (int i=0; i<str.length(); i++){
            for(int j=i; j<=str.length(); j++){
                String s1 = str.substring(i,j);
                al.add(s1);
                //System.err.println(s1);
            }
        }
        return al;
    } 

    static Boolean repChar(String s1){
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            if (map.containsKey(ch)){
                return true;
            }
            else{
                map.put(ch, 1);
            }
        }
        return false;
    }

}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = 0;
        int j = 0;
        Set<Character> set= new HashSet<>();
        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (!set.contains(ch)){
                set.add(ch);
                len = Math.max(len, i-j+1);
            }
            else{
                while (set.contains(ch)){
                    set.remove(s.charAt(j));
                    j++;
                }
            }
            set.add(ch);
        }
        return len;
        
    }
}