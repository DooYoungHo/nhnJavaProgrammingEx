public class HumanTypeToy extends Toy {
    
    public HumanTypeToy(String name) {
        super(name);
    }

    @Override
    public void say(Toy toy, String message) {
        System.out.println(this.getName() + "이(가) " + toy.getName() + "에게 말을 합니다.");
        System.out.println(message);
    }

}
