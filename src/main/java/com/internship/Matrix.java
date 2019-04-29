package com.internship;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import java.util.*;

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
         /*
          Created by Ion on 23-Apr-19.
         */
        main();
    }

    //Main task method - by Ion
    public static void main() {
        System.out.println("Variant 3 - Created by Ion");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an integer number greater than 0 for number of columns and rows in matrix:");
        int x = 0;
        //Validator for no integers input
        try {
            x = scanner.nextInt();
            //Validation - out of positiv values range and integer maximum value range
            if (x <= 0 || x > Integer.MAX_VALUE) {
                System.out.println("Impossible to create matrix : Input a number greater than 0 and less than " + Integer.MAX_VALUE + ":");
            } else {
                int[][] matrix = new int[x][x];
                addElementsToMatrix(matrix, -10, 10);
                printMatrixElements(matrix);
                printPrimaryDiagonalElements(matrix);
                printSecondaryDiagonalElements(matrix);
                System.out.println("\nAverage value of top secondary diagonals elements : " + averageValTopSecDiagonalsElements(matrix));
                //Bonus
                System.out.println("Summ of elements out of primary and secondary diagonals : " + sumOfOutDiagonalsElements(matrix));
            }
        } catch (InputMismatchException e) {
            System.out.println("Impossible to create matrix : Input an integer number greater than 0 and less than " + Integer.MAX_VALUE + ":");
            return;
        }


    }

    //Add elements to matrix method - by Ion
    public static void addElementsToMatrix(int matrix[][], int x, int y) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = getRandom(x, y);
            }
        }
    }

    //Print matrix method - by Ion
    public static void printMatrixElements(int matrix[][]) {
        System.out.println("Matrix elements : ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d", matrix[i][j]);

            }
        }
    }

    // Print primary diagonal elements method - by Ion
    public static void printPrimaryDiagonalElements(int matrix[][]) {
        System.out.print("\nPrimary diagonal elements : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }

    // Print secondary diagonal elements method - by Ion
    public static void printSecondaryDiagonalElements(int matrix[][]) {
        System.out.print("\nSecondary diagonal elements : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                if (matrix.length - i - 1 == j) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }

    //Average value of top secondary diagonals elements method - by Ion
    public static double averageValTopSecDiagonalsElements(int matrix[][]) {
        int count = 0;
        int sumTopSecondDiagonalsElements = 0;
        for (int k = 0; k < matrix.length; k++) {
            for (int i = 0; i < matrix.length - k; i++) {
                for (int j = matrix[i].length - k - 1; j >= 0; j--) {
                    if (matrix.length - i - k - 1 == j) {
                        sumTopSecondDiagonalsElements = sumTopSecondDiagonalsElements + matrix[i][j];
                        count++;
                    }
                }
            }
        }
        return (double) sumTopSecondDiagonalsElements / count;
    }

    //Summ of out diagonals elements - by Ion
    public static int sumOfOutDiagonalsElements(int matrix[][]) {
        int sumElem = 0;
        int sumPrimary = 0;
        int sumSecondary = 0;
        for (int i = 0; i < matrix.length; i++) {
            //Summ of all matrix elements
            for (int j = 0; j < matrix[i].length; j++) {
                sumElem = sumElem + matrix[i][j];
            }
            //Summ of primary diagonal elements
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    sumPrimary = sumPrimary + matrix[i][j];
                }
            }
            //Summ of secondary diagonal elements
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                if (matrix.length - i - 1 == j) {
                    sumSecondary = sumSecondary + matrix[i][j];
                }
            }
        }
        //Tests print out - Not required by task -  They will be deleted after final approve
        if (matrix.length % 2 != 0) {
            System.out.println("Central element of matrix: " + matrix[matrix.length / 2][matrix.length / 2]);
        }
        System.out.println("Summ of all elements : " + sumElem);
        System.out.println("Summ of primary diagonal elements: " + sumPrimary);
        System.out.println("Summ of secondary diagonal elements: " + sumSecondary);

        //Condition for validating odd length of matrix
        if (matrix.length % 2 != 0) {
            sumPrimary = sumPrimary - (matrix[matrix.length / 2][matrix.length / 2]);
        }
        return (sumElem - (sumPrimary + sumSecondary));
    }

    // getRandom() number method - by Ion
    public static int getRandom(int start, int end) {
        Random rand = new Random();
        return start + rand.nextInt(end - start + 1);
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
