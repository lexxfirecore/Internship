package com.internship;

import java.math.BigInteger;
import java.util.Scanner;

public class MargoFactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti numarul de cantece din Player:");
        int num = scan.nextInt();
        if(num<0)System.out.println("nu exista factorial din asa numar");

        if(num<20) {System.out.println(MargoFactorial.factorialUsingRecursion(num));}
        else if(num>=20){System.out.println(String.format("%,d",MargoFactorial.factorialHavingLargeResult(num)));

        }


}


    public static BigInteger factorialHavingLargeResult(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

    public static long factorialUsingRecursion(int n) {
        if (n <= 2) {
            return n;
        }
        return n * factorialUsingRecursion(n - 1);
    }

}

