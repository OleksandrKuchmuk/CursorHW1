package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 47;
        int b = 92;
        int X = 17;
        double x = 5.23;
        double y = 13.58;
        float w = 27.22f;
        float e = 25.3f;

        double result1;
        double result2;
        double result3;
        double result4;


        if (e != 0 && x != 0 && y != 0) {
            result1 = x + y - a / 2 * (x + w);
            result2 = a * (x + x) / y - a * 3;
            result3 = a + b / x - y;
            result4 = X - e / 2 % e + 1;
        } else throw new ArithmeticException("x, y or e = 0, cannot be divided by zero");


        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
