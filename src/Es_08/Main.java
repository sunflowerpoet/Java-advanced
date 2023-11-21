package Es_08;
/*Scrivere una funzione che restituisca un HashSet riempito. Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo,
verificare che l' elemento sia parte del Set e stampare il risultato*/

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Character> charHashSet = createAndPopulateCharHashSet();

        char myChar = 'D';

        boolean isContained = isCharContained(charHashSet, myChar);

        System.out.println("L'HashSet contiene il carattere '" + myChar + "': " + isContained);
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

