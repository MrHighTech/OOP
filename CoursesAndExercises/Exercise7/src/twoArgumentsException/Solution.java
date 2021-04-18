package twoArgumentsException;

public class Solution {

    public static void main(String[] args) {
        if (args.length != 2) {
            throw new IllegalArgumentException("The program should take only two arguments");
        } else {
            System.out.println( args[0] + ' ' + args[1]);
        }
    }
}
