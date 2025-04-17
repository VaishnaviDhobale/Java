// Write a Java program that searches for a specific element in an array and prints its index.

import java.util.ArrayList;

public class SearchElement {
    public static void main(String... args) {
        // create array list of Strings
        ArrayList<String> names = new ArrayList<>();

        // Add names
        names.add("Vaishnavi");
        names.add("Pooja");
        names.add("Samruddhi");
        names.add("Sai");

        // element to search
        String element = "Vaishnavi";

        // Search and print index
        System.out.print("Index is: " + names.indexOf(element));
    }
}
