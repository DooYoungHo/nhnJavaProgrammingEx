package StarCraft;

public class Goliath extends Unit implements AntiAir {

    public Goliath() {
        super("Goliath", 5, 15);
    }

    @Override
    public void target(Unit unit) {
        this.unitAttack(unit);
    }
}