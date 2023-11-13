package Es_02;
import java.util.Scanner;
/*
Scrivere una funzione che controlli se un carattere è un numero altrimenti lanciare una eccezione.
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            char character = insertChar(scanner);
            System.out.println("Input char number: " + character);
            System.out.print("Correct input.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
    private static char insertChar(Scanner scanner) {
        System.out.print("Please, insert numeric character: ");
        String input = scanner.nextLine();

        if (input.length() != 1 || !Character.isDigit(input.charAt(0))) {
            throw new IllegalArgumentException("Error, character invalid. Please insert numeric character.");
        }
        return input.charAt(0);
    }
}