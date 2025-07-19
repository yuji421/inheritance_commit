class Animal {
    void sound() {
        System.out.println("Animal Sound");
    };
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow!");
    }
}

public class Q7 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();

        for(Animal a : animals) {
            a.sound();

            if(a instanceof Dog) {
                System.out.println("This is Dog");
            } else if(a instanceof Cat) {
                System.out.println("This is Cat");
            }
        }
    }
}
