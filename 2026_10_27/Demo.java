import java.util.Comparator;

public class Demo {
    
    public static void main(String[] args) {
        
        Student<Integer> s1 = new Student<>("Bob", 19);
        Student<Integer> s2 = new Student<>("A;", 20);

        s1.addGrade(90);
        s1.addGrade(91);
        s1.addGrade(92);
        s1.addGrade(93);
        s1.addGrade(94);
        for (int g : s1) {

            System.out.println(g);

        }


        Comparator<Student<Integer>> cmp =  ( o1, o2)  -> o1.getAge() - o2.getAge(); 
            
     

  


        if (cmp.compare(s1, s2) > 0) {
          System.out.println("S1 is > s2");
        }
    }
}
