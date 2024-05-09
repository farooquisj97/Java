class BoundsRec {
    public static void main(String[] args) {
        int[] arr = {0,1,2,5,5,5,5,5,8,9,10,11,12,13,13,13,13,13,14,15,16};
        //  index    0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
        int key = 5;
        System.out.println("start index "+ first_index(arr, key, 0, arr.length-1));
        System.out.println("ending index "+ last_index(arr, key, 0, arr.length-1));   
    }

    static int first_index(int[] arr, int key, int li, int hi){
        int fi = hi+1;
        int mi = (li+hi)/2;
        //System.out.println(li+","+mi+","+hi+","+fi);
        if (arr[mi]==key) { 
            fi = (fi>mi)? mi : fi;
            hi = mi-1;
        }
        else if(arr[mi]>key) hi = mi-1;
        else li = mi+1;
        //System.out.println(li+","+mi+","+hi+","+fi);
        
        if (li<=hi)  fi = first_index(arr, key, li, hi);
        return fi;
    }

    static int last_index(int[] arr, int key, int li, int hi){
        int ei = li-1;
        int mi = (li+hi)/2;
        //System.out.println(li+","+mi+","+hi+","+ei);
        if (arr[mi]==key) { 
            ei = (mi>ei)? mi : ei;
            li = mi+1;
        }
        else if(arr[mi]>key) hi = mi-1;
        else li = mi+1;
        //System.out.println(li+","+mi+","+hi+","+ei);

        if (li<=hi)  ei = last_index(arr, key, li, hi);
        return ei;
    }
}