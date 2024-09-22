package StarCraft;

public class Corsair extends Unit implements Flyable {

    public Corsair() {
        super("Corsair", 4, 12);
    }

    @Override
    public void target(Unit unit) {
        this.unitAttack(unit);
    }
    
}
