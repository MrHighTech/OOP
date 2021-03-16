package exercise3;

public class FoodType {
    private static int counter = 0;
    private String name;
    private int protein;
    private int carbs;
    private int fat;

    public FoodType(String name, int protein, int carbs, int fat) {
        FoodType.counter++;
        this.name = name;
        this.protein = protein;
        this.carbs = carbs;
        this.fat = fat;
    }

    public String getName() {
        return name;
    }

    public int getProtein() {
        return protein;
    }

    public int getCarbs() {
        return carbs;
    }

    public int getFat() {
        return fat;
    }

    public String toString() {
        return String.format("%s: proteins = %d%%, carbs = %d%%, fats = %d%%", name, protein, carbs, fat);
    }

    public static int getNumberOfCreatedInstances() {
        return counter;
    }

    public static void main(String[] args) {
        FoodType type = new FoodType("banana", 4, 93, 3);
        Food food = new Food(type, 110);

        System.out.println(food);
    }
}
