package Player;

import java.util.Objects;

class Player {
    private String name;
    private int rating;
    private double points;
    private int standing;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public int getStanding() {
        return standing;
    }

    public void setStanding(int standing) {
        this.standing = standing;
    }

    public Player(String name, int rating, double points) {
        this.name = name;
        this.rating = rating;
        this.points = points;
        this.standing = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return rating == player.rating && Double.compare(player.points, points) == 0 && standing == player.standing && Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rating, points, standing);
    }
}