package average;

import parameterization.KeyValueMapEntry;

public class AverageKey {

    public static <K extends Number, V> double calculateAverageKey(KeyValueMapEntry<K, V> ... mapEntries) {
        int count = 0;
        double sum = 0;

        for(KeyValueMapEntry<K, ?> kv : mapEntries) {
            K key = kv.getKey();
            sum += key.doubleValue();
            count++;
        }

        return sum / count;
    }

    public static void main(String[] args) {
        KeyValueMapEntry<Integer, String> real = new KeyValueMapEntry<>(5, "Real Madrid");
        KeyValueMapEntry<Integer, String> dinamo = new KeyValueMapEntry<>(3, "Dinamo");
        // KeyValueMapEntry<Integer, Boolean> fake = new KeyValueMapEntry<>(1, false);
        // KeyValueMapEntry<Integer, Double> fake2 = new KeyValueMapEntry<>(1, 99.00);
        System.out.println(calculateAverageKey(real, dinamo)); // , fake, fake2));
    }
}
