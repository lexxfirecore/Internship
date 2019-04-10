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

        System.out.println("Input from keyboard the needed amount of array elements and press enter");

        int[] arr = new int[sc.nextInt()];

        System.out.println("Declared length of arr = " + arr.length);
        System.out.print("Elements of original array = ");

        for(int i=0; i<arr.length; i++){
            arr[i]= getRandom(-10, 10);
            System.out.print(arr[i] + " ");
        }


        System.out.println("\nPositive numbers array length = " + pozNumbersArr(arr).length);
        System.out.print("Elemnts of positive array - ");
        for(int i=0; i<pozNumbersArr(arr).length; i++){
            System.out.print(pozNumbersArr(arr)[i] + " ");
        }

        System.out.println("\nNegative numbers array length = " + negNumberArr(arr).length);
        System.out.print("Elemnts of negative array  = ");
        for(int i=0; i<negNumberArr(arr).length; i++){
            System.out.print(negNumberArr(arr)[i]+ " ");
        }

        System.out.print("\nSum of absolute values = ");
        System.out.print(Math.abs(sumOfArrayElem(pozNumbersArr(arr)))
                + Math.abs(sumOfArrayElem(negNumberArr(arr))));

        //Bonus 1
        System.out.print("\nProduct of positive numbers = " + prodOfArrayElem(pozNumbersArr(arr)));
        System.out.print("\nSum of negative numbers = " + sumOfArrayElem(negNumberArr(arr)));
        System.out.print("\nDivision  of positive numbers product to sum of negative numbers = "
                           + prodOfArrayElem(pozNumbersArr(arr))/sumOfArrayElem(negNumberArr(arr)));


    }

    public static int getRandom(int start, int end){
        Random rand = new Random();
        return start + rand.nextInt(end - start+1);
    }


    public static int[] pozNumbersArr(int[] arr){
        int counter = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > 0){
                counter++;
            }
        }
        int index = 0;
        int[] arrPozNum = new int[counter];
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] > 0){
                arrPozNum[index] = arr[i];
                index++;
            }
        }

        return arrPozNum;
    }


    public static int[] negNumberArr(int[] arr){
        int counter = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] <0 ){
                counter++;
            }
        }
        int index = 0;
        int[] arrNegNum = new int[counter];

        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] < 0){
                arrNegNum[index] = arr[i];
                index++;
            }
        }

        return arrNegNum;
    }


    public static int sumOfArrayElem(int[] arr){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static int prodOfArrayElem(int[] arr){
        int prod = 1;
        for(int i = 0; i<arr.length; i++){
            prod *= arr[i];
        }
        return prod;
    }

    // TODO: Bonus 2

}

