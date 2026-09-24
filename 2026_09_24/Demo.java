public class Demo {
    
    public static void main(String[] args) {
        
        MyArrayList<Integer> arrs = new MyArrayList<>(5);

        arrs.add(10);
         arrs.add(20);
          arrs.add(30);
           arrs.add(40);
            arrs.add(50);
            System.out.println("Current capacity is " + arrs.getCapacity());
             arrs.add(60);
             System.out.println("New capacity is now: " + arrs.getCapacity());

             System.out.println("The list is");
             arrs.print();
    }
}
