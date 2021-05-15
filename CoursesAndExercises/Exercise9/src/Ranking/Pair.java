package Ranking;

public class Pair<E> {
    private E player1, player2;

    public Pair(E player1, E player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public E getPlayer1() {
        return player1;
    }

    public void setPlayer1(E player1) {
        this.player1 = player1;
    }

    public E getPlayer2() {
        return player2;
    }

    public void setPlayer2(E player2) {
        this.player2 = player2;
    }
}
