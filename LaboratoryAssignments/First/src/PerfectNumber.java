public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println(isPerfect(1));
        System.out.println(isPerfect(6));
        System.out.println(isPerfect(14));
        System.out.println(isPerfect(28));
    }

    static boolean isPerfect(long number) {
        boolean isPerf = true;
        long sum = 0;
        for (long i = 1; i < number; i++) {
            if (number % i == 0) {
                sum+= i;
            }
        }

        if (sum != number) {
            isPerf = false;
        }

        return isPerf;
    }
}
