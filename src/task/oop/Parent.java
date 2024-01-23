package task.oop;
// TODO: Создайте класс Parent(Родитель) и создайте для него 5 методов.
//  1. Метод, принимающий 2 числа и возвращающий их сумму.
//  2. Метод, принимающий строку, в которой передано число, и число, а возвращающий сумму в виде числа.
//  3. Метод, принимающий строку и возвращающий ее.
//  4. Метод, не принимающий и не возвращающий ничего, лишь выводящий на экран "I am Parent".
//  5. Метод, возвращающий конкатенацию (сумму двух строк), принимающий 2 строки.

public class Parent {
    public int getOperation(int value1, int value2) {
        return value1 + value2;
    }

    public int getSum1(String string, int value) {
        return Integer.parseInt(string) + value;
    }

    public String getString(String string) {
        return string;
    }

    public void info() {
        System.out.println("I am Parent");
    }

    public String getSummString(String string1, String string2) {
        return string1 + string2;
    }

}
