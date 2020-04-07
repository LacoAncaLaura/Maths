package org.fasttrackit;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class LogicalOp {
//Exercise 1
    public static void ascendingNumbers(int number) {
        System.out.println("The following numbers for the first exercise are: ");
        number = 35;
        for (int i = 35; i < 100; i++) {
            System.out.println((i + 1));
        }
    }
//Exercise 2
    public static void descendingNumbers(int number) {
        System.out.println("The following numbers for the second exercise are: ");
        number = 4;
        for (int i = 4; i > -100; i--) {
            System.out.println((i - 1));
        }
    }
//Exercise 3
    public static void running() {
        System.out.println("The following numbers for the third exercise are: ");
        int x = 12;
        int y = 30;
        for (int i = x; i < y; i++) {
            System.out.println(i + 1);
        }
    }
//Exercise 4
    public static void jumping() {
        System.out.println("The following numbers for the forth exercise are: ");
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
//Exercise 5
    public static void juggling() {
        System.out.println("The following numbers for the fifth exercise are: ");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) ;
            System.out.println(i);
        }

    }
//Exercise 6
    public static void tasting() {
        System.out.println("The following numbers for the sixth exercise are: ");
        for (int i = 0; i <= 100; i ++) {
            i ++;
            System.out.println(i);
        }
    }
//Exercise 7
    public static void countNumbers(int number) {
        System.out.println("Please add a number: ");
        Scanner scanner = new Scanner(System.in);
        int countNumbers = scanner.nextInt();
        int totalCountNumbers = number;

        System.out.println("The following numbers for the seventh exercise are: ");
        for (int i = number; i <= 100; i++) {
            totalCountNumbers += i;
        }
        System.out.println(totalCountNumbers);
    }
//Exercise 8
    public static void countingNumbers() {
        System.out.println("Please add a number: ");
        Scanner scanner = new Scanner(System.in);
        int numberFromUser = scanner.nextInt();
        int countingFor = 0;
        int totalCountingNumber = numberFromUser;
        System.out.println("The following numbers for the eighth exercise are: ");
        for (int i = numberFromUser; i <= 100; i++) {
            totalCountingNumber += i;
            countingFor++;
        }
        System.out.println(totalCountingNumber / countingFor);
    }
//Exercise 9
    public static void Stars(){
        System.out.println("The following STARS for the ninth exercise are: ");
        for (int i = 0; i < 7 ; i ++){
            System.out.println(" * " );
//            for (int j = 0 ; j < 7 ; j--);
//
//            System.out.println(" * ");

        }
    }
}










