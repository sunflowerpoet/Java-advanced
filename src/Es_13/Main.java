package Es_13;
/* Creare 3 hashmap con 3 differenti metodi di inizializzazione e stampare il contenuto. */

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("Italy", "Venice");
        capitalCities.put("Russia", "Moscow");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("USA", "Tampa Bay");
        System.out.println(capitalCities);

        HashMap<String, Integer> people = new HashMap<String, Integer>();
        people.put("Anna", 22);
        people.put("Alex", 27);
        people.put("Alessandra", 20);
        for (String i : people.keySet()) {
            System.out.println("Name: " + i + ", age: " + people.get(i));
        }

        Map<Integer, String> map = Map.of(001, "AA", 002, "AB", 003, "AC");
        map.forEach((k, v) -> System.out.println(k + " - " + v));
    }
}
