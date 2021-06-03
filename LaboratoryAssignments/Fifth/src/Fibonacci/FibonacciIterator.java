package Fibonacci;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class FibonacciIterator extends IllegalArgumentException implements Iterator<Integer> {
    private int firstNum = 0;
    private int secondNum = 1;
    private int count = 0;
    private final int N;

    public FibonacciIterator(int n) {
        if (n < 0) throw new IllegalArgumentException();
        N = n;
    }



    @Override
    public boolean hasNext() {
        return count < N;
    }

    @Override
    public Integer next() {
        if (hasNext()) {
            int current = firstNum;
            firstNum = secondNum;
            secondNum = firstNum + current;
            count++;
            return current;
        } else {
            throw new NoSuchElementException();
        }
    }
}


