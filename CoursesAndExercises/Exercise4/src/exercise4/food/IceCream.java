package exercise4.food;

public class IceCream extends Dessert {
    private String flavour;
    private String color;

    public IceCream(String name, double weight, int calories, String flavour, String color) {
        super(name, weight, calories);
        this.flavour = flavour;
        this.color = color;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavour='" + flavour + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public String getDessertType() {
        return "IceCream";
    }

    public static void main(String[] args) {
        IceCream iceCream = new IceCream("Nutella", 75.0, 100, "chocolate", "black");

        System.out.println(iceCream);
    }
}
