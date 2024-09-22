package StarCraft;

public class Queen extends Unit implements Flyable {

    public Queen() {
        super("Queen", 15, 25);
    }
    
    @Override
    public void target(Unit unit) {
        this.unitAttack(unit);
    }
}
