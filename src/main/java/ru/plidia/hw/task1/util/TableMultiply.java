package ru.plidia.hw.task1.util;

public class TableMultiply {
    public void multiply() {
        int num = 2;
        while (num <= 5) {
            int num1 = 1;
            int num2 = 0;
            while (num1 <= 10) {
                num2 = num * num1;
                System.out.println(num + " * " + num1 + " = " + num2);
                num1++;
            }
            num++;
            System.out.println();
        }
    }
}