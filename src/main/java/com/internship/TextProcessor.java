package com.internship;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import javax.print.DocFlavor;
import java.util.*;

/**
 * Created by lexx on 08-Apr-19.
 */
public class TextProcessor {
    public static void main(String[] args) {
        System.out.println(TextProcessor.class.getName() + ": ");

        menu();

    }

    private static void textProcessor_1() {

    }

    private static void textProcessor_2() {
        /*
          Created by Margarita on 18-Apr-19.
         */
        System.out.println("Creat de Margarita");

        String txt = "\nMaine merg cu Andu in parc si sa imi iau cu mine: Telefonul," +
                " Geaca, 50 lei si o sticla cu apa? Da, ar fi bine insa daca va ploua?" +
                " Trebuie sa imi iau si o umbrela! Dar vom vedea maine. ";
        System.out.println("Textul este: " + txt);

        // prelucrarea textului pn a numara chite semne de punctuatie contine textul.
        char[] arayCaractere = txt.toCharArray();
        int nrDePunctuatii = 0;
        //numaram nr de semne de punctuatie si le scoatem din text
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arayCaractere.length; i++) {
            switch (arayCaractere[i]) {
                case ':':
                case '.':
                case ',':
                case '?':
                case '!':
                    nrDePunctuatii = nrDePunctuatii + 1;
                    break;
                default:
                    sb.append(arayCaractere[i]);
            }

        }
        System.out.println("Textul fara semne de punctuatie: " + sb);
        System.out.println("Numarul total de aparitii a semnelor de punctuatie este: " + nrDePunctuatii);

        // prelucram textul pn a numara de cate ori se intilneste in text un cuvint introdus de la tastatura
        Scanner scanner = new Scanner(System.in);
        String cuvint;
        System.out.println("Introduceti va rog cuvintul:");
        cuvint = scanner.next();
        String[] textFaraSemneDePunctuatie = sb.toString().split(" ");
        int nrDeCuvinte = 0;
        for (String s : textFaraSemneDePunctuatie) {

            if (s.equalsIgnoreCase(cuvint)) {
                nrDeCuvinte = nrDeCuvinte + 1;
            }
        }
        System.out.println("\nNumarul de aparitii a cuvintului introdus de la tastatura este: " + nrDeCuvinte);
    }

    private static void textProcessor_3() {
          /*
          Created by Ion on 20-Apr-19.
         */
        System.out.println("Created by Ion");
        String txt = "Finnaly i have 4 days off, after fuk'ng 3.5 months of fuk'ng hard work without any breaks. " +
                "\n To be honest after this i want to spend my time in bed, 24 hours each day in bed, full relax. " +
                "\n Enjoy man, enjoy.";
        System.out.println("Text : " + txt);

        //Calculation of uppercase letters amount
        int numOfupperCaseChars = 0;

        for (int i = 0; i < txt.length(); i++) {
            if (Character.isUpperCase(txt.charAt(i))) {
                numOfupperCaseChars = numOfupperCaseChars + 1;
            }
        }

        System.out.println("Numbers of upperCase chars in text : " + numOfupperCaseChars);

        String[] stringArr = txt.split(" ");
        List<String> strings = new ArrayList<>();

        for (int i = 0; i < stringArr.length; i++) {
            // cum sa scurtez tot cirnatu ista? fara a aplica switch
            if (stringArr[i].endsWith(".") ||
                    stringArr[i].endsWith(",") ||
                    stringArr[i].endsWith(":") ||
                    stringArr[i].endsWith("?") ||
                    stringArr[i].endsWith("!") ||
                    stringArr[i].endsWith(";"))
            {
                strings.add(stringArr[i].substring(0, stringArr[i].length() - 1));
                strings.add(stringArr[i].substring(stringArr[i].length() - 1));
            } else {
                strings.add(stringArr[i]);
            }
        }

        // Calculation of numbers's number (not digits)
        int numOfNums = 0;
        for (String s : strings) {
            if (NumberUtils.isParsable(s)) {
                numOfNums = numOfNums + 1;
            }
        }
        System.out.println("Number of numbers in text : " + numOfNums);


        // Reversing the word
        System.out.println("Input the word what you want to revers here and press enter:");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).equalsIgnoreCase(word)) {
                //i need new StringBuilder for use reverse() method
                strings.set(i, new StringBuilder(strings.get(i)).reverse().toString());
            }
        }

        //I used the StringBuilder to rebuild the txt string after changing
        StringBuilder txt_revert = new StringBuilder();
        //How this loop can be changed with iterator implementation
        for(int i = 0; i<strings.size(); i++){
            if(i  == strings.size()-1){
                txt_revert.append(strings.get(i));
                break;
            }
            if(strings.get(i+1).equals(".") ||
                    strings.get(i+1).equals(",") ||
                    strings.get(i+1).equals("?") ||
                    strings.get(i+1).equals("!") ||
                    strings.get(i+1).equals(";"))
            {
                txt_revert.append(strings.get(i));
            }else{
                txt_revert.append(strings.get(i)+" ");
            }
        }

        System.out.println("Revert : " + txt_revert);

    }

    private static void menu() {
        Scanner scanner = new Scanner(System.in);
        int varianta;
        do {
            System.out.println("\nIntroduceti varianta 1-3, sau 0 pentru a iesi din program: ");
            varianta = scanner.nextInt();
            switch (varianta) {
                case 1:
                    textProcessor_1();
                    break;
                case 2:
                    textProcessor_2();
                    break;
                case 3:
                    textProcessor_3();
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
