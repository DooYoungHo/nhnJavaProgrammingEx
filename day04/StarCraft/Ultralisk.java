package StarCraft;

public class Ultralisk extends Unit {
    public Ultralisk() {
        super("Ultralisk", 5, 15);
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
