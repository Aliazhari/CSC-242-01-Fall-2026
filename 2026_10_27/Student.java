import java.util.Iterator;

class Student <T> implements Iterable<T> {

    private String name;
    private int age;
    private T grades[];
    int size;

    @SuppressWarnings("unchecked")
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        grades = (T[]) new Object[10];
        size = 0;
    }


    public void addGrade(T grade) {
        grades[size++] = grade;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }


    // ******************** Class It

  // **************************** */

    @Override
    public Iterator<T> iterator() {
       return new Iterator<>(){

      int cursor = 0;
    @Override
    public boolean hasNext() {
      return cursor < size;
    }

    @Override
    public T next() {
     return grades[cursor++];
    }

       }; 
    
    }

    
}