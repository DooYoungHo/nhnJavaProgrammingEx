package StarCraft;

public class Zealot extends Unit {
    public Zealot() {
        super("Zealot", 5, 20);
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
