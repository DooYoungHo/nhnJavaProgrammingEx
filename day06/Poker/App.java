package Poker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {

        System.out.print("Set the number of Players : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int countPlayers = Integer.parseInt(br.readLine());
        Player[] players = setPlayers(countPlayers);
        
        System.out.println(countPlayers + " contestants have been chosen. Let's start the game.");
        Dealer.shuffle();
        System.out.println("shuffle...");
        Dealer.HandOutCards(players);
        System.out.println("The card payment to the players has been completed");
        List<Player> winners = Rank.getHighScorePlayer(players);

        showPlayersDeck(players);
        
        if (winners.size() == 1) {
            System.out.println("Winner - " + winners.get(0));
            return;
        }
        else {
            System.out.println("Draw");
            return;
        }

        //Rank.getFindHighCard(winners);
        // for (Player player : winners) {
        //     System.out.println(player);
        // }
    }

    static Player[] setPlayers(int count) {
        
        Player[] players = new Player[count];

        for (int i = 0; i < players.length; i++) {
            players[i] = new Player("Player " + i);
        }

        return players;
    }

    static void showPlayersDeck(Player[] players) {
        for (Player player : players) {
            System.out.print(player.getName() + " : ");
            System.out.println(player.getPlayerDeck());
        }
    }
}
