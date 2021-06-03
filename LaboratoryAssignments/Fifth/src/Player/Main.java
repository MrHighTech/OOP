package Player;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        List<Player> players = new ArrayList();

        players.add(new Player("Caruana", 2820, 0.5));
        players.add(new Player("Carlsen", 2847, 1.5));
        players.add(new Player("Radjabov", 2765, 1.0));

        // Setting player standings with foreach
        players.forEach(new Consumer<Player>() {
            @Override
            public void accept(Player player) {
                player.setStanding(1);
                players.forEach(new Consumer<Player>() {

                    @Override
                    public void accept(Player secondPlayer) {
                        player.setStanding(secondPlayer.getPoints() > player.getPoints() ? player.getStanding() + 1 : player.getStanding());
                    }

                });
            }

        });

        players.forEach(p -> System.out.println(p.getStanding()));


    }

}
