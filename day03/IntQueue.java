public class IntQueue {
    
    int[] array = new int[10];
    int front = 0;
    int rear = 0;
    int size = array.length;

    public boolean add(int n) {

        if (isFull()) {
            return false;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = n;
                rear++;
                break;
            }
        }
        return true;
    }

    public int pop() {
        
        if (isEmpty()) {
            return -1;
        }

        int value = array[0];

        for (int i = 0; i < (array.length - 1); i++) {
            array[i] = array[i + 1];
        }

        rear--;
        
        return value;
    }

    public boolean isFull() {

        if (rear == (array.length - 1)) {
            return true;
        }

        return false;
    }

    public boolean isEmpty() {
        
        if (front == 0 && rear == 0) {
            return true;
        }
        
        return false;
    }
}
