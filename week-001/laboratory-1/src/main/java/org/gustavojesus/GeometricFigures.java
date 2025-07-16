package org.gustavojesus;

// Superclass
abstract class GeometricFigure {
    public abstract double area();
    public abstract double perimeter();
    public abstract void print();
}

// Triangle class
abstract class Triangle extends GeometricFigure {
    protected double base;
    protected double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
}

// Equilateral Triangle class
class EquilateralTriangle extends Triangle {
    private double side;

    public EquilateralTriangle(double side) {
        super(side, (Math.sqrt(3) / 2) * side); // height of the equilateral triangle
        this.side = side;
    }

    @Override
    public double area() {
        return (Math.sqrt(3) / 4) * side * side;
    }

    @Override
    public double perimeter() {
        return 3 * side;
    }

    @Override
    public void print() {
        System.out.printf("┌───────────────────────────────────────────┐\n");
        System.out.printf("│ Triângulo Equilátero                     \n");
        System.out.printf("│ Lado: %.2f                               \n", side);
        System.out.printf("│ Área: %.2f                               \n", area());
        System.out.printf("│ Perímetro: %.2f                          \n", perimeter());
        System.out.printf("└───────────────────────────────────────────┘\n");
    }
}

// Isosceles Triangle class
class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(double base, double height) {
        super(base, height);
    }

    @Override
    public double area() {
        return (base * height) / 2;
    }

    @Override
    public double perimeter() {
        double side = Math.sqrt((base / 2) * (base / 2) + height * height);
        return 2 * side + base;
    }

    @Override
    public void print() {
        System.out.printf("┌───────────────────────────────────────────┐\n");
        System.out.printf("│ Triângulo Isósceles                      \n");
        System.out.printf("│ Base: %.2f                                \n", base);
        System.out.printf("│ Altura: %.2f                              \n", height);
        System.out.printf("│ Área: %.2f                                \n", area());
        System.out.printf("│ Perímetro: %.2f                           \n", perimeter());
        System.out.printf("└───────────────────────────────────────────┘\n");
    }
}

// Scalene Triangle class
class ScaleneTriangle extends Triangle {
    private double side1;
    private double side2;
    private double side3;

    public ScaleneTriangle(double side1, double side2, double side3, double height) {
        super((side1 + side2 + side3) / 3, height); // average base for simplification
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public void print() {
        System.out.printf("┌───────────────────────────────────────────┐\n");
        System.out.printf("│ Triângulo Escaleno                       \n");
        System.out.printf("│ Lados: %.2f, %.2f, %.2f                   \n", side1, side2, side3);
        System.out.printf("│ Área: %.2f                                \n", area());
        System.out.printf("│ Perímetro: %.2f                           \n", perimeter());
        System.out.printf("└───────────────────────────────────────────┘\n");
    }
}

// Rectangle class
class Rectangle extends GeometricFigure {
    protected double base;
    protected double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return base * height;
    }

    @Override
    public double perimeter() {
        return 2 * (base + height);
    }

    @Override
    public void print() {
        System.out.printf("┌────────────────────────────────────────── ─┐\n");
        System.out.printf("│ Retângulo                                 \n");
        System.out.printf("│ Base: %.2f                                \n", base);
        System.out.printf("│ Altura: %.2f                              \n", height);
        System.out.printf("│ Área: %.2f                                \n", area());
        System.out.printf("│ Perímetro: %.2f                           \n", perimeter());
        System.out.printf("└───────────────────────────────────────────┘\n");
    }
}

// Square class
class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void print() {
        System.out.printf("┌───────────────────────────────────────────┐\n");
        System.out.printf("│ Quadrado                                  \n");
        System.out.printf("│ Lado: %.2f                                 \n", base);
        System.out.printf("│ Área: %.2f                                 \n", area());
        System.out.printf("│ Perímetro: %.2f                            \n", perimeter());
        System.out.printf("└───────────────────────────────────────────┘\n");
    }
}

// Circle class
class Circle extends GeometricFigure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void print() {
        System.out.printf("┌───────────────────────────────────────────┐\n");
        System.out.printf("│ Círculo                                   \n");
        System.out.printf("│ Raio: %.2f                                 \n", radius);
        System.out.printf("│ Área: %.2f                                 \n", area());
        System.out.printf("│ Perímetro: %.2f                            \n", perimeter());
        System.out.printf("└───────────────────────────────────────────┘\n");
    }
}

// Main class to test the implementations
public class GeometricFigures {
    public static void main(String[] args) {
        GeometricFigure equilateralTriangle = new EquilateralTriangle(5);
        equilateralTriangle.print();

        GeometricFigure isoscelesTriangle = new IsoscelesTriangle(4, 3);
        isoscelesTriangle.print();

        GeometricFigure scaleneTriangle = new ScaleneTriangle(3, 4, 5, 4);
        scaleneTriangle.print();

        GeometricFigure rectangle = new Rectangle(4, 6);
        rectangle.print();

        GeometricFigure square = new Square(4);
        square.print();

        GeometricFigure circle = new Circle(3);
        circle.print();
    }
}