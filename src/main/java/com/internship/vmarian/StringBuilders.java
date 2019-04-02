package com.internship.vmarian;
import java.lang.*;
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
    //System.out.println(StringBuilders.class.getName() + ": ");

        varianta1();
        varianta2();
        varianta3();
        varianta4();
    }



    private static void varianta1() {
        // TODO: insert your name and code here
        //       StringBuffer este și mutabil și sincronizat, iar StrinBuilder este mutabil dar nesicronizat

                StringBuilder strBuilder = new StringBuilder("Core ");
                strBuilder.append(" Java ");
                System.out.println(strBuilder);
                strBuilder.append( "SE");
                System.out.println(strBuilder);
                strBuilder.replace(0, 8, "Record Aj");
                System.out.println(strBuilder);
                strBuilder.insert(0, "Play ");
                System.out.println(strBuilder);
                // returns the current capacity of the String builder i.e. 16 +
                System.out.println("capacity=" +strBuilder.capacity());
                System.out.println(strBuilder.length());

                StringBuffer strBuffer = new StringBuffer("Salut");
                System.out.println(strBuffer);
                strBuffer.append(" Alex");
                System.out.println(strBuffer);
                strBuffer.replace(0, 5, "Privet");
                System.out.println(strBuffer);
                strBuffer.delete(3, 5);
                System.out.println(strBuffer);
                strBuffer.insert(4,"(aici au mai fost 'e' si 't')");
                System.out.println(strBuffer);
                // returns the current capacity of the String buffer i.e. 16 +
                System.out.println(strBuffer.capacity());
                System.out.println(strBuffer.length());
            }


    private static void varianta2() {
        // TODO: insert your name and code here
    }

    private static void varianta3() {
        // TODO: insert your name and code here
    }

    private static void varianta4() {
        // TODO: insert your name and code here
    }


}
