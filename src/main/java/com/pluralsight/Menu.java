package com.pluralsight;

public class Menu {
    public static void main() {
        displayMenu();
    }

    public static void displayMenu() {
        String menu = "===Menu===";
        String coffee = "1. Coffee - $3.99";
        String tea = "2. Tea - $2.99";
        String cookie = "3. Cookie - 1.99";

        System.out.println(menu);
        System.out.println(coffee);
        System.out.println(tea);
        System.out.println(cookie);
    }
}
