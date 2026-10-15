public interface QueueInterface <E>{

    public void enqueue(E e) throws Exception;
    public E dequeue();
    public boolean isEmpty();
    public boolean isFull();
    public int size();

}