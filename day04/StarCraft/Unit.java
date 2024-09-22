package StarCraft;

public abstract class Unit {
    
    private String name;
    private int attack;
    private int defence;

    public Unit(String name, int attack, int defence) {
        this.name = name;
        this.attack = attack;
        this.defence = defence;
    }

    protected void unitAttack(Unit unit) {
        unit.defence -= this.getAttack();
        if (unit.defence <= 0) {
            unit.defence = 0;
        }
    }

    public boolean isAlive() {
        return this.defence > 0;
    }

    public abstract void target(Unit unit);

    public String getName() {
        return this.name;
    }

    public int getAttack() {
        return this.attack;
    }

    public int getDefence() {
        return this.defence;
    }

    @Override
    public String toString() {
        return this.name;
    }
}