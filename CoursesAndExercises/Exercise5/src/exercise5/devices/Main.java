package exercise5.devices;

public class Main {
    public static void main(String[] args) {
        // Computer computer = new Computer("Mac pro", "Apple", "MacOS");
        Desktop desktop = new Desktop("Optiplex", "Dell", "Windows 10", 63.45);
        Laptop laptop = new Laptop("Yoga", "Lenovo", "Arch Linux", 55, 0.98);

        // System.out.println(computer);
        System.out.println(desktop);
        System.out.println(desktop.getComputerType());
        System.out.println(desktop.calculatePortabilityScore());

        System.out.println("\n#############################################\n");
        System.out.println(laptop);
        System.out.println(laptop.getComputerType());
        System.out.println(laptop.calculatePortabilityScore());

        Computer n = new Netbook("Ideapad S12", "Lenovo", "Windows", 50, 1.55);
        System.out.println(n);
        System.out.println(n.getComputerType());
        System.out.println(n.calculatePortabilityScore());
        Laptop l = (Laptop) n;
        System.out.println(l.calculatePortabilityScore());

        Mp3Player player = new Mp3Player("IPod", "Apple", 10, 4);
        System.out.println(player);
    }
}
