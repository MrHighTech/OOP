package hr.fer.oop.demo;

public class Samoglasnici {
    public static void main(String[] args) {
        System.out.println(brojSamoglasnika(args[0]));
    }

    public static int brojSamoglasnika(String str) {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'a' || str.toLowerCase().charAt(i) == 'e'
                    || str.toLowerCase().charAt(i) == 'i' || str.toLowerCase().charAt(i) == 'o'
                    || str.toLowerCase().charAt(i) == 'u') {
                num++;
            }
        }
        return num;
    }
}
