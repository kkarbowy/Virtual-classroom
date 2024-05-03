package Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Karolina", "Kolorowa", 132142152);
        System.out.println(student1.id);
        System.out.println(student1.name);
        System.out.println(student1.surname);
        System.out.println(student1.phoneNumber);

        Student student2 = new Student(1, "Karolina", "Kolorowa", "madryczlowiek@gmail.com");
        System.out.println(student2.id);
        System.out.println(student2.name);
        System.out.println(student2.surname);
        System.out.println(student2.email);

        System.out.println(student1.czyZdane);
        student1.przepuscStudenta();
        System.out.println(student1.czyZdane);

        student1.zmienEmail("madrakobietka@gmail.com");
        System.out.println(student1.email);

        student1.dodajPrzedmiot("matematyka");
        student1.dodajPrzedmiot("polski");
        System.out.println(student1.przedmioty);
        System.out.println(student2.przedmioty);

        student1.dodajOcene(5.0f);
        System.out.println(student1.oceny);
    }
}