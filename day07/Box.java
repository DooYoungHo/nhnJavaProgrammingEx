public class Box<T> {

    private T i;

    public Box(T i) {
        this.i = i;
    }

    public T getSerial() {
        return this.i;
    }
    
}

class Test {
    public static void main(String[] args) {
        Box<Integer> b = new Box<>(5);
        System.out.println(b.getSerial());

        Box<String> c = new Box<>("Hello");
        System.out.println(c.getSerial());
    }
}
