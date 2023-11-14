package Es_03;
/*Scrivere una funzione che provi a dividere un numero per 0 e catturi l'eccezione leggendone il messaggio.*/
public class Main {
    public static void main(String[] args) throws Exception {
        divideByZero(10, 0);
    }

    public static boolean divideByZero(int number, int denominator) throws Exception {
        if (denominator != 0) {
            int result = number / denominator;
            throw new IllegalArgumentException("Result.");
        } else {
            StringBuilder result = new StringBuilder("The number ");
            result.append(number);
            result.append(" is not dividable by zero.");
            System.out.println(result.toString());
        }
        return false;
    }
}




