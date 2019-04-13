package com.internship.arrays;

import java.util.Random;
import java.util.Scanner;
/*
Created by Ion Ghincolov     10/04/2019
 */

public class IonArrays {

    public static void main(String[] args) {
          main();
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Variant 3: Main");
        System.out.println("Input from keyboard the needed amount of array elements and press enter");

        //int[] arr = {10, 5 ,9};
        //  int[] arr = {0,-1,1};
        int[] arr = new int[sc.nextInt()];

        System.out.println("Declared length of arr : " + arr.length);
        System.out.print("Elements of original array : ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = getRandom(-10, 10);
            System.out.print(arr[i] + " ");
        }


        System.out.println("\nPositive numbers array length : " + pozNumbersArr(arr).length);
        System.out.print("Elemnts of positive array : ");
        for (int i = 0; i < pozNumbersArr(arr).length; i++) {
            System.out.print(pozNumbersArr(arr)[i] + " ");
        }

        System.out.println("\nNegative numbers array length : " + negNumberArr(arr).length);
        System.out.print("Elemnts of negative array  : ");
        for (int i = 0; i < negNumberArr(arr).length; i++) {
            System.out.print(negNumberArr(arr)[i] + " ");
        }

        System.out.print("\nSum of absolute values : ");
        System.out.println(Math.abs(sumOfArrayElem(pozNumbersArr(arr)))
                + Math.abs(sumOfArrayElem(negNumberArr(arr))));

        //Bonus 1

        System.out.println("Variant 3: Bonus 1 ");
        System.out.println("Product of positive numbers : " + prodOfArrayElem(pozNumbersArr(arr)));
        System.out.println("Sum of negative numbers : " + sumOfArrayElem(negNumberArr(arr)));

        //Validator for cheaking division by 0
        if (sumOfArrayElem(negNumberArr(arr)) == 0) {
            System.out.println("Unfortunately division by zero isn't allowed");
        } else {
            System.out.println("Modulo  of positive numbers product and sum of negative numbers : "
                    + prodOfArrayElem(pozNumbersArr(arr)) % sumOfArrayElem(negNumberArr(arr)));
        }

        System.out.println("Variant 3: Bonus 2 ");
        floatSpliter();

    }

    public static int getRandom(int start, int end) {
        Random rand = new Random();
        return start + rand.nextInt(end - start + 1);
    }


    public static int[] pozNumbersArr(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                counter++;
            }
        }
        int index = 0;
        int[] arrPozNum = new int[counter];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arrPozNum[index] = arr[i];
                index++;
            }
        }

        return arrPozNum;
    }


    public static int[] negNumberArr(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                counter++;
            }
        }
        int index = 0;
        int[] arrNegNum = new int[counter];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arrNegNum[index] = arr[i];
                index++;
            }
        }

        return arrNegNum;
    }


    public static int sumOfArrayElem(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int prodOfArrayElem(int[] arr) {
        int prod = 1;
        for (int i = 0; i < arr.length; i++) {
            prod *= arr[i];
        }
        return prod;
    }

    //Bonus 2
    public static void floatSpliter() {
        float[] originFloatArr = {23.3456f, 24432.543f, -234.42342f, 458488.4324323432f};
        float[] integerFloatSideArr = new float[originFloatArr.length];
        float[] fractionalSideArr = new float[originFloatArr.length];

        for (int i = 0; i < originFloatArr.length; i++) {
            integerFloatSideArr[i] = originFloatArr[i] - (originFloatArr[i] % 1);
            fractionalSideArr[i] = originFloatArr[i] % 1;
        }

        printFloatArr(integerFloatSideArr);
        System.out.println();
        printFloatArr(fractionalSideArr);
        System.out.println();
        System.out.println("Summ of origig array elements : " + sumFloatArrElem(originFloatArr));
        System.out.println("Summ of integer side array elements : " + sumFloatArrElem(integerFloatSideArr));
        System.out.println("Summ of fractional side array elements : " + sumFloatArrElem(fractionalSideArr));
        System.out.println("Summ of integer and fractional sides : " +
                          (sumFloatArrElem(integerFloatSideArr)+ sumFloatArrElem(fractionalSideArr) ));
        System.out.println("Are origin float array summ equal with summ of integer and fractional sides? : " +
                (sumFloatArrElem(originFloatArr) == (sumFloatArrElem(integerFloatSideArr)+ sumFloatArrElem(fractionalSideArr))));



    }
    // method for Bonus 2
    public static void printFloatArr(float[] floats) {
        for (float f : floats) {
            System.out.print(f + ", ");
        }
    }
    // method for Bonus 2
    public static float sumFloatArrElem(float[] floats){
       float sum = 0.0f;
       for (int i =0; i<floats.length; i++){
           sum += floats[i];
       }
       return sum;
    }
}

