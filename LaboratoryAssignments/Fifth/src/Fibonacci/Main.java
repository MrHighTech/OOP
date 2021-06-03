package Fibonacci;

public class Main {
    public static void main(String [] args) {
        FibonacciIterator fibNumbers = new FibonacciIterator(15);

        System.out.println("Fibonacci numbers up to n = 15");
        while (fibNumbers.hasNext()){
            System.out.println(fibNumbers.next());
        }

    }
}
