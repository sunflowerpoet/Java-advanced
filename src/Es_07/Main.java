package Es_07;

/* Scrivere una funzione che restituisca un hashset riempito. Leggere l'hashSet e stampre grandezza ed elementi */

import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = createAndPopulateHashSet();

        System.out.println("Input HashSet" + myHashSet);

        System.out.println("HashSet size: " + myHashSet.size());

        System.out.println("HashSet elements: " + elementsAsString(myHashSet));
    }
    public static HashSet<Integer> createAndPopulateHashSet() {
        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);

        return hashSet;
    }
    private static String elementsAsString(HashSet<Integer> hashSet) {
        StringBuilder result = new StringBuilder();

        for (Integer elemento : hashSet) {
            result.append(elemento).append(" ");
        }

        if (!hashSet.isEmpty()) {
            result.deleteCharAt(result.length() - 1);
        }
        return result.toString();
    }
}

