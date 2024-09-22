package StarCraft;

public class Dragoon extends Unit {
    public Dragoon() {
        super("Dragoon", 3, 15);
    }
    
    @Override
    public void target(Unit unit) {
        this.unitAttack(unit);
    }
}
