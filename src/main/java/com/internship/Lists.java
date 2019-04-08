package com.internship;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by lexx on 03-Apr-19.
 */
public class Lists {
    public static void main(String[] args) {
        System.out.println(Lists.class.getName() + ": ");

        menu();

    }

    private static void lists_1() {

    }

    private static void lists_2() {
/**
 * Created by vmarian on 08-Apr-19.
 */
            String[] date = {"11", "12", "13","14", "15"};
            ArrayList<String> number = new ArrayList<String>();
            for (int i = 0; i < date.length; i++) {
                number.add(date[i]);

                System.out.println(number);
                String str = new String("2");
                ((ArrayList<String>)number).add(str);
                System.out.println(number);
                Map<Integer, String> map = new TreeMap<>();
                map.put(1, (String) "17");
                map.put(3, (String) "19");
                System.out.println(map);
                System.out.println(map.get(22));
                System.out.println(((TreeMap<Integer, String>) map).clone());
            }
    }



    private static void lists_3() {

    }

    private static void menu() {
        Scanner scanner = new Scanner(System.in);
        int varianta;
        do {
            System.out.println("\nIntroduceti varianta 1-3, sau 0 pentru a iesi din program: ");
            varianta = scanner.nextInt();
            switch (varianta) {
                case 1:
                    lists_1();
                    break;
                case 2:
                    lists_2();
                    break;
                case 3:
                    lists_3();
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
