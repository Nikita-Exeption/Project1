package org.Nikita;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите радиус:");
            double r = scanner.nextDouble();
            System.out.println("Введиет высоту:");
            double h = scanner.nextDouble();
            System.out.println("Объем цилиндра: " + r * r * h * Math.PI);
        } catch (Exception exception) {
            System.out.println("Неправильно введены данные ");
        }
    }
}
