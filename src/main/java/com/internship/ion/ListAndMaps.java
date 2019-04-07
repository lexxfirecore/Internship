
package com.internship.ion;
/*
   Created by Ion Ghincolov
   05/04/2019
*/

import com.internship.zoo.Animal;

import java.util.*;
import java.util.stream.Collectors;

public class ListAndMaps {

    public static void main(String[] args) {
        //Nu ma intrebati dece numerele sunt in string
        String[] strings = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        List<String> myList = stringsToList(strings);
        myList.add("new number");
        myList.add("odd number");
        printListElem(myList);

        myList.add(1, "333");
        printListElem(myList);

        myList.remove("333");
        printListElem(myList);

        myList.get(2);

        System.out.println(myList.hashCode());

        myList.set(1, "Numar realinii");
        printListElem(myList);

        myList.sort(null);
        printListElem(myList);

        List<String> newList = stringsToList(strings);
        printListElem(newList);
        System.out.println(myList.equals(newList));

        System.out.println(newList.contains("1"));

        newList.addAll(myList);
        printListElem(newList);

        newList.clear();
        printListElem(myList);

        System.out.println(myList.size());

        System.out.println(myList.indexOf("2"));

        Map<Integer, String> mymap = new HashMap<>();
        for (String string : myList){
            mymap.put(myList.indexOf(string), string);
        }

        System.out.println(mymap.values());
      




    }

    public static List<String> stringsToList(String[] strings){
        List<String> arrList = new ArrayList();

        for (String i : strings){
            arrList.add(i);
        }
        return arrList;
    }

    public static void printListElem(List<String> stringsList){
        Iterator<String> stringIterator = stringsList.iterator();
        while (stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }
    }
}
