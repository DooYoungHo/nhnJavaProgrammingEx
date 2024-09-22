package StarCraft;

public class Wraith extends Unit implements Flyable {

    public Wraith() {
        super("Wraith", 3, 10);
    }

    @Override
    public void target(Unit unit) {
        this.unitAttack(unit);
    }
    
}
