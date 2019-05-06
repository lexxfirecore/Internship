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
        /*
          Created by vmarian on 30-Apr-19.
         */
        System.out.println("Creat de VMarian");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti marimea matricei: ");
        int rows = scanner.nextInt();
        int columns = rows;
        int[][] elemente = new int[rows][columns];
        Random random = new Random();
        int maxrind = 5;
        int minrind = -5;
        System.out.println("\nElementele Matriciei: ");
        for (int i = 0; i < elemente.length; i++) {
            for (int j = 0; j < elemente[i].length; j++) {
                elemente[i][j] = random.nextInt(maxrind + 1 - minrind) + minrind;
            }
        }
        System.out.println(Arrays.deepToString(elemente).replace("], ", "]\n")
                .replace("[[", "[").replace("]]", "]"));

        ArrayList<Integer> elementelediagonaleiprincipale = new ArrayList<>();
        System.out.print("\nDiagonala principala: ");
        for (int i = 0; i < elemente.length; i++) {
            for (int j = 0; j < elemente[i].length; j++) {
                if (i == j) {
                    System.out.print(elemente[i][j] + "  ");
                    elementelediagonaleiprincipale.add((elemente[i][j]));
                }
            }
        }
        ArrayList<Integer> elementelediagonaleisecundare = new ArrayList<>();
        System.out.print("\nDiagonala secundara: ");
        for (int i = 0; i < elemente.length; i++) {
            System.out.print(elemente[elemente.length - i - 1][i] + "  ");
            elementelediagonaleisecundare.add((elemente[elemente.length - i - 1][i]));
        }

        int sumaelementelordiagonalei = sumadiagonalei(elementelediagonaleiprincipale);
        System.out.println("\nSuma diagonalei principale: " + sumaelementelordiagonalei);

        int min = getMin(elemente);
        System.out.println("Minimul matirciei este: " + min);

        if (min != 0) {
            double expresie = calcExpresie(sumaelementelordiagonalei, min);
            System.out.println("Rezultatul formulei (sumaelementelordiagonalei/ min) este = " + expresie);
        } else {
            System.out.println("Min este 0, expresia nu poate fi calculata.");
        }
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
        System.out.println("Input the number of matrix length : ");
        int x = getValidatedInt(scanner);
        if (x > 0) {
            int[][] matrix = createMatrix(new int[x][x], -10, 10);
            System.out.println("Elements of matrix : "); printArr(matrix);
            System.out.print("\nElements of primary diagonal elements : "); printArr(primaryDiagonalArr(matrix));
            System.out.print("\nElements of secondary diagonal elements : "); printArr(secondaryDiagonalArr(matrix));
            System.out.println("\nAverage value of top secondary diagonals elements : " + averageValTopSecDiagonalsElements(matrix));
            //Bonus
            System.out.println("Summ of elements out of primary and secondary diagonals : " + sumOfOutDiagonalsElements(matrix));
        }
    }

    //integrated validator method
    public static int getValidatedInt(Scanner scanner){
        try {
          int x = scanner.nextInt();
            if(x > 0 && x <= Integer.MAX_VALUE){
                return x;
            }else {
                System.out.println("Impossible to create matrix : Input a number greater than 0 and less than " + Integer.MAX_VALUE + ":");
                return -1;
            }
        } catch (InputMismatchException e) {
            System.out.println("Impossible to create matrix : Input a number greater than 0 and less than " + Integer.MAX_VALUE + ":");
            return -1;
        }
    }


    //Create matrix matrix method - by Ion
    public static int[][] createMatrix(int[][] matrix, int x, int y) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = getRandom(x, y);
            }
        }
        return matrix;
    }

   //2d and 1d arrays print method - by Ion
    public static void printArr(Object obj){
        if(obj.getClass().equals(int[][].class)){
            int[][] matrix = (int[][])obj;
            for (int i = 0; i < matrix.length; i++) {
                System.out.println();
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.printf("%4d", matrix[i][j]);
                }
            }
        }
        else if(obj.getClass().equals(int[].class)){
            int[] arr = (int[])obj;
            System.out.print( Arrays.toString(arr));
        }
        else{
            System.out.println("null");
        }
    }

    // Primary diagonal array  - by Ion
    public static int[] primaryDiagonalArr(int[][] matrix) {
        int[] arr = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    arr[i] = matrix[i][j];
                }
            }
        }
        return arr;
    }

    // Secondary diagonal array - by Ion
    public static int[] secondaryDiagonalArr(int matrix[][]) {
        int[] arr = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                if (matrix.length - i - 1 == j) {
                    arr[i] = matrix[i][j];
                }
            }
        }
        return arr;
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
            for (int j = 0; j < matrix[i].length; j++) {
                sumElem = sumElem + matrix[i][j];
            }
            sumPrimary = sumPrimary + primaryDiagonalArr(matrix)[i];
            sumSecondary = sumSecondary + primaryDiagonalArr(matrix)[i];
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
    //Metodele pentru sumaelementelordiagonalei, elementul minim din matirce si expresia create de vmarian.
    public static int sumadiagonalei(ArrayList arrayList) {
        int sumaelementelordiagonalei = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sumaelementelordiagonalei = sumaelementelordiagonalei + (int) arrayList.get(i);
        }
        return sumaelementelordiagonalei;
    }

    public static int getMin(int[][] elemente) {
        int min = elemente [0][0];
        for (int i = 0; i < elemente.length; i++) {
            for (int j = 0; j < elemente.length; j++)
            if (min < elemente[i][j]) {
            } else {

                min = elemente[i][j];
            }
        }
        return min;
    }
    public static double calcExpresie(int sumaelementelordiagonalei, double min) {
        return sumaelementelordiagonalei / min;
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
