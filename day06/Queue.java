import java.util.Arrays;

public class Queue {
    
    private int[] array;
    private int size;
    private int front;
    private int rear;

    public Queue() {
        this(10);
    }

    public Queue(int size) {
        this.size = size;
        this.array = new int[size];
        this.front = 0;
        this.rear = 0;
    }

    public void add(int value) {

        if (rear >= size) {
            array = Arrays.copyOf(array, (size * 2));
            size = array.length;
            this.array[rear++] = value;
        }
        else {
            this.array[rear++] = value;
        }
    }

    public int poll() {

        if (isEmpty()) {
            return -1;
        }

        return this.array[front++];
    }

    public int peek() {

        if (isEmpty()) {
            return -1;
        }

        return this.array[rear];
    }

    public int count() {

        if (isEmpty())
            return -1;

        return this.rear - this.front;
    }

    private boolean isEmpty() {
        
        if (front == rear) {
            return true;
        }
        
        return false;
    }
}

class Test {
    public static void main(String[] args) {
        Queue queue = new Queue(3);

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println("count : " + queue.count());
    }
}