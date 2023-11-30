package Es_11;
/*Creare una classe Student che accenti nel costruttore il parametro name (String e age Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con 12 elementi e stamparlo in console.
mettere in ordine la collezione e stampare il risultato */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Anna", 23);
        System.out.println(student);

        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Alex", 26));
        studentList.add(new Student("Aurora", 22));
        studentList.add(new Student("Martina", 20));
        studentList.add(new Student("Alessandra", 20));
        studentList.add(new Student("Simone", 22));
        studentList.add(new Student("Antonio", 22));
        studentList.add(new Student("Francesca", 20));
        studentList.add(new Student("Alessandro", 20));
        studentList.add(new Student("Alessia", 26));
        studentList.add(new Student("Andrea", 22));
        studentList.add(new Student("Luca", 20));
        studentList.add(new Student("Nicola", 20));

        Collections.sort(studentList, Comparator.comparingInt(Student:: getAge));
        System.out.println("List order by age: " + studentList);
        Collections.sort(studentList, Comparator.comparing(Student:: getName));
        System.out.println("List order by name: " + studentList);
    }
}
