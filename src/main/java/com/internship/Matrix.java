package com.internship;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by lexx on 22-Apr-19.
 */
public class Matrix {
    public static void main(String[] args) {
        System.out.println(Matrix.class.getName() + ": ");
        menu();
    }

    private static void matrix_1() {

    }

    private static void matrix_2() {
         /*
          Created by Margarita on 23-Apr-19.
         */
        System.out.println("Creat de Margarita");
        // printam  o matricie introdusa de la tastatura
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduceti nr  pentru matricia bidemensionala(acelas nr de linii si coloane):");
        int rows = scanner.nextInt();
        int columns = rows;
        int[][] array2d = new int[rows][columns];
        Random random = new Random();
        int maxRand = 10;
        int minRand = -10;

        System.out.println("Elementele Matriciei: ");
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                array2d[i][j] = random.nextInt(maxRand + 1 - minRand) + minRand;
            }
        }
        System.out.println(Arrays.deepToString(array2d).replace("], ", "]\n")
                .replace("[[", "[").replace("]]", "]"));

        // printam diagonala principala la o matricie introdusa de la tastatura
        //si nr din diagonala le scoatem in arrayList
        ArrayList<Integer> nrDiagonalaPrincip = new ArrayList<>();

        System.out.print("Diagonala principala: ");
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                if (i == j) {
                    System.out.print(array2d[i][j] + "  ");
                    nrDiagonalaPrincip.add((array2d[i][j]));
                }
            }

        }
        System.out.print("\nArray din numerele diagonalei principale : " + nrDiagonalaPrincip);
        // printam diagonala secundara la o matricie introdusa de la tastatura
        //si nr din diagonala le scoatem in arrayList
        ArrayList<Integer> nrDiagonalaSecundara = new ArrayList<>();

        System.out.print("\nDiagonala secundara: ");
        for (int i = 0; i < array2d.length; i++) {
            System.out.print(array2d[array2d.length - i - 1][i] + "  ");
            nrDiagonalaSecundara.add((array2d[array2d.length - i - 1][i]));
        }
        System.out.println("\nArray din numerele diagonalei secundare : " + nrDiagonalaSecundara);
        //Printam suma si media diagonalelor
        int sumaDiagonaleiPrincipale = sumaDiagonalei(nrDiagonalaPrincip);
        System.out.println("Suma diagonalei principale=" + sumaDiagonaleiPrincipale);

        double mediaDiagonaleiSecundara = mediaDiagonalei(nrDiagonalaSecundara);
        System.out.println("Media diagonalei secundare=" + String.format("%.2f", (double)
                mediaDiagonaleiSecundara));

        double expresie = (sumaDiagonaleiPrincipale / mediaDiagonaleiSecundara);
        System.out.println("Suma maximului de pe diagonalei principala, impartit la media aritmetica" +
                " a diagonalei secundare: "
                + String.format("%.2f", expresie));
    }


    private static void matrix_3() {

    }

    //Metodele pn suma si medie create de Margarita
    public static int sumaDiagonalei(ArrayList arrayList) {
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum = sum + (int) arrayList.get(i);

        }
        return sum;
    }

    public static double mediaDiagonalei(ArrayList arrayList) {
        double media = (double) sumaDiagonalei(arrayList) / arrayList.size();
        return media;
    }

    private static void menu() {
        Scanner scanner = new Scanner(System.in);
        int varianta;
        do {
            System.out.println("\nIntroduceti varianta 1-3, sau 0 pentru a iesi din program: ");
            varianta = scanner.nextInt();
            switch (varianta) {
                case 1:
                    matrix_1();
                    break;
                case 2:
                    matrix_2();
                    break;
                case 3:
                    matrix_3();
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
