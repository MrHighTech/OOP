package ImmutableContainer;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ImmutableContainerCTask implements Iterable<Integer>{
    private Integer[] numbers;

    public ImmutableContainerCTask(Integer... num) {
        numbers = new Integer[num.length];
        for(int i = 0; i < num.length; i++)
            numbers[i] = num[i];
    }

    public Iterator<Integer> iterator() {
        class LocalIterator implements Iterator<Integer> {
            private int index;


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

        return new LocalIterator();
    }




    public static void main(String[] args) {
        ImmutableContainerCTask container = new ImmutableContainerCTask(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        for(Integer i : container) {
            System.out.println(i);
        }
    }
}