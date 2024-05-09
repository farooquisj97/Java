class Main{
	public static void main(String[] args) {
		String s1, s2;
		s1 = "hiii hello ji";
		s2 = "hiii";
		int check = 0;
		int flag = 1;
		if (s1.length()==s2.length()){
			for (int i=0; i<s1.length(); i++) {
				if (s1.charAt(i)==s2.charAt(i)) 
					check = 1;
				else {
					check = 0;
					break;
				}
			}
		}
		if (check==1)
			System.out.println("Lexicographically equal");
		else
			System.out.println("Not lexicographically equal");

		// string method to do the same work is "compareTo()" or "compareToIgnoreCase()"
		flag = s1.compareTo(s2);
		System.out.println(flag);
	}
}
