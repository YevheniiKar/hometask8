import java.util.Scanner;

abstract class Shape {
    abstract String getName();
}

class Circle extends Shape {
    @Override
    String getName() {
        return "Circle";
    }
}

class Quad extends Shape {
    @Override
    String getName() {
        return "Quad";
    }
}

class Triangle extends Shape {
    @Override
    String getName() {
        return "Triangle";
    }
}

class Square extends Shape {
    @Override
    String getName() {
        return "Square";
    }
}

class Ellipse extends Shape {
    @Override
    String getName() {
        return "Ellipse";
    }
}

class Polygon extends Shape {
    @Override
    String getName() {
        return "Polygon";
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape;

        System.out.println("Choose a shape:");
        System.out.println("1. Circle");
        System.out.println("2. Quad");
        System.out.println("3. Triangle");
        System.out.println("4. Square");
        System.out.println("5. Ellipse");
        System.out.println("6. Polygon");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                shape = new Circle();
                break;
            case 2:
                shape = new Quad();
                break;
            case 3:
                shape = new Triangle();
                break;
            case 4:
                shape = new Square();
                break;
            case 5:
                shape = new Ellipse();
                break;
            case 6:
                shape = new Polygon();
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("Shape's name: " + shape.getName());
    }
}