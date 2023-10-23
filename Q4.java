class Shape {
    public double area() {
        return 0;
    }
}

class Square extends Shape {
    private double length;

    public void init(double length) {
        this.length = length;
    }

    public double area() {
        return length * length;

    }
}

public class Q4 {
    public static void main(String[] args) {

        Shape shape = new Shape();
        System.out.println("Area of Shape: " + shape.area());

        Square square = new Square();
        square.init(5.0);
        System.out.println("Area of Square: " + square.area());
    }
}
