package Student;

public class Main {
    public static void main(String[] args) {
        //stworzenie 1 studenta i wyświetlenie kilku parametrów
        Student student1 = new Student(1, "Karolina", "Nowak", 132142152);
        System.out.println(student1.getId());
        System.out.println(student1.getName());
        System.out.println(student1.getSurname());
        System.out.println(student1.getPhoneNumber());

        //stworzenie 2 studenta i wyświetlenie kilku parametrów
        Student student2 = new Student(2, "Laura", "Kowalska", "testmail1@gmail.com");
        System.out.println(student2.getId());
        System.out.println(student2.getName());
        System.out.println(student2.getSurname());
        System.out.println(student2.getEmail());

        //ustawienie parametru czyZdane na "true"
        System.out.println(student1.isCzyZdane());
        student1.przepuscStudenta();
        System.out.println(student1.isCzyZdane());

        //zmiana maila
        student1.zmienEmail("testmail2@gmail.com");
        System.out.println(student1.getEmail());

        //dodanie przedmiotów do studenta 1
        //tablica przedmiotów
        String[] przedmiotyDoWpisania = {"matematyka", "polski", "fizyka", "geografia"};
        for (String wpisanyPrzedmiot : przedmiotyDoWpisania) {
            student1.dodajPrzedmiot(wpisanyPrzedmiot);
        }
        System.out.println(student1.getPrzedmioty());

        //dodanie ocen do studenta 1
        //tablica ocen
        Float[] ocenyDoWpisania = {5.0f, 4.0f, 5.0f, 3.0f, 4.5f, 5.0f, 5.0f};
        for (float wpisanaOcena : ocenyDoWpisania) {
            student1.dodajOcene(wpisanaOcena);
        }
        System.out.println(student1.getOceny());

        //sprawdzenie czy student 1 otrzyma stypendium
        float sredniaStudenta1 = student1.wyliczSredniaOcen();
        System.out.println("Srednia ocen Studenta1 " + sredniaStudenta1);
        student1.czyDostanieStypendium();
    }
}