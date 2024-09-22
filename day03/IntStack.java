import java.util.EmptyStackException;

public class IntStack {
    
    private int[] array = new int[10];
    private int index = 0;

    // public boolean push(int n) {
    //     if (isFull()) {
    //         return false;
    //     }
    //     else {
    //         array[index++] = n;
    //     }
    //     return true;
    // }

    public void push(int n) {
        try {
            if(index >= array.length - 1)
                return;

            array[index++] = n;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stack is Full...!");
        }
    }

    public int pop() {  // int
        
        if (isEmpty())
            throw new EmptyStackException();

        return array[index--];
    }
    
    public int peek() {
        if (index == 0)
            return -1;
        
        return array[index];
    }

    public boolean isEmpty() {
        if (index == 0)
            return true;
        
        return false;
    }

    public boolean isFull() {
        if (index == array.length)
            return true;
        return false;
    }


    public void errorRun() throws EmptyStackException {
        System.out.println("111");
    }

}
