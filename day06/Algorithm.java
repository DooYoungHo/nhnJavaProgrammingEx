public class Algorithm {
    
    public int sigma(int start, int end, int step) {
        return calc(new Adder(), 0, start, end, step);
    }
    
    public int pi(int start, int end, int step) {
        return calc(new Multiplier(), 1, start, end, step);
    }

    private int calc(BinaryOp binder, int init, int start, int end, int step) {
        int result = init;
        for (int i = start; i < end; i = i + step) {

            result = binder.apply(result, i);

        }
        return result;
    }
}