class Person {
    String name; 

    Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    String studentId; 

    Student(String name, String studentId) {
        super(name); 
        this.studentId = studentId;
    }

    void introduce() {
        System.out.println("My name is " + name + ", student ID is " + studentId);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Student s = new Student("Alice", "S12345");

        s.introduce();
    }
}
