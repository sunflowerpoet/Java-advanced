package Es_04;
/*Scrivere una funzione che accetti un array in input e provi a dividere un numero dell'array per 0 e gestista sia
l'eccezione della divisione che quella di indice non presente nell'array, leggendone il messaggio.
Eseguire sempre un blocco di codice scrivendo un messaggio in console.*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci la lunghezza dell'array: ");
        int length = scanner.nextInt();

        int[] array = new int[length];

        System.out.println("Inserisci gli elementi dell'array:");
        for (int i = 0; i < length; i++) {
            System.out.print("Elemento " + i + ": ");
            array[i] = scanner.nextInt();
        }
        scanner.close();

        try {
            processArray(array, 2);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Errore: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
    public static boolean processArray(int[] array, int index) {
        if (array[index] != 0) {
            int result = array[index] / 0;
            System.out.println("Risultato operazione: " + result);
        } else {
            throw new ArithmeticException("Divisione per zero");
        }
        return true;
    }
}

