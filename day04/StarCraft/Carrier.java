package StarCraft;

public class Carrier extends Unit implements Flyable {

    public Carrier() {
        super("Carrier", 25, 40);
    }

    @Override
    public void target(Unit unit) {
        this.unitAttack(unit);
    }
    
}
