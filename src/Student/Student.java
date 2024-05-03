
package Student;
import java.util.ArrayList;

public class Student {
    //parametry klasy
    final int id;
    String name;
    String surname;
    int phoneNumber;
    String email;
    boolean czyZdane;
    ArrayList<String> przedmioty = new ArrayList<>();
    ArrayList<Float> oceny = new ArrayList<>();

    //konstruktor 1
    public Student(int id, String name, String surname, int phoneNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    //konstruktor 2
    public Student(int id, String name, String surname, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    //metody
    public void przepuscStudenta() {
        this.czyZdane = true;
        System.out.println("Włąśnie zdałeś :)");
    }

    public void zmienEmail(String nowyEmail) {
        this.email = nowyEmail;
        System.out.println("Twój email został zmieniony poprawnie " + this.email);
    }

    public void dodajPrzedmiot(String przedmiot) {
        this.przedmioty.add(przedmiot);
    }

    public void dodajOcene(float ocena) {
        this.oceny.add(ocena);
    }

    public float wyliczSredniaOcen() {
        int iloscOcen = oceny.toArray().length;
        float sumaOcen = 0;
        for (Float ocena : oceny) {
            sumaOcen += ocena;
        }
        float sredniaOcen = sumaOcen / iloscOcen;
        return sredniaOcen;
    }

    /*zostawić pusty argument, ponieważ dostęp do średniej ocen mam w metodzie wyliczSredniaOcen, która
    metodą tej klasy */
    public void czyDostanieStypendium() {
        float sredniaOcen = this.wyliczSredniaOcen();
        if (sredniaOcen >= 4.5) {
            System.out.println("Stypentdium przyznazne ze srednia " + sredniaOcen);
        } else {
            System.out.println("Srednia ocen zbyt niska, by uzyskac stypendium");
        }
    }
    }
