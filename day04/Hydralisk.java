public class Hydralisk extends Unit {
    
    public Hydralisk(int hp, int location, String name) {
        super(hp, location, name);
    }

    @Override
    public void move(int location) {
        System.out.println("Can Walk");
        this.location = location;
    }
}
