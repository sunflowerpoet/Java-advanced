package Es_01;
/*
- Scrivere una funzione che controlli se un numero int è in un determinato range
- Se lo è ritorna true se non lo è lancia un'eccezione
*/
public class Main {
    public static void main(String[] args) {
        try {
            System.out.print("Input number: ");
            checkRange(10);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void checkRange(int number) throws Exception {
        if (number < 0 || number > 10) {
            throw new Exception("Error: number not in range.");
        } else {
            System.out.println(number);
            System.out.println("Number within range (0 - 10).");
        }
    }
}
