package ImmutableContainer;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ImmutableContainerBTask implements Iterable<Integer>{
    private Integer[] numbers;

    public ImmutableContainerBTask(Integer... num) {
        numbers = new Integer[num.length];
        for(int i = 0; i < num.length; i++)
            numbers[i] = num[i];
    }

    public Iterator<Integer> iterator() {
        return new NestedIterator();
    }

    private class NestedIterator implements Iterator<Integer> {
        private int index = numbers.length - 1;

        @Override
        public boolean hasNext() {
            return index >= 0;
        }

        @Override
        public Integer next() {
            if (!hasNext())
                throw new NoSuchElementException();

            Integer result = numbers[index];
            index -= 2;
            return result;
        }
    }


    public static void main(String[] args) {
        ImmutableContainerBTask container = new ImmutableContainerBTask(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        for(Integer i : container) {
            System.out.println(i);
        }
    }
}