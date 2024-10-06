@FunctionalInterface
public interface RunSomething {
    public int apply(int i, int j, int k);

    default void run() {
        System.out.println("Run !");
    }

    static void walk() {
        System.out.println("Walk !");
    }
}

class ExampleBinary {
    RunSomething run = (x, y, z) -> x + y + z;
}

class Test {
    public static void main(String[] args) {
        RunSomething run = (x, y, z) -> x + y + z;
        int result = run.apply(10, 10, 10);
        System.out.println(result);

        ExampleBinary r = new ExampleBinary();
        int result2 = r.run.apply(20, 20, 20);
        System.out.println(result2);
    }
}