package com.mendes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, String> cities = new HashMap<Integer, String>();
        cities.put(1, "Adana");
        cities.put(34, "Istanbul");
        cities.put(21, "Diyarbakır");
        cities.put(6, "AAAAAAA");
        cities.put(12, "Bingöl");
        cities.put(38, "Kayseri");
        cities.put(6, "Ankara");
        cities.put(41, "Kocaeli");

        System.out.println("search keys with foreach:");
        for (Integer keys : cities.keySet()) {
            System.out.println("keys: " + keys);
        }

        System.out.println("\nsearch values with foreach:");
        for (String values : cities.values()) {
            System.out.println("values: " + values);
        }

        System.out.println("\nsearch keys and values with foreach:");
        for (Map.Entry<Integer, String> keyAndValue : cities.entrySet()) {
            System.out.println("keyAndValue: " + keyAndValue);
        }

        System.out.println("\nsearch keys with iterator:");
        Iterator iterator = cities.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();
        System.out.println("All cities: " + cities);
        System.out.println("get twelveth key: " + cities.get(12));
        System.out.println("is there sixth key: " + cities.containsKey(6));
        System.out.println("is there Bursa value: " + cities.containsValue("Bursa"));
        System.out.println("isempty: " + cities.isEmpty());
        System.out.println("cities size: " + cities.size());
        System.out.println("delete city: " + cities.remove(41));

        System.out.println();
        HashMap<Integer, String> backupCities = new HashMap<Integer, String>();
        backupCities.putAll(cities);
        backupCities.put(41, "Kocaeli");
        System.out.println("backup cities: " + backupCities);
        System.out.println("backup cities size: " + backupCities.size());
        backupCities.clear();
        System.out.println("after clear: " + backupCities);
        System.out.println("after clear size: " + backupCities.size());
    }
}