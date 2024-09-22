public abstract class Unit {

    protected int hp;
    protected int location;
    protected String name;

    public Unit(int hp, int location, String name) {
        this.hp = hp;
        this.location = location;
        this.name = name;
    }

    public void reduceHp() {
        this.hp--;
    }

    public abstract void move(int location);    // move method를 강제로 만들어줘야함

    public int getHp() {
        return hp;
    }

    public int getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.hp + ", " + this.name;
    }
}
