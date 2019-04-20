package com.internship;

/**
 * Created by lexx on 02-Apr-19.
 */

import org.apache.commons.lang3.StringUtils;

public class ApacheStringUtils {
    public static void main(String[] args) {
        System.out.println(ApacheStringUtils.class.getName() + ": ");

        isEmptyExample();
        startsWithExample();

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

    // Created by Ion
    private static void indexOfExample(){
        System.out.println("indexOf() method example by Ion");
            String s = "IndexOf";
        System.out.println("Index of 'n' in " + s + " : " + StringUtils.indexOf(s, 'n'));
    }
    // Created by Ion
    private static void rotateExample(){
        System.out.println("rotate() method example by Ion");
        String s = "Rotate";
        System.out.println("Original string : " + s);
        System.out.println( s + " : " + StringUtils.rotate(s, 3));
        System.out.println("Original string : " + s);
        System.out.println( s + " : " + StringUtils.rotate(s, 5));
    }
    // Created by Ion
    private static void substringAfterExample(){
        System.out.println("substringAfter() method example by Ion");
        String s = "substringAfter";
        System.out.println("Original string : " + s);
        System.out.println( s + " : " + StringUtils.substring(s, 3));
        System.out.println("Original string : " + s);
        System.out.println( s + " : " + StringUtils.substring(s, 3, 9));
    }
    // Created by Ion
    private static void isBlankExample(){
        System.out.println("isBlankExample() method example by Ion");
        String s = "isBlank?";
        System.out.println("Original string : " + s);
        System.out.println( s + " : " + StringUtils.isBlank(s));

    }

}
