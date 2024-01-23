package task.oop;

public class Circle extends Figure {

    String name;

    Circle(String name) {
        super(name);
        this.name = name;
    }

    static final double pi = 3.14;
    double radius=6;

    @Override
    public double square() {
        double value = pi * radius * radius;
        return value;


    }

    @Override
    public void lengthOfCircle() {
        double value = 2 * pi * radius;
        System.out.println(value);

    }

}

