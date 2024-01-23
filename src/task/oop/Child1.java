package task.oop;
// TODO: Создайте класс Child1 и переопределите все 5 методов.
//  1. Первый метод переопределите так, что вместо суммы первый метод перемножает числа, а не складывает.
//  2. Второй метод переопределите, чтобы получившееся число после суммирования умножалось на 2.
//  3. Третий метод переопределите, чтобы возвращал только первую букву из строки.
//  4. Четвертый метод выводит на экран "I am Child1".
//  5. Пятый метод после слияния двух строк должен обрезать строку и вернуть только ее половину.

public class Child1 extends Parent {

    @Override
    public int getOperation(int value1, int value2) {
        return value1 * value2;

    }

    @Override
    public int getSum1(String string, int value) {
        return (Integer.parseInt(string) + value) * 2;
    }

    @Override
    public String getString(String string) {
        return string.substring(0, 1);
    }

    @Override
    public void info() {
        System.out.println("I am Child1");
    }

    @Override
    public String getSummString(String string1, String string2) {
        int value = (string1 + string2).length();
        return (string1 + string2).substring(0, value / 2);
    }
}
