package com.internship;

import java.util.Scanner;

/**
 * Created by lexx on 08-Apr-19.
 */
public class TextProcessor {
    public static void main(String[] args) {
        System.out.println(TextProcessor.class.getName() + ": ");

        menu();

    }

    private static void textProcessor_1() {

    }

    private static void textProcessor_2() {
        /*
          Created by Margarita on 18-Apr-19.
         */
        System.out.println("Creat de Margarita");

        String txt = "\nMaine merg cu Andu in parc si sa imi iau cu mine: Telefonul," +
                " Geaca, 50 lei si o sticla cu apa? Da, ar fi bine insa daca va ploua?" +
                " Trebuie sa imi iau si o umbrela! Dar vom vedea maine. ";
        System.out.println("Textul este: " + txt);

        // prelucrarea textului pn a numara chite semne de punctuatie contine textul.
        char[] arayCaractere = txt.toCharArray();
        int nrDePunctuatii = 0;
        //numaram nr de semne de punctuatie si le scoatem din text
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arayCaractere.length; i++) {
            switch (arayCaractere[i]) {
                case ':':
                case '.':
                case ',':
                case '?':
                case '!':
                    nrDePunctuatii = nrDePunctuatii + 1;
                    break;
                default:
                    sb.append(arayCaractere[i]);
            }

        }
        System.out.println("Textul fara semne de punctuatie: " + sb);
        System.out.println("Numarul total de aparitii a semnelor de punctuatie este: " + nrDePunctuatii);

        // prelucram textul pn a numara de cate ori se intilneste in text un cuvint introdus de la tastatura
        Scanner scanner = new Scanner(System.in);
        String cuvint;
        System.out.println("Introduceti va rog cuvintul:");
        cuvint = scanner.next();
        String[] textFaraSemneDePunctuatie = sb.toString().split(" ");
        int nrDeCuvinte = 0;
        for (String s : textFaraSemneDePunctuatie) {

            if (s.equalsIgnoreCase(cuvint)) {
                nrDeCuvinte = nrDeCuvinte + 1;
            }
        }
        System.out.println("\nNumarul de aparitii a cuvintului introdus de la tastatura este: " + nrDeCuvinte);
    }

    private static void textProcessor_3() {

    }

    private static void menu() {
        Scanner scanner = new Scanner(System.in);
        int varianta;
        do {
            System.out.println("\nIntroduceti varianta 1-3, sau 0 pentru a iesi din program: ");
            varianta = scanner.nextInt();
            switch (varianta) {
                case 1:
                    textProcessor_1();
                    break;
                case 2:
                    textProcessor_2();
                    break;
                case 3:
                    textProcessor_3();
                    break;
                case 0:
                    System.out.println("Exit.");
                    break;
                default:
                    System.out.println("Nu exista asa varianta!");
            }
        } while (varianta != 0);
    }


}
