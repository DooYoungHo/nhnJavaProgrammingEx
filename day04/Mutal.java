public class Mutal extends Unit {
    
    public Mutal(int hp, int location, String name) {
        super(hp, location, name);
    }

    @Override
    public void move(int location) {
        System.out.println("Can Fly");
        this.location = location;
    }
}
