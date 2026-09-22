import java.util.Comparator;

public class Demo {
    
    public static void main(String[] args) {
        
        Student s1 = new Student("Bob", 19, 90);
        Student s2 = new Student("Alexander", 21, 80);

    //     if (s1.compareTo(s2) > 0)
    //         System.out.println(s1.getName() + " is greater than " + s2.getName());
    // else if (s1.compareTo(s2) < 0)
    //      System.out.println(s2.getName() + " is greater than " + s1.getName());
    //     else
    //          System.out.println(s1.getName() + " is equal to " + s2.getName());

    // class StudentComparator implements Comparator<Student> {

    // @Override
    // public int compare(Student o1, Student o2) {
     
    //     return o1.getName().compareTo(o2.getName());
    // }
    



    Comparator<Student> comp =  (o1, o2) -> {
     
        return o1.getName().compareTo(o2.getName());
     };

  


    if (comp.compare(s1, s2)  > 0)
        System.out.println(s1.getName() + " is greater than " + s2.getName());
    else if (comp.compare(s1, s2) < 0)
         System.out.println(s2.getName() + " is greater than " + s1.getName());
        else
             System.out.println(s1.getName() + " is equal to " + s2.getName());

    }
}
