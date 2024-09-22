package StarCraft;

public class Hydralisk extends Unit {
    public Hydralisk() {
        super("Hydralisk", 3, 7);
    }

    @Override
    public void target(Unit unit) {
        this.unitAttack(unit);
    }
    
}
