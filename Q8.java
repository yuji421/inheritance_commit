import java.util.ArrayList;
import java.util.List;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void introduce() {
        System.out.println("I am a person. My name is " + name);
    }
}

class Teacher extends Person {
    Teacher(String name) {
        super(name);
    }

    @Override
    void introduce() {
        System.out.println("I am a teacher. My name is " + name);
    }
}

class Student extends Person {
    Student(String name) {
        super(name);
    }

    @Override
    void introduce() {
        System.out.println("I am a student. My name is " + name);
    }
}

public class Q8 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Teacher("Alice"));
        people.add(new Student("Bob"));

        for (Person p : people) {
            p.introduce();
        }
    }
}

