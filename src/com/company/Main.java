package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Green");
        colors.add("Brown");
        colors.add("Blue");
        colors.add("Red");
        for (int i = 0; i < colors.size(); i++) {
            System.out.print(colors.get(i) + "  ");
        }
        System.out.println();
        colors.set(2, "Yellow");
        for (int i = 0; i < colors.size(); i++) {
            System.out.print(colors.get(i) + "  ");
        }
    }
}
