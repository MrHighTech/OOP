package whatIsPrinted;

public class C2 extends C1 {
    public int c = 0;
    public C2(int b, int c) {
        super(b);
        this.c = c;
        a++;
        System.out.println(this);
    }
    @Override
    public String toString() {
        return super.toString() +
                ", c="+c;
    }
}

