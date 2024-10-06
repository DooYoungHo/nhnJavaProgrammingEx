@FunctionalInterface
public interface BinaryOp {

    int apply(int i, int j);

}

class Adder implements BinaryOp {
    public int apply(int i, int j) {
        return i + j;
    }
}

class Alogorithm {
    public int calc(BinaryOp binder, int init, int start, int end, int step) {
        int result = init;
        for (int i = start; i <= end; i += step) {
            result = binder.apply(result, i);
        }
        return result;
    }
}

class Test {
    public static void main(String[] args) {
        Alogorithm algo = new Alogorithm();
        int i = algo.calc(new Adder(), 0, 1, 10, 1);
        int j = algo.calc((x, y) -> x + y, 0, 1, 20, 1);        // functional interface = lambda Ok
        System.out.println(i);
        System.out.println(j);
    }
}