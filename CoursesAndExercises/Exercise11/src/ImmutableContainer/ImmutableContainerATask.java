package ImmutableContainer;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ImmutableContainerATask implements Iterable<Integer>{
    private Integer[] numbers;

    public ImmutableContainerATask(Integer... num) {
        numbers = new Integer[num.length];
        for(int i = 0; i < num.length; i++)
            numbers[i] = num[i];
    }

    public Iterator<Integer> iterator() {
        return new StaticNestedIterator(this);
    }

    static class StaticNestedIterator implements Iterator<Integer> {
        private int index;
        private ImmutableContainerATask container;

        public StaticNestedIterator(ImmutableContainerATask container) {
            this.container = container;
            index = container.numbers.length - 1;
        }

        @Override
        public boolean hasNext() {
            return index >= 0;
        }

        @Override
        public Integer next() {
            if (!hasNext())
                throw new NoSuchElementException();

            Integer result = container.numbers[index];
            index -= 2;
            return result;
        }
    }


    public static void main(String[] args) {
        ImmutableContainerATask container = new ImmutableContainerATask(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        for(Integer i : container) {
            System.out.println(i);
        }
    }
}