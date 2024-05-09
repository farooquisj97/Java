for (int i = 0; i <= 7; i++) {
            display(cque);
            System.out.println(front + " " + rear);
            rear = insert(cque, val, front, rear);
            val += 10;
        }
        System.out.println();
        for (int i = 0; i <= cque.length; i++) {
            display(cque);
            front = delete(cque, front, rear);
        }