package com.internship;

import com.internship.zoo.Cat;
import com.internship.zoo.Duck;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
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
        System.out.println("Setul contine: "+ set2);


        Properties prop = new Properties();
        System.out.println("\nProperties contine: ");
        for (int i = 0; i <set.size() ; i++) {
            prop.setProperty(cats.get(i).getName(),String.valueOf(cats.get(i).getAge()) );
        }
        System.out.println(prop);
        System.out.println("Metoda getProperties: "+prop.getProperty("Maleavca"));
        System.out.println("Metoda propertyNames: "+prop.propertyNames( ));
        System.out.println("Metoda setProperty: "+prop.setProperty("Casandra", "1"));
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
        /*
        Created by Ion Ghincolov 14/04/2019
         */
        System.out.println("Varianta 3 : Ion");
        System.out.println("*************");
        System.out.println("Part 1");



        double[] doubleNums = {23.56, 23123.342, -23452354.342342, -3432.44324, 324.43242};

        List<Double> doubleList = new Vector<>();

        for(int i = 0; i<doubleNums.length; i++){
            doubleList.add(doubleNums[i]);
        }

        System.out.println("Print list : " + doubleList);
        System.out.println("The List size is : " +doubleList.size());
        double d = 23.56;
        System.out.println("The List contains " + d + " : " + doubleList.contains(d));
        doubleList.set(2, 2344234.0);
        System.out.println("Element on index position 2 was changed : " + doubleList);
        System.out.println("Print element on position 2 : " + doubleList.get(2));
        doubleList.remove(4);
        System.out.println("Element on position 4 has been removed : " + doubleList);



        Map<Integer, Double> doubleMap = new HashMap<>();
        for (Double i : doubleList) {
            doubleMap.put(doubleList.indexOf(i), i);
        }

        System.out.println("Map elements : " + doubleMap);
        System.out.println("Entry set of map : " + doubleMap.entrySet());
        System.out.println("Key set of map : " + doubleMap.keySet());
        System.out.println("Map is empty : " + doubleMap.isEmpty());
        System.out.println(doubleMap.hashCode());

        /*
          List<E> - insert, access is performed by  position of the elements in the list. List may contain duplicate elements.
          ArrayList<E> - Resizable-array implementation of the List interface. Implements all optional list operations, and permits all elements, including null.
                         Provides methods to manipulate the size of the array that is used internally to store the list. It is unsynchronized.
                         Offers constant-time positional access and is fast.
          LinkedList<E> - Operations that index into the list will traverse the list from the beginning or the end,
                          whichever is closer to the specified index. Performance is affected.
          Vector<E> -     Grow or shrink size as needed to accommodate adding and removing items after the Vector has been created.



          Map<K, V> - An object that maps keys to values. A map cannot contain duplicate keys; each key can map to at most one value.
          HashMap<K, V> - Permits null values and the null key. It is unsynchronize. This class makes no guarantees as to the order of the map; in particular,
                          it does not guarantee that the order will remain constant over time.
          TreeMap<K, V> - Is sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time, depending on which constructor is used.
          LinkedHashMap<K, V> - This implementation differs from HashMap in that it maintains a doubly-linked list running through all of its entries.
         */

        System.out.println("******************");
        System.out.println("Part 2");
        System.out.println();

        List<Duck> ducks =  new ArrayList<>();

            ducks.add(new Duck("McDuk", 3, 10, 20.0f, true));
            ducks.add(new Duck("McCook", 4, 12, 35.0f, false));
            ducks.add(new Duck("McCuk", 5, 9, 25.0f, true));


         for(Duck duck : ducks) {
             System.out.println(duck.getClass().getSimpleName() + " " +
                     "name is " + duck.getName() + ", " +
                     "age : " + duck.getAge() + ", " +
                     "height :  " + duck.getHeight() + ", " +
                     "weight : " + duck.getWeight() + ", " +
                     "is wild? : " + duck.isWild());
         }

         Set<Duck> duckSet = new HashSet<>();
         for (Duck duck : ducks){
             duckSet.add(duck);
         }

        System.out.println("The size of set : "  + duckSet.size());
        System.out.println("The set contain all elements of ducks list : " + duckSet.containsAll(ducks));
        duckSet.clear();
        System.out.println("Set is empty : " + duckSet.isEmpty());
        duckSet.addAll(ducks);
        for(Duck duck : duckSet) {
            System.out.println(duck.getClass().getSimpleName() + " " +
                    "name is " + duck.getName() + ", " +
                    "age : " + duck.getAge() + ", " +
                    "height :  " + duck.getHeight() + ", " +
                    "weight : " + duck.getWeight() + ", " +
                    "is wild? : " + duck.isWild());
        }

        Properties properties = new Properties();
        for(Duck duck : duckSet){
            properties.setProperty(duck.getName(), String.valueOf(duck.getAge()));
        }
        System.out.println(properties);
        System.out.println("Property of McDuk : "+ properties.getProperty("McDuk"));
        System.out.println(properties.get("McCuk"));
        properties.replace("McCuk", 5);
        properties.setProperty("Maki", "4");
        System.out.println(properties);

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
