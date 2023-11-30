package Es_10;
/*Creare una classe Student che accenti nel costruttore il parametro name (String e age Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con n elementi e stamparlo in console.
Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console.*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Anna", 22));

        System.out.println("List of students: " + list);

        list.add(new Student("Alex", 26));
        list.add(new Student("Aurora", 22));
        list.add(new Student("Martina", 20));
        list.add(new Student("Alessandra", 20));

        System.out.println("Updated list of students: " + list);

        System.out.println("Size of array list: " + list.size());

    }
}
