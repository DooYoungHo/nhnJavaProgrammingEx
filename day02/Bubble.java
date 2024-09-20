import java.util.Arrays;

public class Bubble {
    
    public static int[] bubbleSort(int[] array) {
        
        for (int i = (array.length - 1); i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        
        return array;
    }

    // public static boolean palimdrom(String text) {
        
    //     int length = text.length();
    //     int same = 0;
    //     int count = 1;

    //     for (int i = 0; i < length; i++) {
    //         if (text.charAt(i) == text.charAt(length - count)) {
    //             same++;
    //         }
    //         count++;
    //     }

    //     if (same == length) {
    //         return true;
    //     }

    //     return false;
    // }

    public static boolean anigram(String a1, String a2) {
        
        if (a1.length() != a2.length()) {
            return false;
        }

        int[] ch1 = new int[26];
        int[] ch2 = new int[26];
 
        for (int i = 0; i < a1.length(); i++) {
            if (a1.charAt(i) - 'a' >= 0) {
                ch1[a1.charAt(i) - 'a']++;
            }
        }

        for (int i = 0; i < a2.length(); i++) {
            if (a2.charAt(i) - 'a' >= 0) {
                ch2[a2.charAt(i) - 'a']++;
            }
        }

        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] != ch2[i]) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 10, 9, 7, 6};

        int[] sortArr = bubbleSort(arr);

        for (int i : sortArr)
            System.out.println(i);

        String a1 = "applle";
        String a2 = "ppaale";

        System.out.println("Anigram : " + anigram(a1, a2));
    }
}
