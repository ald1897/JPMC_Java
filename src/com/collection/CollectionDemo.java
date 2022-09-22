package com.collection;

import com.interfaces.Payment;

import java.util.*;

public class CollectionDemo {
    /**
     * 1. mem constraints
     * same types
     * legnth is fixed
     *
     * Types of Collections
     *
     * List
     * shopping cart
     * backpack -> cart
     * laptop -> cart
     * mouse - 2 -> cart
     * view cart order is displayed as added
     * list is displayed as ordered in sequence
     * list will allow duplicates
     *
     * ICs:
     * Arraylist (better in perf, data retrieval)
     * linkedList (faster in perf for high volume of data, when doing lots of insertion or deletion)
     * Stack[FILO] (Browser history)
     * Queue - Printer (first doc in first doc out)
     *
     * Set - Not allowed duplicates orordered and unsorted
     *
     * ICs:
     * Hashset, LinkedHashSet
     * SortedSet extends Set - stores in order -> treeMap
     *
     * Map - key > value pair
     * User1 : 2
     * User2 : 3
     *
     * ICs:
     * HashMap, LinkeedHashMap
     * SortedMap = extends map  sorted on keys
     * duplcaites keys not okay, duplicate values ok
     *
     */
    public static void main(String[] args) {

//        List list = new ArrayList();
//
//        list.add(10);
//        list.add(10.09);
//        list.add(true);
//        list.add("1043524d");
//
//        System.out.println(list);

        //angular brackets or diamond syntax specifies type of list
        /**
         * byte Byte
         * int Integer
         * short Short
         * long Long
         * double Double
         * float Float
         * char Character
         * bool Boolean
         */

//        List<Integer> nos = new ArrayList<>();
//        nos.add(10);
//        nos.add(20);
//
//        for(Integer value : nos) {
//            System.out.println(value+ 10);
//        }
//
////        Set<String> set = new HashSet<>();
//        Set<String> set = new TreeSet<>();
//
//        set.add("Red");
//        set.add("Black");
//        set.add("Pink");
//        set.add("Yellow");
//        set.add("Green");
//        set.add("Blue");
//
//        System.out.println(set);
//
//        Iterator<String> iter = set.iterator();
//        while(iter.hasNext()) {
//            System.out.println(iter.next());
//        }
//
//        Map<String, Integer> map = new HashMap<>();
////        Map<String, Integer> map1 = new <>();
//        map.put("k1",1);
//        map.put("k2",2);
//        map.put("k3",3);
//        map.put("k4",4);
//        map.put("k5",5);
//        map.put("k6",6);
//        System.out.println(map);
//        map.put("k1",10);
//        System.out.println(map);
//        System.out.println(map.get("k1"));
//
//        for(String key : map.keySet()) {
//            System.out.println(key + " : " + map.get(key));
//        }
//        System.out.println(map.putIfAbsent("k10", 100));
//        System.out.println(map.putIfAbsent("k2", 100));
//
//        System.out.println(map);


        // Exercise //
//        List<String> names = Arrays.asList("Alex","Jen","Ella","Alex");
//        Map<String, Integer> namess = new HashMap<>();
//
//        // itereate over the list store the names as keys and the no of occurences as the value
//        for(String name : names) {
//            int i = 1;
//
//            if (namess.containsKey(name)){
//                i++;
//                namess.put(name,i);
//            } else {
//                namess.put(name,i);
//            }
//        }
//        for(String key : namess.keySet()) {
//            System.out.println(key + " : " + namess.get(key));
//        }
//        System.out.println(namess);


    }
}
