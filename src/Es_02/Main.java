package Es_02;
/*
Scrivere una funzione che controlli se un carattere è un numero altrimenti lanciare una eccezione.
*/
public class Main {
    public static void main(String[] args) throws Exception {
        char inputChar = '1';
        if (checkChar(inputChar)) {
            System.out.println("Char is a digit.");
        }
    }
    public static boolean checkChar (char inputChar) throws Exception {
        if (Character.isDigit(inputChar)) {
            System.out.println("Character is a digit.");
        } else {
            throw new Exception();
        }
        return false;
    }
}