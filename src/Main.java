import java.time.LocalDate;
import java.time.Year;

import static java.time.LocalDate.*;

public class Main {

    public static void main(String[] args) {
        int distance=100;
        int year = 24;
      printDostavka(distance);
        printInfoAboutYear(year);
        printInfoAboutVersion(3, 2022);


    }

    private static void printdostawka1(int printDostavka) {

    }



    private static void printInfoAboutVersion(int os, int productionYear) {
        System.out.println("Задача2");

        int currentYear = LocalDate.now().getYear();
        if (productionYear > currentYear) {
            System.out.println("установите облегченную версию.");
        } else {
            System.out.println("Установите обычную версию");
        }
        if (os < 0 || os > 1) {
            System.out.println("Такой версии нет");
            return;
        }

        if (os == 0) {
            System.out.println("IOS");
        } else {
            System.out.println("для ANDROID");

        }


    }

    private static void printInfoAboutYear(int year) {
        System.out.println("Задача1");

        boolean leapYear = isLeapYear(year);
        if (leapYear) {
            System.out.println(year + "год является високостным");
        } else {
            System.out.println(year + "год не является високостным");

        }


    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0 & year % 100 != 0 || year % 400 == 0;
    }

    private static void printDostavka(int distance) {
        System.out.println("Задача 3");
        if (distance < 20) {
            System.out.println("Доставка занимает сутки");
        } else if (distance < 60 & distance > 20) {
            System.out.println("доставка займет еще один день");
        } else if (distance < 100) {
            System.out.println("Доставка займет еще одни сутки");
        }
        if (distance >= 100) {
            System.out.println("Доставки нет");
        }
    }
}