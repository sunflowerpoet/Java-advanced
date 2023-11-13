package Es_01;
/*
- Scrivere una funzione che controlli se un numero int è in un determinato range
- Se lo è ritorna true se non lo è lancia un'eccezione
*/
public class Main {
    public static void main(String[] args) {
        int number = 2;

        if (checkRange(number, 0, 10)) {
            System.out.println("Il numero è nel range.");
        }
    }
    public static boolean checkRange(int number, int min, int max) throws IllegalArgumentException {
        if (number < min || number > max) {
            throw new IllegalArgumentException("Number not in range.");
        }
        return true;
    }
}





