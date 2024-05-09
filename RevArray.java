class RevArray {
    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5,6,7,8,9};
        int[] b = new int[10];
        int c[] = a;
        for (int j=0; j<a.length; j++){
            System.out.print(a[j] + "\t");
        }
        for (int i=a.length-1; i>=0; i--){
            b[i] = a[a.length-i-1];
        }
        System.out.println("\nOn reversing");
        for (int j=0; j<b.length; j++){
            System.out.print(b[j] + "\t");
        }
        int i=0;
        int j=a.length-1;
        int temp;
        while (i<j){
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        System.out.println("\nOn reversing the same array");
        for (int l=0; l<a.length; l++){
            System.out.print(a[l] + "\t");
        }
    }
}