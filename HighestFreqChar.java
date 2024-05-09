import java.util.*;
class HighestFreqChar {
    
    public static void main(String[] args) {
        String s1  = "aasdasasa";
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (map.containsKey(ch)) {
                int val = map.get(s1.charAt(i));
                val += 1;
                map.put(s1.charAt(i),val);
                max = (max>val)? max : val;
            }
            else {
                map.put(ch,1);
            }
        }
        
        System.out.println(map);
        for(char ch : map.keySet()){
            if (map.get(ch)==max)
            System.out.println(ch + " " + max);
        }

        //sir ka method
        char ans = s1.charAt(0);
        for (char ch : map.keySet()) {
            if (map.get(ch)>map.get(ans)){
                ans = ch;
            }
        }
        System.out.println(ans);
    }

}
