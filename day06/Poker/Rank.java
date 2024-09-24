package Poker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum Rank {
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13),
    ACE(1, 14);

    private final int[] values;

    Rank(int... value) {
        this.values = value;
    }

    public int[] getValues() {
        return values;
    }

    private static int getPair(List<Card> deck) {

        Map<Integer, Integer> map = new HashMap<>();

        for (Card card : deck) {
            if (map.containsKey(card.getCardNo().ordinal())) {
                map.put(card.getCardNo().ordinal(), map.get(card.getCardNo().ordinal()) + 1);
            }
            else {
                map.put(card.getCardNo().ordinal(), +1);
            }
        }

        int pair = 0;

        if (map.size() <= 3) {
            for (int value : map.keySet()) {
                int val = map.get(value);
                pair = Math.max(val, pair);
            }
            return (pair == 3) ? 3 : (pair == 2) ? 2 : 0;
        }
        else {
            for (int value : map.keySet()) {
                int val = map.get(value);
                pair = Math.max(val, pair);
            }
            return (pair >= 2) ? 1 : 0;
        }
    }

    public static ArrayList<Player> getHighScorePlayer(Player[] players) {

        ArrayList<Player> highPlayers = new ArrayList<>();
        int highRank = 0;

        for (Player player : players) {
             int p = getPair(player.getPlayerDeck());

             if (p > highRank) {
                highPlayers.clear();
                highPlayers.add(player);
                highRank = p;
             }

             else if (p == highRank) {
                highPlayers.add(player);
             }
        }

        return highPlayers;
    }

    public static void getFindHighCard(List<Player> players) {
        
        for (Player player : players) {
            List<Card> deck = player.getPlayerDeck();
            Collections.sort(deck);
            
            Map<Rank, List<Card>> rankGroups = new HashMap<>();

            for (Card card : deck) {
                rankGroups.putIfAbsent(card.getCardNo(), new ArrayList<>());
                rankGroups.get(card.getCardNo()).add(card);
            }
        }
    }

}