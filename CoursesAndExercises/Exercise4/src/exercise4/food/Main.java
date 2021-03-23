package exercise4.food;

public class Main {

    public static void main(String[] args) {
        Cake cake = new Cake("Čupavci", 50.0, 250, true, "regular");

        System.out.println(cake);
        System.out.println(cake.getDessertType());

        IceCream iceCream = new IceCream("Nutella", 75.0, 100, "chocolate", "black");

        System.out.println(iceCream);
        System.out.println(iceCream.getDessertType());
    }
}
