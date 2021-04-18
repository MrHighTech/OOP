package tree;

public class Main {
    public static void main(String[] args) {
        BST tree = new BST();

        for(var s : args) {
            int i = Integer.parseInt(s);
            tree.add(i);
        }

        System.out.printf("Tree contains %d elements%n", tree.size());
        tree.print();
    }
}
