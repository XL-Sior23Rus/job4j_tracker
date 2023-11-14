package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int b) {
        return b / x;
    }

    public int sumAllOperation(int c) {
        return sum(c) + multiply(c) + minus(c) + divide(c);
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        int result2 = minus(10);
        System.out.println(result2);
        Calculator calculator1 = new Calculator();
        int rsl2 = calculator.divide(5);
        System.out.println(rsl2);
        Calculator calculator2 = new Calculator();
        int rsl3 = calculator.sumAllOperation(5);
        System.out.println(rsl3);
    }
}
