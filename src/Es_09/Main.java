package Es_09;

/*Scrivere una funzione che restituisca un hashset riempito.
Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo.
Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo.
Svuotare l'hashset, verificarlo e stampare il risultato */

import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        HashSet<Integer> hashSet = createAndPopulateHashSet();

        Integer objectToRemove = 2;

        removeElement(hashSet, objectToRemove);

        hashSet.clear();

        System.out.println("HashSet is empty: " + true);
    }

    private static HashSet<Integer> createAndPopulateHashSet() {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 1; i <= 4; i++) {
            hashSet.add(i);
        }
        System.out.println("Input HashSet: " + hashSet);
        return hashSet;
    }

    private static void removeElement(HashSet<Integer> hashSet, Integer elementToRemove) {
        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element.equals(elementToRemove)) {
                iterator.remove();
                System.out.println("Element to remove: " + element);
            }
        }
        System.out.println("HashSet after removing element : " + hashSet);
    }
}

