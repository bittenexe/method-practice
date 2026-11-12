package com.pluralsight;

public class Format {
    public static String formatName(String first, String last) {
        return last + "," + first;
    }

    public static void main(String[] args) {
        System.out.println(formatName("Bob", "Smith"));

        String name = formatName("Alice", "Johnson");
        System.out.println(name);

    }
}
