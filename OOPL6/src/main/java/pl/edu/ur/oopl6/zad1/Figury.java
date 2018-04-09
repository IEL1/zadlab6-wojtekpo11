package pl.edu.ur.oopl6.zad1;

public class Figury {

    /**
     * Inicjalizator statyczny
     */
    static {
        System.out.println("Biblioteka obliczająca wielkość figur geometrycznych!!!");
    }

    /**
     * Metoda statyczna obliczająca pole koła
     */
    public static double PoleKola(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    /**
     * Metoda statyczna obliczająca obwód koła
     */
    public static double ObwodKola(double r) {
        return 2 * Math.PI * r;
    }

    public static double PoleKwadratu(double a) {
        return a * a;
    }

    public static double ObwodKwadratu(double b) {
        return 4 * b;
    }

    public static double PoleProstokata(double b, double a) {
        return a * b;
    }

    public static double PoleStozka(double r, double l) {
        return Math.PI * r * r + Math.PI * r * l;
    }

    public static double PoleWalca(double H, double r) {
        return Math.PI * r * r + 2 * Math.PI * r * H;
    }

    public static double ObjetoscWalca(double H, double r) {
        return Math.PI * r * r * H;
    }

    public static double ObjetoscStozka(double H, double r) {
        return  (Math.PI * r * r * H)/3;
    }

    public static double ObwodProstokata(double b, double a) {
        return 2 * a + 2 * b;
    }
}
