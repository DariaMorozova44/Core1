package task.oop;

public class Triangle extends Figure{
    String name;
    Triangle(String name) {
        super(name);
        this.name=name;
    }
    double side1=3;
    double side2=4;
    double side3=5;

    @Override
    public double square() {
        double value = (side1 + side2 + side3)/2;
        return Math.sqrt(value*(value-side1)*(value-side2)*(value-side3));
    }

    @Override
    public void perimeter() {
        double value = side1 + side2 + side3;
        System.out.println(value);
    }
}
