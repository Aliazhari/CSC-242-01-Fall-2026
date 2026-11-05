import java.util.Comparator;

public class Demo {
    
    public static void main(String[] args) {
        
       Comparator<Integer> comp =  ( a, b) ->   a - b;
    

        PQHeap<Integer, String> pq = new PQHeap<>(comp);

        pq.insert(50, "Bob");
    }
}
