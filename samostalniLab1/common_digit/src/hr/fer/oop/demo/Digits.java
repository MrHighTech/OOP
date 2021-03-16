package hr.fer.oop.demo;

public class Digits {
    public static void main(String[] args) {
        System.out.println(common_digit(45, 34));
    }

    static boolean common_digit(int twoDigitNum1, int twoDigitNum2) {
        if (twoDigitNum1 > 9 && twoDigitNum1 < 100 && twoDigitNum2 > 9 && twoDigitNum2 < 100) {
            if ((twoDigitNum1 % 10 == twoDigitNum2 % 10) || (twoDigitNum1 % 10 == twoDigitNum2 / 10) || (twoDigitNum1 / 10 == twoDigitNum2 / 10) || (twoDigitNum1 / 10 == twoDigitNum2 % 10)) {
                return true;
            }
        }
        return false;
    }
}
