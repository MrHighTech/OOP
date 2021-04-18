package linkedList;

public class MyList {
    private MyListElement head;

    public int addLast(Object o) {
        if (head == null) {
            head = new MyListElement(o);
            return 0;
        }

        MyListElement current = head;
        int index = 0;
        while (current.getNext() != null) {
            index++;
            current = current.getNext();
        }

        current.setNext(new MyListElement(o));
        return ++index;
    }

    public int size() {
        if (head == null)
            return 0;
        int size = 0;
        MyListElement current = head;
        while (current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }

    public void removeAt(int index) {
        if (index == 0) {
            if (head != null) {
                head = head.getNext();
            }
            return;
        }

        MyListElement previous = head;
        MyListElement current = head.getNext();

        for (int i = 0; i < index - 1 && current != null; i++) {
            previous = current;
            current = current.getNext();
        }

        if (current != null && current.getNext() != null) {
            previous.setNext(current.getNext());
        }
    }

    public Object elementAt(int index) {
        MyListElement current = head;
        for (int i = 0; i < index && current != null; i++) {
            current = current.getNext();
        }
        return current == null ? null : current.getContent();
    }
}