package com.internship;


import org.apache.commons.lang3.StringUtils;



/**
 * Created by lexx on 02-Apr-19.
 */
public class ApacheStringUtils {
    public static void main(String[] args) {
        System.out.println(ApacheStringUtils.class.getName() + ": ");

        isEmptyExample();
        startsWithExample();

        // TODO: si asa mai departe pentru fiecare metoda

    }

    private static void isEmptyExample() {
        // TODO: insert your code here
    }

    private static void startsWithExample() {
        // TODO: insert your code here
    }

    public static void contains() {
        System.out.println("contains()-creat de vmarian");
        String expresie = "Vrei, nu vrei, bea Gheorghe aghiasma";
        System.out.println(expresie.contains("Vrei, nu vrei"));
        System.out.println(expresie.contains("bea Gheorghe"));
        System.out.println(expresie.contains("Coniac"));
    }

    public static void StringBefore() {
        System.out.println("StringBefore()-creat de vmarian");
        System.out.println(StringUtils.substringBefore("This is my string", " "));/** rezultatul este: This*/
        System.out.println(StringUtils.substringBefore("This is my string", "is"));/** rezultatul este: Th*/
        System.out.println(StringUtils.substringBefore("This is my string", "string"));/** rezultatul este: This is my*/
    }

    public static boolean isNumeric(String number) {
        System.out.println("isNumeric()-creat de vmarian");
        try {
            double d = Double.parseDouble(number);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }

    public static void Trim() {
        System.out.println("Trim()-creat de vmarian");
        System.out.println("10) Trim String. No NullPointerException >>>" +
                StringUtils.trim(null));
    }
}
