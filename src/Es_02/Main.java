package Es_02;
/*
Scrivere una funzione che controlli se un carattere è un numero altrimenti lanciare una eccezione.
*/
public class Main {
    public static void main(String[] args) throws Exception {
        checkChar('9');
    }
    public static boolean checkChar (char inputChar) throws Exception {
        if (Character.isDigit(inputChar)) {
            StringBuilder result = new StringBuilder("The char ");
            result.append(inputChar);
            result.append(" is a number.");
            System.out.println(result.toString());
        } else {
            throw new Exception();
        }
        return false;
    }
}