package Es_06;

/*Scrivere una funzione che accetti in input 2 int e ne stampi la somma *
Scrivere una funzione che accetti in input 1 char lo stampi *
Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma *
Scrivere una funzione che accetti in input 1 Character lo stampi *
Scrivere un un valore primitivo per int, double e char e fare autoboxing *
Scrivere un oggetto per Integer, Double e Character e fare Unboxing *
Usare le funzioni scritte con i valori creati*/
public class Main {
    public static void main (String[] args) {

        int result = sum(4,5);
        System.out.println("Sum int: " + result);

        char character = printChar('a');
        System.out.println("char: " + character);

        Integer resultInteger = printSumInteger(3,4);
        System.out.println("Sum Integers: " + resultInteger);

        Character character1 = printCharacter('b');
        System.out.println("Character: " + character1);

        primitiveAutoboxing(0, 3.14, 'A');

        Integer integerValue = new Integer(0);
        Double doubleValue = new Double(3.14);
        Character charValue = new Character('A');

        unboxValues(integerValue, doubleValue, charValue);

    }
    public static Integer sum(int a, int b) {
        return a + b;
    }
    public static Character printChar(char c) {
        return c;
    }
    public static int printSumInteger(Integer x, Integer y) {
        return x + y;
    }
    public static char printCharacter(Character c) {
        return c;
    }

    public static void primitiveAutoboxing (int intValue, double doubleValue, char charValue) {
        Integer integerValue = intValue;
        Double doubleObject = doubleValue;
        Character charObject = charValue;

        System.out.println("Primitive int value: " + intValue);
        System.out.println("Autoboxed Integer value: " + integerValue);

        System.out.println("Primitive double value: " + doubleValue);
        System.out.println("Autoboxed Double value: " + doubleObject);

        System.out.println("Primitive char value: " + charValue);
        System.out.println("Autoboxed Character value: " + charObject);
    }
    public static void unboxValues(Integer integerValue, Double doubleValue, Character charValue) {
        int intValue = integerValue.intValue();
        double doublePrimitive = doubleValue.doubleValue();
        char charPrimitive = charValue.charValue();

        System.out.println("Integer object: " + integerValue);
        System.out.println("Unboxed int value: " + intValue);

        System.out.println("Double object: " + doubleValue);
        System.out.println("Unboxed double value: " + doublePrimitive);

        System.out.println("Character object: " + charValue);
        System.out.println("Unboxed char value: " + charPrimitive);
    }
}
