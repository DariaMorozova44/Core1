package task.methods;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        // Пример вызова метода
        String string = getString("HELLO");
        // Ожидаемый результат hello System.out.println(string);
        // Вызовы ваших методов
        System.out.println(Methods.getSumm(5, 2));
        System.out.println(Methods.getSummString("privet ", "poka"));
        System.out.println(Methods.getSumm2("50", 5));
        System.out.println(Methods.getInfoofArray(new int[]{2, 2, 4, 5}));
        System.out.println(Methods.getcompare("2", 2));
        System.out.println(Methods.getTrueOrFalse(true, false));
        System.out.println(Methods.getevenOrOdd(2));
        System.out.println(Arrays.toString(Methods.getArray(new int[]{1, 2, 3, 4, 4, 5})));
        System.out.println(Methods.getSummArray(new int[]{1, 2, 3, 4, 4, 5}));
        System.out.println(Methods.getMonth(12));
        System.out.println(Methods.getMinutes(36));
        System.out.println(Methods.getHour(52));
        System.out.println(Methods.compareString("Dasha", "dasha"));
        System.out.println(Methods.getLast(new String[]{"hgfdjgh", "hdfgdsh", "hgjhrfh"}));
        System.out.println(Methods.getSummA("ahbhxhbhaMAJHXzANJSAKA"));
        Methods.wallet();
    }

    // Метод принимающий строку и преобразующий ее в нижний регистр
    public static String getString(String example) {
        return example.toLowerCase();
    }


// Реализуйте функциональность согласно описанию
    //test

    // TODO: Создайте метод который вернет сумму двух чисел
    public static int getSumm(int value1, int value2) {
        return value1 + value2;
    }


    // TODO: Создайте метод который вернет сумму двух переданных строк
    public static String getSummString(String string1, String string2) {
        return string1 + string2;
    }


    // TODO: создайте метод который примет строку внутри которой передается число , а также принимает число . Метод должен суммировать числа
//  обернуть их в строку и вернуть результат строкой
    public static String getSumm2(String string1, int value) {
        return Integer.toString(Integer.parseInt(string1) + value);

    }


    // TODO: Создайте метод который принимает строку , число . Внутри строки передается число . Проверить , что если число внутри строки больше чем
//  число которое передается как int , то пусть метод вернет false , а если меньше , то true
    public static boolean getcompare(String string, int value) {
        return Integer.parseInt(string) < value;

    }


    // TODO: Создайте метод который принимает 2 булевые переменные . Если обе true , верни true , если хоть одна из них true верни true ,
//  если обе false верни false
    public static boolean getTrueOrFalse(boolean value1, boolean value2) {
        return value1 || value2;
    }


    // TODO: Создайте метод который принимает число и вернет true если оно четное , и false если оно не четное
    public static boolean getevenOrOdd(int value) {
        return value % 2 == 0;
    }


    // TODO: Создайте метод который проверят числа в массиве , если все они четные верни "Массив четных чисел" , если есть и четные и не
    //  четные верни "Массив четных и не четных чисел" и если в массиве только нечетные числа верни "Массив не четных чисел"
    public static String getInfoofArray(int[] array) {
        int even = 0;
        int odd = 0;
        for (int value : array) {
            if (value % 2 == 0) {
                even++;
                continue;
            }
            odd++;
        }

        return (even > 0 && odd == 0) ? "Массив четных чисел" : (even == 0 && odd > 0) ? "Массив не четных чисел" : "Массив четных и не четных чисел";
    }


    // TODO: Создайте метод который принимает массив чисел и возвращает новый массив чисел . Внутри метода пройдитесь по элементам
//  массива который подается в аргументы  и сложите все элементы в новый массив и верните его
    public static int[] getArray(int[] array) {
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        return array2;
    }


    // TODO: Создайте метод который принимает массив чисел и возвращает число . Внутри метода пройдитесь по элементам массива который подается в
//  аргументы сложите все числа который переданы в массиве и верните сумму всех чисел
    public static int getSummArray(int[] array) {
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            summ += array[i];
        }
        return summ;
    }


    // TODO: Создайте методы в которые можно будет передавать свой возраст , а возвращаться сколько полных месяцев в этом возрасте ,
//  тоесть если человек прожил 10 лет , это 120 месяцев так же сделайте перевод возраста в минуты и метод который расчетает возраст в часах
    public static int getMonth(int value) {
        return value * 12;
    }

    public static int getMinutes(int value) {
        return 525600 * value;
    }

    public static int getHour(int value) {
        return 8760 * value;
    }


    // TODO: Создайте метод которому передаю имена , а он проверяет одинаковые ли они , причем не зависимо от регистра
    public static boolean compareString(String string1, String string2) {
        return string1.equalsIgnoreCase(string2);
    }


    // TODO: Создайте метод которому можно передать массив элементов , а он вернет последний элемент
    public static <T> T getLast(T[] array) {
        return array[array.length - 1];

    }


    // TODO: Создайте метод счетчик букв А . Подается строка и метод посчитает сколько букв А в строке
    public static int getSummA(String string) {
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'A') {
                counter++;
            }
        }
        return counter;

    }


    // TODO: Создайте метод кошелек , у него есть началная сумма и можно вычитать пока деньги не кончатся или сумма не будет слишком велика


    static int value = 100;

    public static void wallet() {
        if (value > 0) {
            value -= 20;
            System.out.println(value);
        } else {
            System.out.println("не достаточно средств");
        }


    }

}
