package linkedList;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyList();

        System.out.println("Added at index " + list.addLast("first"));
        System.out.println("Added at index " + list.addLast("second"));
        System.out.println("Added at index " + list.addLast("third"));

        System.out.println(list.size());
        list.removeAt(1);
        System.out.println(list.elementAt(1));
        System.out.println(list.size());

        list.addLast("fourth");
        System.out.println(list.elementAt(2));
    }
}
