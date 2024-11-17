package ru.plidia.hw.task2.util.geometry;

import java.util.Scanner;

public class LengthSegment {
    public void calculateLength() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа - координаты точки А");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Введите два числа - координаты точки В");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Длина отрезка AB с координатами А(" + x1 + ";" + y1
                + ") и В(" + x2 + ";" + y2 + ") равна " + d);
    }
}