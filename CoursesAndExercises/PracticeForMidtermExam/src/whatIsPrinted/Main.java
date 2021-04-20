package whatIsPrinted;

public class Main {
    public static void main(String[] args) {
        C1 c1 = new C1(5); // redak 1
        System.out.println("----");
        C1 c2 = new C2(15, 17); // redak 3
        System.out.println("----");
        C1 c3 = new C3(25, 27, 37); // redak 5
        System.out.println("----");
        NumberProducer p = c1; // redak 7
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(p);
    }
}
