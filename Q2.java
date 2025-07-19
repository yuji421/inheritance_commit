class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}

class Manager extends Employee {
    void work() {
        super.work();
        System.out.println("Manager is managing");
    }
}

public class Q2 {
    public static void main(String[] args) {
        Employee e = new Manager();
        e.work();
    }
}
