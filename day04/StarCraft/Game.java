package StarCraft;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {

    private static List<Unit> playerUnits = new ArrayList<>();
    private static List<Unit> computerUnits = new ArrayList<>();
    
    public List<Unit> choiceBrood(Brood brood) throws Exception {
        
        switch (brood) {
            case Terran:
                return generateUnits(brood, 5);
            case Protoss:
                return generateUnits(brood, 4);
            case Zerg:
                return generateUnits(brood, 8);
            default:
                throw new Exception("Please choose the right race.");
        }
    }

    private List<Unit> generateUnits(Brood brood, int numOfUnits) {
        List<Unit> lists = new ArrayList<>();
        for (int i = 0; i < numOfUnits; i++) {
            lists.add(generateRandomUnit(brood));
        }

        return lists;
    }

    private Unit generateRandomUnit(Brood brood) {
        Random rand = new Random();
        switch (brood) {
            case Terran:
                switch (rand.nextInt(5)) {
                    case 0: return new Marine();
                    case 1: return new Tank();
                    case 2: return new Goliath();
                    case 3: return new Wraith();
                    case 4: return new Valkyrie();
                }
            case Protoss:
                switch (rand.nextInt(5)) {
                    case 0: return new Zealot();
                    case 1: return new Dragoon();
                    case 2: return new HighTempler();
                    case 3: return new Scout();
                    case 4: return new Corsair();
                }
            case Zerg:
                switch (rand.nextInt(5)) {
                    case 0: return new Zergling();
                    case 1: return new Hydralisk();
                    case 2: return new Ultralisk();
                    case 3: return new Mutalisk();
                    case 4: return new Guardian();
                }
        }
        return null;
    }

    private void printUnits(List<Unit> units) {
        for (int i = 0; i < units.size(); i++) {
            Unit unit = units.get(i);
            System.out.println(i + ". " + unit + (" (현재 방어력 : " + unit.getDefence() + ")"));
        }
    }

    private void checkDeathUnits(List<Unit> units) {
        for (int i = 0; i < units.size(); i++) {
            if (units.get(i).getDefence() <= 0) {
                units.remove(i);
            }
        }
    }

    public void runStarCraft() {
        Random rand = new Random();
        Brood[] selects = Brood.values();
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int num2 = 0;
        try {
            System.out.println("Play Game !");
            num = rand.nextInt(3);
            computerUnits = choiceBrood(selects[num]);
            System.out.print("Choice your Brood (0. Terran, 1. Zerg, 2. Protoss) : ");
            num2 = scanner.nextInt();
            playerUnits = choiceBrood(selects[num2]);
            scanner.nextLine();
        }
        catch (InputMismatchException e) {
            System.out.println("Please enter a number");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please enter a number");
        }
        catch (Exception e ) {
            e.printStackTrace();
        }

        while (true) {
            try {
                checkDeathUnits(computerUnits);
                checkDeathUnits(playerUnits);

                System.out.println("적군 : " + selects[num]);
                printUnits(computerUnits);
                System.out.println();
                System.out.println("아군 : " + selects[num2]);
                printUnits(playerUnits);

                if (computerUnits.size() == 0 && playerUnits.size() >= 1) {
                    System.out.println("Player Win !");
                    scanner.close();
                    break;
                }

                if (playerUnits.size() == 0 && computerUnits.size() >= 1) {
                    System.out.println("Computer Win !");
                    scanner.close();
                    break;
                }
                
                System.out.print("공격을 수행할 아군 유닛과 공격할 적군 유닛을 선택하세요 (ex. 0 0) : ");
                String[] attacks = scanner.nextLine().split(" ");
                int playerUnitIndex = Integer.parseInt(attacks[0]);
                int computerUnitIndex = Integer.parseInt(attacks[1]);

                if (playerUnitIndex < 0 || playerUnitIndex >= playerUnits.size() || computerUnitIndex < 0 || computerUnitIndex >= computerUnits.size()) {
                    System.out.println("유효하지 않은 선택입니다.");
                    continue;
                }

                Unit playerUnit = playerUnits.get(playerUnitIndex);
                Unit computerUnit = computerUnits.get(computerUnitIndex);

                if (computerUnit.isAlive()) {
                    playerUnit.target(computerUnit);
                }

                computerUnitIndex = rand.nextInt(computerUnits.size());
                playerUnitIndex = rand.nextInt(playerUnits.size());

                computerUnit = computerUnits.get(computerUnitIndex);
                playerUnit = playerUnits.get(playerUnitIndex);

                if (playerUnit.isAlive() && computerUnit.isAlive()) {
                    computerUnit.target(playerUnit);
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }

            

        }
    }
}