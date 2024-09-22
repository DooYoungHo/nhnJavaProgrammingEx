public class Marine extends Unit implements Attackable {

    public Marine(int hp, int location, String name) {
        super(hp, location, name);
    }

    @Override
    public void attack(Unit subUnit) {
        System.out.println(this.name + "이 " + subUnit.toString() + "을 기관총으로 쏩니다.");
        subUnit.reduceHp();
    }

    @Override
    public void move(int location) {
        System.out.println("Can Walk");
        this.location = location;
    }
}