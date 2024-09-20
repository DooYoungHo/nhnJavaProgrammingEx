
public class Test {

    public static int max(int x, int y, int z) {
        if (x > y && x > z) {
            return x;
        }
        else if (y > x && y > z) {
            return y;
        }
        return z;
    }

    public static int max3(int x, int y, int z) {
        return m(m(x, y), z);
    }

    public static int m(int x, int y) {
        return (x > y) ? x : y;
    }

    static void m(int[] array) {
        array[0] = 5;
        System.out.println(array[0]);
    }

    static int addAll(int... values) {
        
        int result = 0;
        
        for (int i : values) {
            result += i;
        }

        return result;
    }

    public static void printToRecursive(int to) {
        
        if (to < 0) {
            return;
        }
        System.out.println("To : " + to);
        printToRecursive(to - 1);
    }

    static int factorial(int n) {
        
        if (n < 1) {
            return 1;
        }
        else {
            return factorial(n - 1) * n;
        }
    }

    public static void main(String[] args) {
        // int i = max(35, 50, 45);
        // System.out.println(i);

        // int j = max3(110, 30, 100);
        // System.out.println(j);

        // int[] arr = {1, 2, 3, 4 ,5};
        // System.out.println(arr[0]);
        // m(arr);
        // System.out.println(arr[0]);
        // System.out.println(addAll(1, 2, 3));
        // System.out.println(addAll(10, 20, 30, 40, 50));
        // System.out.println(addAll(100, 90, 80, 70, 60, 50));
        printToRecursive(10);
    }

}