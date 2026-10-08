import java.util.Iterator;

public class MyStack<E> implements StackInterface<E>, Iterable<E> {

    int size;
    E[] elements;
    int top;

    public MyStack() {
        this(10);
    }

    @SuppressWarnings("unchecked")
    public MyStack(int size) {
        this.size = size;
        elements = (E[]) new Object[size];
        top = -1;
    }

    @Override
    public void push(E e) throws StackOverflowException {

        if (isFull())
              throw new StackOverflowException("Can't push - Stack is full");

       elements[++top] = e;

    }

    @Override
    public E pop() throws StackOverflowException {

        if (isEmpty())
            throw new StackOverflowException("Can't pop - Stack is Empty");

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


     @Override
    public Iterator<E> iterator() {
      return new Iterator<>() {
         int current = -1;

        @Override
        public boolean hasNext() {
        return current != top;
     }

        @Override
        public E next() {
        return elements[++current];
      }

      };
      }

// Should NEVER print in the data structures
    // public void print() {

   
    //     if (isEmpty())
    //         System.out.println("Stack is empty");
    //     else {
    //         System.out.println("Stack is");
    //         for (int i = top ; i >= 0; i--){
    //             System.out.println(elements[i]);

    //         }
    //     }
    // }

}
