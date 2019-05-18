package com.sda.algorytmy;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int suma_dziel = 0;
        int i = 1;

        while (i <= x / 2) {
            if (x % i == 0) {
                suma_dziel = suma_dziel + i;
            }
            i = i + 1;
        }
        if (x == suma_dziel) {
            System.out.println(x + " jest liczba doskonala");
        } else {
            System.out.println(x + " nie jest liczba doskonala");
        }
    }
}
