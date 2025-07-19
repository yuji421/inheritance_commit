import java.util.Scanner;

abstract class Shape {
    abstract double area();
}

class Rectangle extends Shape {
    private double width;
    private double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return (base * height) / 2;
    }
}

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("図形の種類を入力 (rectangle/circle/triangle): ");
        String shapeType = sc.next().toLowerCase();

        Shape shape = null;

        switch (shapeType) {
            case "rectangle":
                System.out.print("幅と高さを入力: ");
                double w = sc.nextDouble();
                double h = sc.nextDouble();
                shape = new Rectangle(w, h);
                break;

            case "circle":
                System.out.print("半径を入力: ");
                double r = sc.nextDouble();
                shape = new Circle(r);
                break;

            case "triangle":
                System.out.print("底辺と高さを入力: ");
                double b = sc.nextDouble();
                double ht = sc.nextDouble();
                shape = new Triangle(b, ht);
                break;

            default:
                System.out.println("不正な図形の種類です。");
                System.exit(0);
        }

        System.out.printf("Area: %.2f\n", shape.area());

        sc.close();
    }
}

