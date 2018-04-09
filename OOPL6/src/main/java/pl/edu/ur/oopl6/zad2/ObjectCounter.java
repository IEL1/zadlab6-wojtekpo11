package pl.edu.ur.oopl6.zad2;

import java.util.Random;

public class ObjectCounter {
    public static void main(String[] args){
        Punkt[] p = new Punkt[10];
        Random r = new Random();
        for (int i = 0; i<10; i++){
            p[i] = new Punkt(r.nextInt(1000), r.nextInt(1000), r.nextInt(1000));
            System.out.println(p[i].toString());
        }
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println(Punkt.last_point.toString());
        System.out.println("-------------------------------------------------");
        Punkt.PokazOstatniObiekt();
    }
}

//Tworzy losowe liczby, ktore sa przechowywane jaka współżedne w tablicy. 
//Ostatni System.out.println wypisuje ostatnie wygenerowane wspolrzedne.
