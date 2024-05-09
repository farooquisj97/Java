class VowelSubstr {
    public static void main(String[] args) {
        String s1 = "abcaeicde";
        String substr = "";
        int len = 0;

        // System.out.println(isVowel("aaeeiioouu"));

        for (int i=0; i<s1.length(); i++){
            for (int j=s1.length(); j>=i+1; j--){
                substr = s1.substring(i,j);
                if (isVowel(substr)==true){
                    len = (len>substr.length())? len : substr.length();
                    //System.out.println(substr.length() + " " + substr);
                }            
            }
        }
        System.out.println(len);
    }

    public static boolean isVowel(String str){
        boolean vowel = true;
        str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {}
			else{
                vowel = false;
                break;
            } 
        }
        return vowel;
    }
}


 