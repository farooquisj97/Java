class CircularQue {
    int[] cq;
    boolean[] occupied;
    int n, f, l;
    CircularQue(int n){
        this.n = n;
        f = 0;
        l = 0;
        cq = new int[n];
        occupied = new boolean[n];
    }

    void add(int val){
        l++;
        l = l%n;
        if (occupied[l]==false){
            cq[l] = val; 
            occupied[l] = true;
            show();
        }
        else {
            System.out.println("Queue is full. Element " + val + " could not be added.");
        }
    }

    void del() {
        f++;
        f = f%n;
        if (occupied[f]==true) {
            cq[f] = 0;
            occupied[f] = false;
            show();
        }  
        else {
            System.out.println("Queue is empty. No element removed.");
        }
    }
    
    void show(){
        for (int i : cq) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }
}

class CirQueue {
    public static void main(String[] args) {
        CircularQue cq = new CircularQue(3);
        cq.show();
        cq.add(4);
        cq.add(5);
        cq.del();
        cq.add(6);
        cq.add(7);
        cq.add(8);
        cq.del();
        cq.del();
        cq.del();
        cq.del();
    }
} 