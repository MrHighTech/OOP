package parameterization;

public class KeyValueParametrized<K,V> {
    private K key;
    private V value;

    public KeyValueParametrized(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }


    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "KeyValueParametrized{" +
                "key=" + key +
                ", value='" + value + '\'' +
                '}';
    }

    public static void main(String[] args) {
        KeyValueParametrized<Integer, String> kv = new KeyValueParametrized<>(5, "five");

        System.out.println(kv);

        kv.setValue("FIVE");
        System.out.println(kv);

        KeyValueParametrized<String, Double> kd = new KeyValueParametrized<>("Jura", 4.56);
        System.out.println(kd);

        kd.setValue(4.6);
        System.out.println(kd);
    }
}
