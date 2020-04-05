package org.fasttrackit;

import java.util.Scanner;

public class LogicalOp {
    public static void ascendingNumbers(int number) {
        System.out.println("The following numbers are: ");
        number = 35;
        for (int i = 35; i < 100; i++) {
            System.out.println((i + 1));
        }
    }

    public static void descendingNumbers(int number) {
        System.out.println("The following numbers are: ");
        number = 4;
        for (int i = 4; i > -100; i--) {
            System.out.println((i - 1));
        }
    }

    public static void running() {
        System.out.println("The following numbers are: ");
        int x = 12;
        int y = 30;
        for (int i = x; i < y; i++) {
            System.out.println(i + 1);
        }
    }

    public static void jumping() {
        System.out.println("The following numbers are: ");
        int x = 18;
        int y = 9;
        for (int i = y; x > i; i++) {
            if (y > i) {
                System.out.println("No!");
            } else {
                System.out.println(i + 1);
            }
        }
    }

    public static void juggling() {
        System.out.println("The following numbers are: ");
        for (int i = 1; i < 100; i += 2)
            System.out.println(i + 1);
    }

    public static void tasting() {
        System.out.println("The following numbers are: ");
        for (int i = 0; i < 100; i +=2 )
        System.out.println( i +=2);
    }
    public static void countNumbers(int number) {
        System.out.println("Please add a number: ");
        Scanner scanner = new Scanner(System.in);
        int countNumbers = scanner.nextInt();
        int totalCountNumbers = number;

        System.out.println("The following numbers are: ");
        for (int i = number; i <= 100; i++) {
            totalCountNumbers += i;
        }
        System.out.println(totalCountNumbers);
    }
    public static void countingNumbers(int number) {
        int countingNumber = 78;
        int totalCountingNumber=number;

        System.out.println("The following numbers are: ");
        for (int i = number; i <= 100; i++){
            totalCountingNumber += i/number;
            System.out.println(totalCountingNumber);}

}}









