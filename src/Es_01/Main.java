package Es_01;
/*
- Scrivere una funzione che controlli se un numero int è in un determinato range
- Se lo è ritorna true se non lo è lancia un'eccezione
*/
public class Main {
    public static void main(String[] args) {
        int number = 1;

        checkRange(number, 0, 10);
    }
    public static boolean checkRange(int number, int min, int max) throws IllegalArgumentException {
        if (number < min || number > max) {
            throw new IllegalArgumentException("Number not in range.");
        } else {
            StringBuilder result = new StringBuilder("The number ");
            result.append(number);
            result.append(" is in range.");
            System.out.println(result.toString());
        }
        return false;
    }
}





