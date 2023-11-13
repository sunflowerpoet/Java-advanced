package Es_02;
/*
Scrivere una funzione che controlli se un carattere è un numero altrimenti lanciare una eccezione.
*/
public class Main {
    public static void main(String[] args) {
        char inputChar = 'f';
        try {
            checkChar(inputChar);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void checkChar (char inputChar) throws Exception {
        if (Character.isDigit(inputChar)) {
            System.out.println("Character is a digit.");
        } else {
            throw new Exception();
        }

    }
}