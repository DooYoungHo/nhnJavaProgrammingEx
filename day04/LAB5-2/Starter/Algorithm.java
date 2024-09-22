public class Algorithm {
    /* 
    public static int addFrom1To10() {
        int sum = 0;
        for (int i = 1; i <= 10; i++)
            sum += i;
        return sum;
    }*/
    static final int addFrom1To10 = 55;

    //
    // To-do add sigma method here
    //
    static int sigma(int start, int end, int step) {
        return calc(new Adder(), 0, start, end, step);
    }

    //
    // To-do add pi method here
    //
    static int pi(int start, int end, int step) {
        return calc(new Multiplier(), 1, start, end, step);
    }


    //
    // To-do add accumulate method here
    //
    static int calc(Adder binder, int init, int start, int end, int step) {
        int result = init;

        for (int i = start; i <= end; i = i + step) {
            result = binder.apply(i, result);
        }

        return result;
    }


    static int calc(Multiplier binder, int init, int start, int end, int step) {
        int result = init;

        for (int i = start; i <= end; i = i + step) {
            result = binder.apply(i, result);
        }

        return result;
    }


    //
    // To-do add overloaded accumulate method here
    //

    public static void main(String[] args) {
        //
        // To-do: Add code here
        //

        System.out.println("Sum : " + addFrom1To10);
        System.out.println(sigma(1, 10, 1));
        System.out.println(pi(1, 10, 1));
    }
}