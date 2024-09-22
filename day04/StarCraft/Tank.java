package StarCraft;

public class Tank extends Unit {
    
    public Tank() {
        super("Tank", 7, 15);
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
