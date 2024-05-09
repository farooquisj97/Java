class PushPop {
    public static void main(String[] args) {
        int[] stack = new int[5];
        int pos = -1;
        int val = 10;
        for (int i = 0; i <= stack.length; i++) {
            display(stack);
            pos = push(stack, pos, val);
            val += 10;
        }
        System.out.println();
        for (int i = 0; i <= stack.length; i++) {
            display(stack);
            pos = pop(stack, pos);
        }
    }
    public static int push(int[] stack, int pos, int val){
        pos++;
        if (pos<stack.length){
            stack[pos] = val;
        }
        else {
            //display(stack);
            System.out.println("Stack is full. Element " + val + " was not added.");
            pos--;
        }
        return pos;
    }
    public static int pop(int[] stack, int pos){
        if (pos>=0){
            stack[pos] = 0;
            pos--;
        }
        else {
            //display(stack);
            System.out.println("Stack is empty. Element could not be removed.");
        }
        return pos;
    }
    public static void display(int[] arr){
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }
}




