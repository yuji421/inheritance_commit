class Animal {
    void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    void speak() {
        System.out.println("Woof!");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.speak();

        Animal d = new Dog();
        d.speak();
    }
}