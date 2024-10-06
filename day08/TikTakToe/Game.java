import java.util.Arrays;
import java.util.Stack;

public abstract class Game {
    
    static Stack<int[]> spot = new Stack<>();

    public abstract void turn();

    public static boolean checkWinner(Game player) {
        
        if (spot.size() >= 9) {
            System.out.println("draw...!");
            return true;
        }
        
        if (spot.size() >= 5) {

            int[][] board = new int[3][3];
            for (int i = 0; i < spot.size(); i++) {
                int[] move = spot.get(i);
                int x = move[0];
                int y = move[1];

                // Com: 1, User: 2
                board[x][y] = (player instanceof Com && i % 2 ==0) ? 1 : 2;
            }

            if (isWinner(board, 1))
                return true;
            else if (isWinner(board, 2))
                return true;
        }

        return false;
    };

    private static boolean isWinner(int[][] board, int player) {

        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }

        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }

        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }

    public static boolean isSpotFilled(int[] coord) {

        if (spot.isEmpty()) {
            return false;
        }

        for (int[] spotCoord : spot) {
            if (Arrays.equals(spotCoord, coord)) {
                return true;
            }
        }

        return false;
    };
} 