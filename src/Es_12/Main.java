package Es_12;
/*Creare una classe Fruit che accenti nel costruttore il parametro name (String)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un LinkedList con elementi e stamparlo in console.
Aggiungere un elemento al primo posto della lista e uno all'ultimo
Stampare la collezione aggiornata*/
import Es_11.Student;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Fruit> fruitSalad = new LinkedList<Fruit>();
        fruitSalad.add(new Fruit("apple"));
        fruitSalad.add(new Fruit("pear"));
        fruitSalad.add(new Fruit("orange"));
        fruitSalad.add(new Fruit("banana"));

        System.out.println("Fruit salad ingredients: " + fruitSalad);

        fruitSalad.addFirst(new Fruit("blueberry"));
        fruitSalad.addLast(new Fruit("lemon"));

        System.out.println("UPDATED Fruit salad ingredients: " + fruitSalad);


    }
}
