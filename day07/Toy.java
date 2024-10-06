public abstract class Toy implements Movable {
    
    private String name;

    public Toy(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract void say(Toy toy, String message);

    @Override
    public void move(Toy toy) {
        System.out.println(toy.getName() + "이(가) 움직입니다.");
    }

    @Override
    public String toString() {
        return this.name;
    }
}