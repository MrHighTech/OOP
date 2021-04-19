package parameterization;

import java.util.Map;

public class KeyValueMapEntry<K, V> implements Map.Entry<K, V> {
    private K key;
    private V value;

    public KeyValueMapEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }


    public V setValue(V value) {
        V old = this.value;
        this.value = value;
        return old;
    }

    @Override
    public String toString() {
        return  "key=" + key +
                ", value='" + value + '\'' +
                '}';
    }

    public static void main(String[] args) {
        KeyValueMapEntry<Integer, String> kv = new KeyValueMapEntry<>(5, "five");

        System.out.println(kv);

        kv.setValue("FIVE");
        System.out.println(kv);

        KeyValueMapEntry<String, Double> kd = new KeyValueMapEntry<>("Jura", 4.56);
        System.out.println(kd);

        double oldDobule = kd.setValue(4.6);
        System.out.println(oldDobule);
    }
}
