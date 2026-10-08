public interface StackInterface <E> {
  public void push(E e) throws StackOverflowException; 
  public E pop() throws StackOverflowException;
  public E  peek();
  public int top();
  public boolean isEmpty();
  public boolean isFull();
}