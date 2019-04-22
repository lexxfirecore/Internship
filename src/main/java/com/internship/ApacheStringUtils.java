package com.internship;

import com.internship.zoo.Cat;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by lexx on 02-Apr-19.
 */
public class ApacheStringUtils {
    public static void main(String[] args) {
        System.out.println(ApacheStringUtils.class.getName() + ": ");

        isEmptyExample();
        startsWithExample();
        contains();
        StringBefore();
        isNumeric();
        Trim();
        margaritaq();

        //added by Ion - 20/04/19
        indexOfExample();
        rotateExample();
        substringAfterExample();
        isBlankExample();
        // TODO: si asa mai departe pentru fiecare metoda

    }

    private static void isEmptyExample() {
        // TODO: insert your code here
    }


    private static void startsWithExample() {
        // TODO: insert your code here
    }

    /*
              Created by vmarian on 22-Apr-19.
             */
    public static void contains() {
        System.out.println("contains()");
        String expresie = "Vrei, nu vrei, bea Gheorghe aghiasma.";
        System.out.println("Stringul initial este : " + expresie);
        System.out.println("Metoda contains \"Vrei, nu vrei\" : " + expresie.contains("Vrei, nu vrei"));
        System.out.println("Metoda contains \"Coniac\" : " + expresie.contains("Coniac"));
    }

    public static void StringBefore() {
        System.out.println("Metoda StringBefore()");
        System.out.println("Stringul initial este: " + "This is my string.");
        System.out.println("Metoda StringBefore \"my\" : " + StringUtils.substringBefore("This is my string", "my"));/** rezultatul este: This is*/
        System.out.println("Metoda StringBefore \"string\" : " + StringUtils.substringBefore("This is my string", "string"));/** rezultatul este: This is my*/
    }

    public static void isNumeric() {
        System.out.println("Metoda isNumeric()");
        System.out.println("Metoda isNumeric 123456789: " + StringUtils.isNumeric("123456789"));
        System.out.println("Metoda isNumeric abv: " + StringUtils.isNumeric("abv"));
    }

    public static void Trim() {
        System.out.println("Metoda Trim: Stringul initial este: \"   trim in java  \"");
        System.out.println( ".." + StringUtils.trim ("   trim in java  ") + "..");
    }

    private static void margaritaq() {
        /*
          Created by Margarita on 16-Apr-19.
         */
        Cat cat = new Cat();
        Cat cat1 = new Cat("Monea", 2);
        String name = cat.getName();
        String name1 = cat1.getName();


        System.out.println("Metoda isEmpty: " + StringUtils.isEmpty(name));
        System.out.println("Metoda startsWith: " + StringUtils.startsWith(name, "C"));
        System.out.println("Metoda Reverse: " + StringUtils.reverse(name1));
        System.out.println("Metoda Capitalize: " + StringUtils.capitalize(name1));
    }

    // Created by Ion
    private static void indexOfExample() {
        System.out.println("indexOf() method example by Ion");
        String s = "IndexOf";
        System.out.println("Index of 'n' in " + s + " : " + StringUtils.indexOf(s, 'n'));
    }

    // Created by Ion
    private static void rotateExample() {
        System.out.println("rotate() method example by Ion");
        String s = "Rotate";
        System.out.println("Original string : " + s);
        System.out.println(s + " : " + StringUtils.rotate(s, 3));
        System.out.println("Original string : " + s);
        System.out.println(s + " : " + StringUtils.rotate(s, 5));
    }

    // Created by Ion
    private static void substringAfterExample() {
        System.out.println("substringAfter() method example by Ion");
        String s = "substringAfter";
        System.out.println("Original string : " + s);
        System.out.println(s + " : " + StringUtils.substring(s, 3));
        System.out.println("Original string : " + s);
        System.out.println(s + " : " + StringUtils.substring(s, 3, 9));
    }

    // Created by Ion
    private static void isBlankExample() {
        System.out.println("isBlankExample() method example by Ion");
        String s = "isBlank?";
        System.out.println("Original string : " + s);
        System.out.println(s + " : " + StringUtils.isBlank(s));
    }

}
