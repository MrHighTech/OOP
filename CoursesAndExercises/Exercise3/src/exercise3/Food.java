package exercise3;

public class Food {

    private FoodType type;
    private int weight;

    public Food(FoodType type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    public FoodType getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return String.format("%s, w = %dg", type.toString(), weight);
    }

    public double getProtein() {
        return type.getProtein() * weight / 100.0;
    }

    public double getCarbs() {
        return type.getCarbs() * weight / 100.0;
    }

    public double getFat() {
        return type.getFat() * weight / 100.0;
    }

    public String toStringInGrams() {
        return String.format("%s: proteins = %.1fg, carbs = %.1fg, fats = %.1fg, weight = %dg", type.getName(), getProtein(), getCarbs(), getFat(), weight);
    }
}
