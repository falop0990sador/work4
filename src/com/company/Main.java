package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
// write your code here
        ArrayList<String> ListA = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <5  ; i++) {
            String world = scanner.nextLine();
            ListA.add(world);
        }
        System.out.println(ListA);
        ArrayList<String> ListB = new ArrayList<>();
        for (int i = 0; i <5  ; i++) {
            String world = scanner.nextLine();
            ListB.add(world);
        }
        System.out.println(ListB);

        ArrayList<String> ListC = new ArrayList<>();
        Collections.reverse(ListB);
        for (int i = 0; i < 5 ; i++) {
            ListC.add(ListB.get(i));
            ListC.add(ListA.get(i));
        }
        System.out.println(ListC);
        ListC.sort(Comparator.comparingInt(String ::length));
        System.out.println(ListC);
        }
    }

