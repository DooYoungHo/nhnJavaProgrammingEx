import java.util.Arrays;
import java.util.EmptyStackException;

public class GenaricStack<E> {

    private E[] arr;
    private int size;
    private int index;

    public GenaricStack() {
        this(10);
    }

    @SuppressWarnings("unchecked")
    public GenaricStack(int size) {
        this.index = 0;
        this.size = size;
        arr = (E[]) new Object[this.size];
    }

    public void push(E element) {

        if (index >= arr.length) {
            arr = Arrays.copyOf(arr, size * 2);
            size *= 2;
        }
        else {
            arr[index++] = element;
        }
    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return arr[--index];
    }

    public E peek() {
        return arr[index];
    }
    
    public boolean isEmpty() {
        return index == 0 ? true : false;
    }

}

class Test {
    public static void main(String[] args) {
        
        try {
            GenaricStack<String> st1 = new GenaricStack<>();

            st1.push("is Woody");
            st1.push("My name");
            st1.push("Hi");
            
            System.out.println(st1.pop());
            System.out.println(st1.pop());
            System.out.println(st1.pop());
            System.out.println(st1.pop());
        }
        catch (EmptyStackException e) {
            System.out.println("Stack is Empty..!");
        }

    }
}