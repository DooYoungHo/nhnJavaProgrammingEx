import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
    
    public static <T extends Comparable<T>> void bubbleSort(T[] items) {
        
        for (int i = (items.length - 1); i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (items[j].compareTo(items[j + 1]) > 0) {
                    T temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList[] list = { new ArrayList<>(), new ArrayList<>() };

        String[] arrStr = { 
            "Woody",
            "Java",
            "Hello"
        };

        bubbleSort(arrStr);

        System.out.println(Arrays.toString(arrStr));
    }
}