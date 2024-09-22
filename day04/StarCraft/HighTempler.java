package StarCraft;

public class HighTempler extends Unit {
    
    public HighTempler() {
        super("HighTempler", 10, 2);
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
