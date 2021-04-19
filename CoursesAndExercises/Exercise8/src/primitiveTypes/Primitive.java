package primitiveTypes;

public class Primitive {
    public static void main(String[] args) {
        int x = 5;
        Integer y = Integer.valueOf(x); // boxing
        int numberOnStack = y.intValue(); // unboxing
        int z = 20;
        Integer w = x + z; // autoboxing and unboxing
        y = null;
        // Integer q = Integer.valueOf(y); NullPointerException
    }
}
