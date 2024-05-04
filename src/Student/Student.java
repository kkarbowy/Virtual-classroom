
package Student;
import java.util.ArrayList;

public class Student {
    //parametry klasy
    private final int id;
    private String name;
    private String surname;
    private int phoneNumber;
    private String email;
    private boolean czyZdane;
    private ArrayList<String> przedmioty = new ArrayList<>();
    private ArrayList<Float> oceny = new ArrayList<>();

    //Gettery i Settery
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public boolean isCzyZdane() {
        return czyZdane;
    }

    public ArrayList<String> getPrzedmioty() {
        return przedmioty;
    }

    public ArrayList<Float> getOceny() {
        return oceny;
    }

    public int getId() {
        return id;
    }

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

    public void czyDostanieStypendium() {
        float sredniaOcen = this.wyliczSredniaOcen();
        if (sredniaOcen >= 4.5) {
            System.out.println("Stypentdium przyznazne ze srednia " + sredniaOcen);
        } else {
            System.out.println("Srednia ocen zbyt niska, by uzyskac stypendium");
        }
    }
    }