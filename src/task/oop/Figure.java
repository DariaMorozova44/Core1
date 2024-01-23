package task.oop;
// TODO: Создайте абстрактный класс "Фигура", в котором определены общие свойства и методы для всех геометрических фигур
//  (например, метод для расчета площади).
//  От него унаследуйте классы "Круг", "Прямоугольник" и "Треугольник", переопределив специфичные методы для каждой фигуры.

  public abstract class Figure {
    String name;
    Figure(String name){
      this.name = name;
    }
    public abstract double square();
    public void lengthOfCircle(){
      System.out.println("lengthOfCircle");
    }
    public void perimeter(){
      System.out.println("perimeter");
    }


}
