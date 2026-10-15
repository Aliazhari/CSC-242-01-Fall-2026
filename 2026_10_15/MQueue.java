public class MQueue <E> implements QueueInterface<E> {

int size;
E[] queue;
int first, last;
int capacity;



    public MQueue() {
      this(10);
}

    @SuppressWarnings("unchecked")
    public MQueue(int capacity) {
      size = 0;
      this.capacity = capacity;
      first = last = -1;
      queue =  (E[]) new Object[capacity];
}

    @Override
    public void enqueue(E e) throws Exception {
    
    if (isFull()) 
            throw new Exception("Queue is full");
    
        last = (last + 1) % capacity;
        queue[last ] = e;
        if (isEmpty()) 
            first = last;
        size++;
     
    }

    @Override
    public E dequeue() {
      if (isEmpty())
        return null;

    E temp = queue[first];
    if (size == 1) 
        first = last = -1;
    else 
        first = (first + 1) % capacity;
    size--;
    return temp;
    }

    @Override
    public boolean isEmpty() {
     return size == 0;
     }

    @Override
    public boolean isFull() {
     return (last + 1) % capacity == first;}

    @Override
    public int size() {
    return size;
 }
    
}
