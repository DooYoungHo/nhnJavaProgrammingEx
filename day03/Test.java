import java.math.BigDecimal;
import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        // Stack
        IntStack stack = new IntStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        stack.push(11);
        stack.push(12);

        stack.pop();

        // Queue
        IntQueue queue = new IntQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        for(int i : queue.array)
            System.out.println("Add Queue : " + i);

        queue.pop();
        queue.pop();
        
        for(int i : queue.array)
            System.out.println("Pop Queue : " + i);

    }




    static int[] bubbleSort(Asc asc ,int[] arr) {
        
        for (int i = (arr.length - 1); i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (asc.asc(arr[j], arr[j + 1])) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        return arr;
    }

    static int[] bubbleSort(Dec dec ,int[] arr) {
        
        for (int i = (arr.length - 1); i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (dec.dec(arr[j], arr[j + 1])) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        return arr;
    }

    static int[] ascBubbleSort(int[] arr) {
        return bubbleSort(new Asc(), arr);
    }

    
    static int[] decBubbleSort(int[] arr) {
        return bubbleSort(new Dec(), arr);
    }
}