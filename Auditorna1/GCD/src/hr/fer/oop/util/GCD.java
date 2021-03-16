package hr.fer.oop.util;

public class GCD {
    public static int greatestCommonDivisor(int firstNum, int secondNum) {
        int maxCommonDivisor = 1;

        for (int i = 1; i <= Math.min(firstNum, secondNum); i++) {
            if (firstNum % i == 0 && secondNum % i == 0) {
                maxCommonDivisor = i;
            }
        }
        return maxCommonDivisor;
    }
}
