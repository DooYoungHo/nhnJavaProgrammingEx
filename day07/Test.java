public class Test {
    public static void main(String[] args) {
        Shelf shelf = new Shelf();
        for (int i = 0; i < 100; i++) {
            shelf.add(new HumanTypeToy("짭 버즈 - " + i));
        }

        HumanTypeToy buzz = new HumanTypeToy("오리지널 버즈");

        buzz.say(shelf.getShelves().get(0), "안녕하세요");

        for(Toy toy : shelf.getShelves()) {
            System.out.println(toy);
        }
    }
}
