package com.internship;

import com.internship.zoo.Cat;
import org.apache.commons.lang.StringUtils;

/**
 * Created by lexx on 02-Apr-19.
 */
public class ApacheStringUtils {
    public static void main(String[] args) {
        System.out.println(ApacheStringUtils.class.getName() + ": ");

        isEmptyExample();
        startsWithExample();
        margaritaq();

        // TODO: si asa mai departe pentru fiecare metoda

    }

    private static void isEmptyExample() {
        // TODO: insert your code here
    }


    private static void startsWithExample() {
        // TODO: insert your code here
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

}
