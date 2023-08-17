package com.kyattonippu.hw_4_javabasics;

public class Main {

    public static byte byteMaxVal = Byte.MAX_VALUE;
    public static int intMaxVal = Integer.MAX_VALUE;
    public static double doubleMaxVal = Double.MAX_VALUE;

    public static void main(String[] args) {

        // Арифметические операторы
        int x = 10;
        int y = 5;

        int sum = x + y; // сложение +
        System.out.println("addition result: " + sum);
        int diff = x - y; // вычитание -
        System.out.println("subtraction result: " + diff);
        int product = x * y; // умножение *
        System.out.println("multiplication result: " + product);
        int division = x / y; // деление /
        System.out.println("division result: " + division);
        int divisionResidues = x % y; // остаток от деления %
        System.out.println("Remainder of the division: " + divisionResidues);

        // Операторы сравнения
        boolean isEqual = y == x;
        System.out.println(isEqual);
        boolean isNotEqual = y != x;
        System.out.println(isNotEqual);
        boolean isGreater = x > y;
        System.out.println(isGreater);
        boolean isLess = x < y;
        System.out.println(isLess);
        boolean isGreaterOrEqual = x >= y;
        System.out.println(isGreaterOrEqual);
        boolean isLessOrEqual = x <= y;
        System.out.println(isLessOrEqual);

        // Логические операторы
        boolean m = true;
        boolean n = false;
        boolean o = true;

        boolean result1 = m && n && o;
        System.out.println("m && n && o = " + result1); //And
        boolean result2 = m || n || o;
        System.out.println("m || n || o = " + result2 ); // Or
        boolean result3 = !o;
        System.out.println("!o not true? : " + result3); // not equal

        // Тернарный оператор
        int min = (x < y) ? x : y; // если x < y, то min = x, иначе min = y
        System.out.println("min = " + min);

        // Переполнение при вычислении byte
        System.out.println("### Результат переполнения byte: " + (byte) (byteMaxVal + 1));

        // Переполнение при вычислении int
        System.out.println("### Результат переполнения int: " + (intMaxVal + 1));

        // Переполнение при вычислении double
        double result4 = doubleMaxVal + 12.23D;
        System.out.println("### Результат переполнения double: " + result4);

        // Вычисление комбинаций разных типов данных
        double p = 2.5;
        int r = 100;
        System.out.println("Result different types of data:" + (p + r));
    }
}
