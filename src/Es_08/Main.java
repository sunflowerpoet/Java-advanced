package Es_08;
/*Scrivere una funzione che restituisca un HashSet riempito. Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo,
verificare che l' elemento sia parte del Set e stampare il risultato*/

import java.util.HashSet;

/* Scrivere una funzione che restituisca un HashSet riempito
Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
Verificare che l' elemento sia parte del Set e stampare il risultato */

public class Main {
    public static void main(String[] args) {
        HashSet<Character> charHashSet = createAndPopulateCharHashSet();

        System.out.println("Input HashSet: " + charHashSet);

        char myChar = 'D';

        System.out.println("Check if char " + myChar + " is contained.");

        boolean isContained = isCharContained(charHashSet, myChar);

        System.out.println("HashSet contains character '" + myChar + "': " + isContained);
    }
    public static HashSet<Character> createAndPopulateCharHashSet() {
        HashSet<Character> charHashSet = new HashSet<>();

        charHashSet.add('A');
        charHashSet.add('B');
        charHashSet.add('C');
        charHashSet.add('D');

        return charHashSet;
    }
    public static boolean isCharContained(HashSet<Character> charHashSet, char myChar) {
        return charHashSet.contains(myChar);
    }
}

