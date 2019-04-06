package com.internship;

import java.util.*;

/**
 * Created by lexx on 03-Apr-19.
 */
public class Lists {
    public static void main(String[] args) {
        System.out.println(Lists.class.getName() + ": ");

        menu();

        lists_1();
        lists_2();
        lists_3();

    }

    private static void lists_1() {

    }

    private static void lists_2() {
        // created by Margarita 06.04.19
        System.out.println("creat de Margarita");
        // cream un Array
        long[] date = {10, 20, 30, 40, 50};
        // cream un obiect LinkedList
        List<Long> numere = new LinkedList<Long>();
        // populam lista
        for (int i = 0; i < date.length; i++) {
            numere.add(i, date[i]);
        }// printam continutul listei
        System.out.println(numere);
        Long bla =new Long(100);
        // adaugam la inceput si la sfirsit un numar
        ((LinkedList<Long>) numere).addFirst(bla);
        ((LinkedList<Long>) numere).addLast(bla);
        System.out.println(numere);
        // stergem prima valoare
        ((LinkedList<Long>) numere).removeFirst();
        System.out.println(numere);
        //stergem ultima valoare
        ((LinkedList<Long>)numere).removeLast();
        System.out.println(numere);
        // folosim metode de citire
        System.out.println(((LinkedList<Long>) numere).getFirst());
        System.out.println( ((LinkedList<Long>) numere).getLast());
        // lucru cu interfata map
        Map<Integer, Long> map = new Hashtable<>();
        // metoda put adauga
        map.put(1, (long) 100);
        map.put(2, (long)90);
        map.put(3, (long)80);
        System.out.println(map);
        // metoda remove sterge pozitia si continutul
        map.remove(3);
        System.out.println(map);
        //metoda get printeaza continutul in pozitia data
        System.out.println(map.get(1));
        //metoda containskey verifica daca exista asa pozitie
        System.out.println(map.containsKey(2));
        //metoda keySet printeaza doar nr(cate continuturi sunt)
        System.out.println(map.keySet());
        // metoda entrySet printeaza nr si continutul
        System.out.println(map.entrySet());




        /*Tipul List (List este o interfata care extinde interfata Collection) defineste
          modelul de date lista, adica un container care contine o secventa de elemente aflate
          într-o anumita ordine;
          lista (list - o secventa de elemente, memorate într-o anumita ordine).
          Tipul Map defineste modelul de date vector asociativ, adica
           un container în care fiecare element contine doua parti asociate (cheie, valoare).
           vectorul asociativ (map – o grupare de elemente, în care fiecare element contine doua
            parti asociate, cheia si valoarea).
            Clasa ArrayList (care este o lista reprezentata printr-un tablou de elemente) si
             clasa LinkedList (care este o lista reprezentata printr-o lista înlantuita de elemente)
              implementeaza interfata List.
              O caracteristica importanta a claselor de colectii îl reprezinta faptul acestea contin
               referinte la Object (orice obie ct poate fi referit printr-o astfel de referinta).
               Acest lucru înseamna ca în aceeasi colectie se pot introduce obiecte de orice clasa
               (dat fiind ca toate clasele sunt derivate din clasa Object) si nu se pot introduce
               date de tipuri primitive (care nu sunt derivate din nici o clasa). Restrictia
               colectiilor de a nu admite date primitive se rezolva utilizând clasele echivalente
               tipurilor primitive (Character, Integer etc).

Acesta caracteristica a containerelor Java (de a stoca referinte de tip Object) are totusi un
 dezavantaj, deoarece, dupa introducerea unui obiect într-o colectie (memorarea referintei
 acestuia într-un element al colectiei) se pierde tipul exact al referintei (care se memoreaza
  ca referinta la Object). Deoarece informatia de tip a referinte i se pierde, trebuie sa fie
   facuta o conversie cast atunci când se utilizeaza elementele din colectie si, daca conversia
    nu se face pentru tipul exact al obiectului, atunci poate sa apara exceptii în timpul executiei.
    Clasa LinkedList modeleaza o lista (secventa de elemente memorate într-o anumita ordine) printr-o
     structura de date de tip lista înlantuita.
     Clasa LinkedList poate fi folosita pentru crearea altor modele de date mai speciale, cum sunt
     stivele (stacks) si cozile (queues).
     Interfata Map:
     n JDK avem doua implementari pentru aceasta interfata:

    HashMap, care stocheaza elementele intr-un tabel hash
    TreeMap, care stocheaza elementele intr-un arbore "red-black"
    diferentile intre list ,set si map
    list poate avea valori dublicate
    set nu se permite sa aiba valori dublicate
    map e bazat pe cheie-valoare adica in pereche
*/
    }

    private static void lists_3() {

    }

    private static void menu() {
        Scanner scanner = new Scanner(System.in);
        int varianta;
        do {
            System.out.println("Introduceti varianta 1-3, sau 0 pentru a iesi din program: ");
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
