public class Board {
    private static int[][] board = new int[3][3];

    private static void updateBoard() {
        for (int[] coord : Game.spot) {
            int x = coord[0];
            int y = coord[1];
            int player = Game.spot.indexOf(coord) % 2 == 0 ? 1 : 2; // 1: Com, 2: User
            board[x][y] = player;
        }
    }

    public static void printBoard() {

        updateBoard();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char symbol;
                if (board[i][j] == 1) {
                    symbol = 'X'; // Com
                } else if (board[i][j] == 2) {
                    symbol = 'O'; // User
                } else {
                    symbol = ' '; // 빈 칸
                }
                System.out.print(" " + symbol + " ");
                if (j < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("---+---+---");
            }
        }
        System.out.println();
    }
}
