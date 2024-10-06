import java.util.ArrayList;

public class Shelf {
    
    private ArrayList<Toy> shelves = new ArrayList<>();

    public Shelf() {}

    public void add(Toy toy) {
        shelves.add(toy);
    }

    public void remove(Toy toy) {
        shelves.remove(toy);
    }

    public ArrayList<Toy> getShelves() {
        return shelves;
    }

}
