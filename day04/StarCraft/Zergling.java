package StarCraft;

public class Zergling extends Unit {
    public Zergling() {
        super("Zergling", 2, 2);
    }

    @Override
    public void target(Unit unit) {
        if (unit instanceof Flyable) {
            System.out.println("Can't attack");
        }
        else {
            this.unitAttack(unit);
        }
    }
}
