package StarCraft;

public class Mutalisk extends Unit implements Flyable {
    public Mutalisk() {
        super("Mutalisk", 2, 8);
    }

    @Override
    public void target(Unit unit) {
        this.unitAttack(unit);
    }
}
