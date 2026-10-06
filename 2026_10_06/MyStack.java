public class MyStack<E> implements StackInterface<E> {

    int size;
    int top;
    E[] elements;


    public MyStack() {
      this(10);
    }

     @SuppressWarnings("unchecked")
    public MyStack(int size) {
       this.size = size;
       elements =(E[]) new Object[size];
      top = -1;
    }

    @Override
    public void push(E e) throws StackOverflowException {
       if (isFull())
          throw new StackOverflowException("Can't push - Stack is full");

       elements[++top] = e;
    }

    @Override
    public E pop() {
       if (isEmpty())
          return null;

    return elements[top--];
  
    }

    @Override
    public E peek() {
      if (isEmpty())
          return null;

    return elements[top];

    }

    @Override
    public int top() {
       return top;
     }

    @Override
    public boolean isEmpty() {
     return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == size - 1;
 }

 public void print()  {
    if (isEmpty())
          System.out.println("Stack is empty");
    else {
        for (int i = 0; i <= top; i++)
            System.out.println(elements[i]);
    }
 }
    
}
