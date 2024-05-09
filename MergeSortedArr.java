class MergeSortedArr {
    public static void main(String[] args) {    
        int[] a = {1,5,10,15,20,46};
        int[] b = {2,4,6,17,25,66,77};
        int[] c = new int[a.length+b.length];
        int i = 0;
        int j = 0;
        for (int k=0; k<c.length; k++){
            if (i<a.length && j<b.length){ // within both arr comapre karna padega
                if (a[i]<b[j]){
                    c[k] = a[i];
                    i++;
                }
                else {
                    c[k] = b[j];
                    j++;
                }
            }
            else if (i>=a.length){ // one arr is shorter
                c[k] = b[j];
                j++;
            }
            else {                 // other arr is shorter
                c[k] = a[i];
                i++;
            }
        }
        for (int val : c) {
            System.out.print(val + " ");
        }
    }   
}
