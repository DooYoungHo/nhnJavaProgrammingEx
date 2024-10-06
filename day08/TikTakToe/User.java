import java.util.Scanner;

public class User extends Game {
    
    public int[] inputToNumberArray(Scanner sc) throws NumberFormatException {
        
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
            int[] coord = inputToNumberArray(scanner);

            if (Game.isSpotFilled(coord)) {
                System.out.println("The letters are already on the board");
                continue;
            }
            else {
                Game.spot.add(coord);
                break;
            }
        }
    };
}
