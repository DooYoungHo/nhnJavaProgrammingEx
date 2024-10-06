import java.util.Arrays;
import java.util.Stack;
import java.util.Scanner;

public class JBDJ07012_Tictactoe {

    public static void main(String[] args) {

        Com com = new Com();
        User user = new User();

        while (true) {
            
            com.turn();
            Board.printBoard();
            if(Game.checkWinner()) {
                if (Game.spot.size() >= 9)
                    break;

                System.out.println("Computer Win!");
                break;
            }

            user.turn();
            Board.printBoard();
            if (Game.checkWinner()) {
                System.out.println("You Win!");
                break;
            }
        }
    }
}


abstract class Game {
    
    static Stack<int[]> spot = new Stack<>();

    public abstract void turn();

    public static boolean checkWinner() {
        
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
                board[x][y] = (i % 2 ==0) ? 1 : 2;
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

        for (int i = 0; i < 3; i++) {
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }

        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[2][0] == player && board[1][1] == player && board[0][2] == player) {
            return true;
        }

        return false;
    }

    protected static boolean isPositionTaken(int[] coord) {

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




class Com extends Game {

    public int[] makeRandomCoord() {
        
        int[] randomCoord = new int[2];

        while (true) {

            for (int i = 0; i < 2; i++) {

                double pseudoRandom = Math.random() * 3;
                int convertInt = (int)pseudoRandom;
    
                randomCoord[i] = convertInt;
            }

            if (Game.isPositionTaken(randomCoord)) {
                continue;
            }
            else {
                break;
            }
        }
        return randomCoord;
    }

    @Override
    public void turn() {

        Game.spot.add(makeRandomCoord());

        
    };
}



class User extends Game {
    
    private int[] inputToNumberArray(Scanner sc) throws NumberFormatException {
        
        int[] coord;

        System.out.print("Enter (x y) : ");
        String input = sc.nextLine();
        String[] inputSplit = input.split(" ");
        coord = new int[inputSplit.length];

        for (int i = 0; i < inputSplit.length; i++) {
            coord[i] = Integer.parseInt(inputSplit[i]);
        }

        return coord;
    };

    @Override
    public void turn() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                int[] coord = inputToNumberArray(scanner);

                if (Game.isPositionTaken(coord)) {
                    System.out.println("The letters are already on the board");
                    continue;
                }
                else {
                    Game.spot.add(coord);
                    break;
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Please enter a valid value");
                continue;
            }
        }
    };
}



class Board {

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

        char symbol;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 1) {
                    symbol = 'X'; // Com
                }
                else if (board[i][j] == 2) {
                    symbol = 'O'; // User
                }
                else {
                    symbol = ' ';
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