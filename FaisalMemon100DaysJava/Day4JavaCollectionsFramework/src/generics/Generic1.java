package generics;

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void print() {
        System.out.println("Key: " + key + ", Value: " + value);
    }
}

public class Generic1 {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("Age", 25);
        p1.print(); // Key: Age, Value: 25




    }
}
