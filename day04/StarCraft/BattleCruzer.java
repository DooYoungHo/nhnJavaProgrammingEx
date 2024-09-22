package StarCraft;

public class BattleCruzer extends Unit implements Flyable {

    public BattleCruzer() {
        super("BattleCruzer", 20, 30);
    }

    @Override
    public void target(Unit unit) {
        this.unitAttack(unit);
    }
    
}