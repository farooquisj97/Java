class StrBuilder {
    public static void main(String[] args) {
        /*
        //declare
        StringBuilder sb = new StringBuilder("hello");
        
        //print
        System.out.println(sb);

        //get i.e. access char
        System.out.println(sb.charAt(4));

        //set
        sb.setCharAt(4, 'd');
        System.out.println(sb);

        //length
        System.out.println(sb.length());

        //insert
        sb.insert(5, 'a');
        System.out.println(sb);

        //append
        sb.append('f');
        System.out.println(sb);

        //delete
        sb.deleteCharAt(0);
        System.out.println(sb);

        //toString()
        String ans = sb.toString();
        System.out.println(ans);
        */

        //time complexities
        int n = 12346789;
        long t1 = System.currentTimeMillis();
        StringBuilder sb1 = new StringBuilder("heyy");
        for (int i = 0; i < n; i++) {
            sb1.append(i);
        }
        System.out.println(System.currentTimeMillis()-t1);

        long t2 = System.currentTimeMillis();
        String s = new String("heyy");
        for (int i = 0; i < n; i++) {
            s += i;
        }
        System.out.println(System.currentTimeMillis()-t2);
    }
}