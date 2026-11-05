import java.util.ArrayList;
import java.util.Comparator;

public class PQHeap<K, V> {
    
    ArrayList<Entry<K, V>> heap;
    Comparator<K> comp;

    public PQHeap(Comparator<K> comp) {
        this.comp = comp;
        heap = new ArrayList<>();
    }
     public PQHeap(int initialCapacity, Comparator<K> comp) {
        this.comp = comp;
        heap = new ArrayList<>(initialCapacity);
    }

    private void swap(int i, int j) {
       Entry<K, V> temp = heap.get(i);
       heap.set(i, heap.get(j));
       heap.set(j, temp);
    }
    public void insert(K key, V value) {
        Entry<K, V> newEntry = new PQEntry<>(key, value);
        heap.add(newEntry);
        int j = heap.size() -1;

        while (j > 0) {
              if (comp.compare(heap.get(j).getKey(),heap.get(parent(j)).getKey()) > 0) 
                break;
             swap(j, parent(j));
             j = parent(j);
             
        }
    }

    public int parent(int j) {
        return (j - 1) / 2;
    }
    public int left(int j) {
        return j * 2 + 1;
    }
    public int right(int j) {
        return j * 2 + 2;
    }

    
}
