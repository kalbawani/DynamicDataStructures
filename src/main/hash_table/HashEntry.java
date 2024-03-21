package main.hash_table;

public class HashEntry <K,V> {
    private K key;
    private V value;

    public HashEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "HashEntry{" +
                key.toString() +
                ", " + value.toString() +
                '}';
    }
}
