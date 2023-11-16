package Es_05;
/*Scrivere una funzione che accetti in input un numeratore e un denominatore
Controlli che il numeratore e il denominatore non siano null
Usare la funzione appena scritta in due blocchi di codice dove si cattura l'eventuale eccezione.*/

public class Main {
    public static void main (String[] args) {

        Double numeratore = Double.valueOf("435");
        Double denominatore = null;

        try {
            System.out.println(function(numeratore, denominatore));
        } catch (ArithmeticException e) {
            System.out.println("Il denominatore e' 0.");
        } catch (Exeption e) {
            System.out.println("Uno dei due valori e' null " + e.getMessage());
        }
        try {
            System.out.println(function(10.0, 0.0));
        }catch (Exeption e) {
            System.out.println("Il denominatore e' " + e.getMessage());
        }
    }
    public static Double function(Double num1, Double num2) throws Exeption {
        if (num1 == null || num2 == null) {
             throw new Exeption();
        } else if (num2 == 0) {
            throw new ArithmeticException();
        }
        else {
            return num1 / num2;
        }
    }
}
