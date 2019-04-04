package com.internship.ion;

import java.util.Random;
import java.util.Scanner;

class ArrayCalculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input from keyboard the needed amount of array elements and press enter");

        int[] arr = new int[sc.nextInt()];

        System.out.println("Declared length of arr = " + arr.length);
        System.out.println("Elements of original array");

        for(int i=0; i<arr.length; i++){
            arr[i]= getRandom(-10, 10);
            System.out.println(arr[i]);
        }


        System.out.println("Positive numbers array length = " + pozNumbersArr(arr).length);
        for(int i=0; i<pozNumbersArr(arr).length; i++){
            System.out.println(pozNumbersArr(arr)[i]);
        }

        System.out.println("Negative numbers array length = " + negNumberArr(arr).length);
        for(int i=0; i<negNumberArr(arr).length; i++){
            System.out.println(negNumberArr(arr)[i]);
        }

        System.out.print("Sum of absolute values = ");
        System.out.print( Math.abs(sumOfArrayElem(pozNumbersArr(arr)))
                + Math.abs(sumOfArrayElem(negNumberArr(arr))));
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

    // TODO: Bonus 2
}