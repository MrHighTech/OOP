package Ranking;

import java.util.LinkedList;
import java.util.List;

public class Ladder {

    private List<String> rangList;

    public Ladder(String...players) {
        rangList = new LinkedList<>();
        join(players);
    }

    public void join(String...players) {
        for (String player : players) {
            if (!rangList.contains(player))
                rangList.add(player);
        }
    }

    public int count() {
        return rangList.size();
    }

    public Iterable<String> standings() {
        return rangList;
    }

    public void gameFinished(String winner, String looser) {
        int winnerIndex = rangList.indexOf(winner);
        int looserIndex = rangList.indexOf(looser);



        if (winnerIndex < looserIndex) {
            int move = (winnerIndex - looserIndex) / 2;
            if (move != 0) {
                rangList.remove(winnerIndex);
                rangList.add(winnerIndex - move, winner);
            }
        } else {
            int move = (winnerIndex - looserIndex) / 2;
            if (move != 0) {
                rangList.remove(winnerIndex);
                rangList.add(winnerIndex - move, winner);
            }
        }

        if (looserIndex + 1 != rangList.size()) {
            rangList.remove(looserIndex);
            rangList.add(looserIndex + 1, looser);
        }
    }

    public static void main(String[] args) {
        Ladder ladder = new Ladder("Franck", "Anne", "Margaretha", "Jack");

        ladder.join("Mark", "Franck");
        System.out.println(ladder);
        System.out.println(ladder.count());

        for (String player: ladder.standings()) {
            System.out.println(player);
        }

        System.out.println("\n---------\n");

        ladder.gameFinished("Jack", "Margaretha");
        for (String player: ladder.standings()) {
            System.out.println(player);
        }

        for (Pair<String> pair : LadderUtil.randomDraw(ladder)) {
            System.out.println(pair);
        }
    }

}
