package Es_01;
import java.util.Scanner;

/*
- Scrivere una funzione che controlli se un numero int è in un determinato range
- Se lo è ritorna true se non lo è lancia un'eccezione
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int number = insertNumber(scanner);
            System.out.println("Input number: " + number);
            System.out.println("Number is in range.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static int insertNumber(Scanner scanner) {
        int number;
        do {
            System.out.print("Insert input number: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Insert valid number.");
                scanner.next();
            }
            number = scanner.nextInt();

            if (number < 0 || number > 10) {
                throw new IllegalArgumentException("Error: number must be within range (0 - 10).");
            }
        } while (number < 0 || number > 10);
        return number;
    }
}
