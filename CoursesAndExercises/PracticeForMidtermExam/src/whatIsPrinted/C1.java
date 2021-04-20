package whatIsPrinted;

public class C1 implements NumberProducer {
    public static int a = 0;
    public int b = 0;
    public String x;
    public C1(int b) {
        this.b = b;
        a++;
        x = a + " + " + b;
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "a="+a+", b="+b;
    }
    @Override
    public int getNumber() {
        return b;
    }
}
