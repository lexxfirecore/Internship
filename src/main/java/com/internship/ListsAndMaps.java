package com.internship;

import com.internship.zoo.Cat;

import java.io.PrintWriter;
import java.util.*;

/**
 * Created by lexx on 03-Apr-19.
 */
public class ListsAndMaps {
    public static void main(String[] args) {
        System.out.println(ListsAndMaps.class.getName() + ": ");

        menu();

    }

    private static void lists_1() {
/**
 * Created by vmarian on 09-Apr-19.
 */
        System.out.println("Creat de VMarian");
        String[] date = {"11", "12", "13", "14", "15"};

        System.out.println("Array unidimensional: " + Arrays.toString(date));
        ArrayList<String> number = new ArrayList<String>();
        for (int i = 0; i < date.length; i++) {
            number.add(date[i]);
        }

        System.out.println("Array list: " + number);

        number.add("2");
        System.out.println("Adaugarea unei valori: " + number);

        number.clone();
        System.out.println("Clonarea:" + number);

        number.remove("12");
        System.out.println("Stergerea cifrei 12:" + number);

        number.iterator();
        System.out.println("Iterarea: " + number);

        Map<Integer, String> map = new TreeMap();
        for (int i = 0; i < date.length; i++) {
            map.put(i, date[i]);
        }

        System.out.println("Printam mapa: " + map);

        map.put(6, (String) "17");
        map.put(9, (String) "19");
        System.out.println("Folosim put: " + map);

        System.out.println("Folosim get: " + map.get(8));

        System.out.println("Folosim keySet: " + map.keySet());
        /*
        La teorie si partea a 2 revin dupa ce creez clasele la zoo
         */
    }

    private static void lists_2() {
        // created by Margarita 06.04.19
        System.out.println("creat de Margarita");

        // cream un Array
        long[] date = {10, 20, 30, 40, 50};
        System.out.println("Continutul vectorului: ");
        for (int i = 0; i < date.length; i++) {
            System.out.print(date[i] + " ");
        }


        // cream un obiect LinkedList
        List<Long> numere = new LinkedList<Long>();

        // populam lista
        for (int i = 0; i < date.length; i++) {
            numere.add(i, date[i]);

        }// printam continutul listei
        System.out.println("\nLista contine: " + numere);

        // adaugam la inceput si la sfirsit un numar
        ((LinkedList<Long>) numere).addFirst(100L);
        ((LinkedList<Long>) numere).addLast(101L);
        System.out.println("Am adaugat primul si ultimul element: " + numere);

        // stergem prima valoare
        ((LinkedList<Long>) numere).removeFirst();
        System.out.println(numere);

        //stergem ultima valoare
        ((LinkedList<Long>) numere).removeLast();
        System.out.println("Am sters primul si ultimul element: " + numere);

        // folosim metode de citire
        System.out.println("Printam primul element: " + ((LinkedList<Long>) numere).getFirst());
        System.out.println("Printam ultimul element: " + ((LinkedList<Long>) numere).getLast());

        // lucru cu interfata map
        Map<Integer, Long> map = new Hashtable<>();


        // metoda put adauga
        for (int i = 0; i < numere.size(); i++) {
            map.put(i, date[i]);
        }
        System.out.println("\nPrintam map: " + map);

        // metoda remove sterge pozitia si continutul
        map.remove(3);
        System.out.println("Am sters al 3 key: " + map);

        //metoda get printeaza continutul in pozitia data
        System.out.println("primul element din map: " + map.get(1));

        //metoda containskey verifica daca exista asa pozitie
        System.out.println("Continutul la key 2: " + map.containsKey(2));

        //metoda keySet printeaza doar nr(cate continuturi sunt)
        System.out.println("Nr de cate continuturi sunt: " + map.keySet());

        // metoda entrySet printeaza nr si continutul
        System.out.println("printam nr si continutul: " + map.entrySet());


        // PARTEA 2
        System.out.println("\nVarianta comuna: ");

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Murca", 2, 3));
        cats.add(new Cat("Marusea", 5, 4));
        cats.add(new Cat("Maleavca", 1, 1));
        System.out.println("Lista pisicilor: ");
        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i).getName() + " " + cats.get(i).getAge() + " " + cats.get(i).getWeight());
        }

        Set<Cat> set = new HashSet<Cat>();
        set.addAll(cats);
        System.out.println("Setul contine: ");
        for (int i = 0; i < set.size(); i++) {
            System.out.println(cats.get(i).getName() + " " + cats.get(i).getAge() + " " + cats.get(i).getWeight());
        }
        System.out.println("Metoda isEmpty: " + set.isEmpty());
        System.out.println("Metoda size: " + set.size());
        System.out.println("Metoda clone: " + ((HashSet<Cat>) set).clone());
        System.out.println("Metoda remove: " + set.remove(cats.get(0)));
        System.out.println("Setul contine: ");
        for (int i = 0; i < set.size(); i++) {
            System.out.println(cats.get(i).getName() + " " + cats.get(i).getAge() + " " + cats.get(i).getWeight());
        }
        Set<Cat> set2 = new HashSet<Cat>();
        set.addAll(cats);
        System.out.println("Metoda clear: ");
        set2.clear();
        System.out.println("Setul contine: " + set2);


        Properties prop = new Properties();
        System.out.println("\nProperties contine: ");
        for (int i = 0; i < set.size(); i++) {
            prop.setProperty(cats.get(i).getName(), String.valueOf(cats.get(i).getAge()));
        }
        System.out.println(prop);
        System.out.println("Metoda getProperties: " + prop.getProperty("Maleavca"));
        System.out.println("Metoda propertyNames: " + prop.propertyNames());
        System.out.println("Metoda setProperty: " + prop.setProperty("Casandra", "1"));
        System.out.println("Metoda list: ");
        PrintWriter writer = new PrintWriter(System.out);
        prop.list(writer);






        /*List<E>- o lista ordinate care accepta accesul indexat. Model redimensionabil linear
        array care poate contine elemente dublicatesi element null.
ArrayList<E>- cea mai buna implementare a List. Are multe metode eficiente suprascrise din
AbstractList. Nu e sincronizat(in ArrayList este responsabilitatea programatorului la sincronizare).
Vector<E>- clasa mostenita, e sincronizat,implementarea din List, contine additional metode
 mostenite.
Stack<E>- e last-in-first-out queue(LIFO). Stack extinde vector si e sincronizat. +5 metode
aditionale: push(E element),pop(),peek(),empty(),search(Object o).
LinkedList<E>-e double-linked list. Implimenteaza List,Queue,Deque poate fi citit din doua parti.

Map<K,V>-colectie de perechi cheie-valoare, fiecare cheie are o singura valoare. Cheie dublicat
 nu se permite, dar se permite valori dublicat. Map utilizeaza orice cheie arbitrara(cum ar fi
 sir sau orice obiect) pentru indexarea si accesarea elementelor.
HashMap<K,V>-implementarea tabelului hash. Metodele din HashMap nu sunt sincronizate.
TreeMap<K,V>- implementeaza tree red-black al interfetei SortedMap<K,V>.
LinkedHashMap<K,V>-tabelul hash cu link-list pentru a facilita inserarea si eliminarea.
HashTable<K,V>-Implimentari retrofitate (JDK1.0) o implimentare de tabela hash sincronizata
care nu permite cheia sau valorile null, cu metode vechi.

*/

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
