/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Wojciech
 */
public class Complex {

    public static void Liczbazespolona(double re, double im) {
        System.out.println("Liczba ma postać: " + re + " + " + im + "i");
    }

    public static double Modul(double re, double im) {
        return Math.hypot(re, im);
    }

    public static void LiczbaSprzezona(double re, double im) {
        if (im > 0) {
            System.out.println("Liczba sprzężona ma postać: " + re
                    + " - " + im + "i");
        } else {
            double im2 = Math.abs(im);
            System.out.println("Liczba sprzężona ma postać: " + re + " + " + im2 + "i");
        }
    }

    public static void DodawanieAlgebraiczne(double re, double im, double re2, double im2) {
        double dodawanie1 = re + re2;
        double dodawanie2 = im + im2;
        System.out.print("Wynik dodawania to: " + dodawanie1 + " + "
                + dodawanie2 + "i");

    }

    public static void OdejmowanieAlgebraiczne(double re, double im, double re2, double im2) {
        double odejmowanie1 = re - re2;
        double odejmowanie2 = im - im2;
        if (odejmowanie1 < 0) {
            double odejmowanie3 = Math.abs(odejmowanie1);
            System.out.print("Wynik odejmowania to: -" + odejmowanie3 + " - "
                    + odejmowanie2 + "i");
        } else {
            System.out.print("Wynik odejmowania to: " + odejmowanie1 + " + "
                    + odejmowanie2 + "i");
        }
    }

    public static void MnozenieAlgebraiczne(double re, double im, double re2, double im2) {
        double mnozenie1, mnozenie2;
        mnozenie1 = (re * re2) - (im * im2);
        mnozenie2 = (re * im2) + (re2 * im);
        System.out.println("Wynik mnożenia wynosi: " + mnozenie1 + " + "
                + mnozenie2 + "i");
    }

    public static void DzielenieAlgebraiczne(double re, double im, double re2, double im2) {

    }

    public static void main(String[] args) {
        System.out.println("Utwórz klasę Complex implementującą strukturę liczb zespolonych. Do klasy dodaj metody statyczne dokonujące obliczeń na tych liczbach.");
        // TODO code application logic here
        int menu;
        Scanner in = new Scanner(System.in);
        System.out.println("Wybierz zadanie: ");
        System.out.println("\n1. Moduł liczby zespolonej"
                + " \n2. Wartość liczby sprezężonej doliczby zespolonej"
                + "\n3. Dodawanie (postać algebraiczna)"
                + "\n4. Odejmowanie (postać algebraczna)"
                + "\n5. Mnożenie algebraiczne"
                + "\n6. Dzielenie algebraiczne");
        menu = in.nextInt();
        switch (menu) {
            case 1:
                System.out.println("Moduł liczby zespolonej wynosi: " + Modul(2, 4));
                break;
            case 2:
                LiczbaSprzezona(2, 3);
                break;
            case 3:
                DodawanieAlgebraiczne(5, 4, 3, 5);
                break;
            case 4:
                OdejmowanieAlgebraiczne(1, 4, 3, 5);
                break;
            case 5:
                MnozenieAlgebraiczne(3, 4, 5, 1);
                break;
            case 6:
                DzielenieAlgebraiczne(10, 4, 7, 2);
                break;
            default:
                System.out.println("Nie podałes liczby z zakresu od 1-6. Żle!");
        }
    }
}
