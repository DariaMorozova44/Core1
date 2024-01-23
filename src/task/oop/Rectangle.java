package task.oop;

public class Rectangle extends Figure {
    String name;

    Rectangle(String name) {
        super(name);
        this.name = name;
    }

    double side1=1;
    double side2=2;

    @Override
    public double square() {
        double value = side1 * side2;
        return value;

    }

    @Override
    public void perimeter() {
        double value = (side1 + side2) * 2;
        System.out.println(value);
    }
}
