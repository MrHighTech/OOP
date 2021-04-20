package whatIsPrinted;

public class C3 extends C2 {
    public int d = 0;
    public C3(int b, int c, int d) {
        super(b, c);
        this.d = d;
        a++;
        System.out.println(this);
    }
    @Override
    public String toString() {
        return super.toString() +
                ", d="+d;
    }
    @Override
    public int getNumber() {
        return d;
    }
}
