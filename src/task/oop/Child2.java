package task.oop;
// TODO: Создайте класс Child2 и перегрузите методы.
//  1. Первый метод примет 3 числа и сложит их.
//  2. Второй метод примет 3 строки, внутри которых лежат числа, и вернет их сумму.
//  3. Третий метод примет две строки и вернет их конкатенацию.
//  4. Четвертый метод примет аргумент строку и выведет на экран "I am Child2" + переданная строка.
//  5. Пятый метод принимает 3 строки и возвращает их конкатенацию.

public class Child2 extends Parent {
    public int getOperation(int value1, int value2, int value3) {
        return value1 + value2 + value3;
    }

    public int getSum1(String string1, String string2, String string3) {
       return Integer.parseInt(string1) + Integer.parseInt(string2) + Integer.parseInt(string3);

    }

    public String getString(String string1, String string2) {
        return string1 + string2;
    }

    public void info(String string) {
        System.out.println("I am Child2" + string);

    }

    public String getSummString(String string1, String string2, String string3) {
        return string1 + string2 + string3;
    }
}
