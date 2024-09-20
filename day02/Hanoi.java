public class Hanoi {
    public static void main(String[] args) {
        HanoiTower(3, 1, 2, 3);
    }

    static void HanoiTower(int n, int start, int to, int end) {
        if (n == 0) {
            return;
        }
        HanoiTower(n - 1, start, end, to);
        System.out.printf("%d번째 원판이 %d번에서 %d번으로 이동하였습니다", n, start, end);
        System.out.println();
        HanoiTower(n - 1, to, start, end);
    }
}
