package StarCraft;

public class Scout extends Unit implements Flyable {

    public Scout() {
        super("Scout", 5, 10);
    }

    @Override
    public void target(Unit unit) {
        this.unitAttack(unit);
    }
}
