public class PlayGround {
    
    public static void main(String[] args) {
        Unit m1 = new Marine(10, 1, "M1");
        Unit m2 = new Marine(10, 2, "M2");

        Unit z1 = new Zealot(20, 3, "Z1");
        Unit z2 = new Zealot(20, 4, "Z2");

        Unit j1 = new Zergling(5, 5, "J1");
        Unit j2 = new Zergling(5, 6, "J2");

        Unit hy1 = new Hydralisk(15, 7, "Hy1");

        //((Zealot)z1).move(5); // 왜 형변환 할 때 2번으로 감싸는거지?

        Unit[] units = {m1, m2, z1, z2, j1, j2, hy1};

        for(Unit u : units) {
            if (u instanceof Attackable) {
                System.out.println(u);
            }
        }
    }
}
