package StarCraft;

public class Guardian extends Unit implements Flyable {
    public Guardian() {
        super("Guardian", 3, 6);
    }

    @Override
    public void target(Unit unit) {
        this.unitAttack(unit);
    }
}
