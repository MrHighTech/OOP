package Ranking;

import java.util.*;

public class LadderUtil {
    public static Iterable<Pair<String>> randomDraw(Ladder ladder) {
        List<Pair<String>> pairs = new LinkedList<>();
        List<String> players = new LinkedList<>();

        for (String player : ladder.standings())
            players.add(player);

        Collections.shuffle(players);

        for (int i = 0; i < players.size(); i++) {
            if (i + 1 == players.size()) {
                pairs.add(new Pair(players.get(i), "FREE"));
            } else {
                pairs.add(new Pair(players.get(i), players.get(i + 1)));
            }
        }



        return pairs;
    }
}
