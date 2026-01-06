package com.tnsif.listdemo;

import java.util.ArrayList;

public class ListAssignment {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();

        name.add("Achu");
        name.add("Ammu");
        name.add("vinnu");
       
        System.out.println("ArrayList: " + name);

        String names = name.get(0);
        System.out.println("Element at index 0: " + names);

        name.set(2, "Rajendran");
        System.out.println("second name: " + name);

        name.remove(0);
        System.out.println("after removal: " + name);

        int size = name.size();
        System.out.println("Size of ArrayList: " + size);
    }
}