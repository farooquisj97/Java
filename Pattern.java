class Pattern {
    public static void main(String[] args) {
        int n = 4;
        // i => rows
        for (int i=0; i<n; i++){
            // k => space
            for (int k=n-1; k>i; k--) System.out.print("\t");
            // j => column
            for (int j=0; j<=i; j++){
                if (j<=i) System.out.print("\t*\t");
            }
            System.out.println();
        }
    }
}
