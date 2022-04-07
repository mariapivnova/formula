package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите число n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("Введите число x: ");
        int x = scanner.nextInt();
        double itog=0;
        for (int j = 1; j <= n; j++) {
            int factorial= 2;
            for (int t = 1; t <= j; t++) {
                factorial *= t;

            }
            double summa = (Math.pow((-1), n) * Math.pow(x, 2*n) / factorial);
            itog = itog + summa;

        }

        System.out.println(itog);

    }

}