public class Demo {
    
    public static void main(String[] args) {
        
        MyStack<Integer> s = new MyStack<>(4);

        try {
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Poping " + s.pop());
        s.print();
    }
}
