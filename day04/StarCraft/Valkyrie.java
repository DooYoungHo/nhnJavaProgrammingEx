package StarCraft;

public class Valkyrie extends Unit implements Flyable {

    public Valkyrie() {
        super("Valkyrie", 4, 12);
    }

    @Override
    public void target(Unit unit) {
        this.unitAttack(unit);
    }

}