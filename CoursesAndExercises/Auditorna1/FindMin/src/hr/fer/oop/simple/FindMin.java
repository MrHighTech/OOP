package hr.fer.oop.simple;

public class FindMin {
    public static void main(String[] args) {
        if (args.length > 1) {
            int min = Integer.parseInt(args[0]);
            for (int i = 1; i < args.length; i++) {
                int current = Integer.parseInt(args[i]);
                if (current < min) {
                    min = current;
                }
            }
            System.out.println("The smallest number is: " + min);
        } else {
            System.out.println("No arguments recieved!");
        }

    }
}
