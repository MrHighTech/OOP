package firstTask;

public class SimpleStack<T> {
    private int maxSize;
    private int numberOfElements;
    private T[] stack;

    @SuppressWarnings("unchecked")
    public SimpleStack(int maxSize) {
        if (maxSize < 1) {
            throw new IllegalArgumentException();
        }
        this.maxSize = maxSize;
        this.stack = (T[]) new Object[maxSize];
        this.numberOfElements = 0;
    }

    public void push(T element) {
        if (numberOfElements >= maxSize) {
            throw new RuntimeException();
        }

        stack[numberOfElements++] = element;
    }

    public T pop() {
        if (numberOfElements == 0) {
            throw new NullPointerException();
        }

        T temp = stack[numberOfElements - 1];
        stack[--numberOfElements] = null;
        return temp;
    }

    public boolean isEmpty() {
        if (numberOfElements == 0) return true;
        return false;
    }

    public boolean isFull() {
        if (numberOfElements == maxSize) return true;
        return false;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }

    public static void main(String[] args) {
        SimpleStack<Integer> s = new SimpleStack<Integer>(4);
        int j = 0;
        while(!s.isFull()) s.push(j++);
        while(!s.isEmpty()) System.out.print(s.pop());
    }
}
