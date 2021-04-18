package whatIsPrinted;

public class Main {
    public static void main(String[] args) {
        ExtendedClass ec = new ExtendedClass();
        System.out.println(ec.getMessage()); // M3 M4
        System.out.println(ec.getStaticMessage()); // M4
        BaseClass bc = ec;
        System.out.println(bc.getMessage()); // M3 M4
        System.out.println(bc.getStaticMessage()); // M2
    }
}
