class Parent {
    void show() {
        System.out.println("Parent class");
    }
}

class Child  extends Parent{
    @Override
    void show() {
        System.out.println("Child class");
    }
}
public class Q6 {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
    }
}
