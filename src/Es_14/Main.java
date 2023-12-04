package Es_14;
/*Creare un hashmap prendere tutti i valori, ordinarli e stamparli*/
import java.util.Map;
import java.util.TreeMap;
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> people = Map.of("Anna", 22, "Alex", 27, "Alessandra", 20, "Nikolay", 21);

        System.out.println("Original values:");
        for (Integer value : people.values()) {
            System.out.println(value);
        }

        Map<String, Integer> sortedMap = new TreeMap<>(people);

        System.out.println("\nSorted values:");
        for (Integer value : sortedMap.values()) {
            System.out.println(value);
        }
    }
}