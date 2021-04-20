package exceptions.testingInputs;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String q;
        do {
            System.out.println("Please input something (q when done)");
            q = sc.nextLine();
            System.out.println(q);;
        } while (!q.equalsIgnoreCase("q"));
        System.out.println("Done!");
    }
}
