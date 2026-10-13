public class Demo {
    
    public static void main(String[] args) {
        
        MQueue<Integer> q = new MQueue<>();

        q.enqueue(10);
        q.enqueue(20);
         q.enqueue(30);
        q.enqueue(40);
         q.enqueue(50);
        q.enqueue(60);
        System.out.println("Dequeing " + q.dequeue());
        System.out.println("The size of the queue is " +q.size());

        for (Integer i : q)
            System.out.println(i);


        
    }
}
