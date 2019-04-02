package com.internship;

/**
 * Created by lexx on 01-Apr-19.
 *
 * Fiecare scriti in metoda lui ca comentarii si explicati cum intelegeti fiecare,
 * ce inseamna mutable si immutable, de ce nui bine de folosit String
 * si de ce se foloseste StringBuilder si StringBuffer, si diferentele dintre ele
 *
 * Scriti exemplu care foloseste ambele clase StringBuilder si StringBuffer
 *
 */
public class StringBuilders {

    public static void main(String[] args) {
   //     System.out.println(StringBuilders.class.getName() + ": ");

        varianta1();
        varianta2();
        varianta3();
        varianta4();
    }



    private static void varianta1() {
        // TODO: insert your name and code here
    }

    private static void varianta2() {
        // TODO: insert your name and code here
        System.out.println("Margarita");
        /* Ce inseamna mutable?
        Mutable inseamna ca la crearea unui obiect
        se aloca o "cutiuta" de memorie si apoi cand se lucreaza cu acest obiect
        si se introduc schimbari ele se pastreaza in aceeas cutiuta creata initial.
        Ce inseamna imutable?
        String e imutabil, de fiecare data cand se introduc ceva schimbari el aloca
        memorie noua, adica de fiecare data se creaza cutiuta noua.
         De ce nui bine de folosit string? Prin urmare daca
        este mult de lucru cu schimbari se umpla repede memoria.
        De ce se foloseste StringBuilder si StringBuffer?
        Aceste clase sunt mutabile deci economisesc memorie cand e nevoie de lucrat
        cu text care se modifica des.
         Diferentele dintre ele?
         StringBuilder   | StringBuffer
         nui singronizat | e sinhronizat
         nui tread safety| poate concomitent avea mai multe treaduri
         e mai rapid     | e mai incet din cauza ca e sincronizat
         */
        StringBuilder str = new StringBuilder("Java");
        str.append(8);
        str.delete(0,1);
        System.out.println( "Capacitatia: "+str.capacity());
        System.out.println(str);
        StringBuffer stb = new StringBuffer("hahaha");
        stb.append(7);
        stb.deleteCharAt(0);
        System.out.println("Capacitatia: "+stb.capacity());
        System.out.println(stb);


    }

    private static void varianta3() {
        // TODO: insert your name and code here
    }

    private static void varianta4() {
        // TODO: insert your name and code here
    }


}
