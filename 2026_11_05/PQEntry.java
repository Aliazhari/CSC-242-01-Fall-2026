public class PQEntry<K, V> implements Entry<K, V> {

    K key;
    V value;

    public PQEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }
    @Override
    public K getKey() {
       return key;
    }

    @Override
    public V getValue() {
       
    return value;
}
    
}
