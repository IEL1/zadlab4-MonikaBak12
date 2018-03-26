package pl.edu.ur.polab4;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 4, 5
       /* Student student1 = new Student("Jan","Kowalski", 162345, "informatyka"," 1 rok");
        Student student2 = new Student("Anna","Nowak", 165221);
        Student student3 = new Student("Krzysztof","Nowakowski");
        Student student4 = new Student("Katarzyna","Kot","2 rok");
        
        student1.pokazeDane();
        student2.pokazeDane();
        student3.pokazeDane();
        student4.pokazeDane();
*/
    Scanner wczytaj = new Scanner(System.in);

        System.out.print("Podaj imię: ");
        String imię = wczytaj.nextLine();

        System.out.print("Podaj nazwisko: ");
        String nazwisko = wczytaj.nextLine();

        System.out.print("Podaj numer albumu: ");
        int nr_albumu = wczytaj.nextInt();

        System.out.print("Podaj nazwę specjalności: ");
        String nazwa_specjalnosci = wczytaj.next();

        System.out.print("Podaj rok studiów: ");
        int rok_studiów = wczytaj.nextInt();
        
        Student student1 = new Student(imię, nazwisko, nr_albumu, nazwa_specjalnosci, rok_studiów);
        System.out.println("----------------------");
        student1.pokazDane();
    }
}