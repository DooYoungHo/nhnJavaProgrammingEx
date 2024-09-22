package StarCraft;

public class Marine extends Unit {

    public Marine() {
        super("Marine", 3, 10);
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
