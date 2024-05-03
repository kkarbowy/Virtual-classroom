
package Student;
import java.util.ArrayList;

public class Student {
    final int id;
    String name;
    String surname;
    int phoneNumber;
    String email;
    boolean czyZdane;
    ArrayList<String> przedmioty = new ArrayList<>();
    ArrayList<Float> oceny = new ArrayList<>();

    public Student(int id, String name, String surname, int phoneNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    public Student(int id, String name, String surname, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
    }
    public void przepuscStudenta(){
        this.czyZdane=true;
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
}
