public class Demo {
    
    public static void main(String[] args)  {
        
        MyStack<Integer> stack = new MyStack<>(5);
        try{
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.pop();
        }
        catch (StackOverflowException ex) {
            System.out.println(ex.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

      for (Integer e : stack)
        System.out.println(e);
    }
}
