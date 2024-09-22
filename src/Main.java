public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Жамиля", "Ч.Айтматов", 285, 300);
        Book book2 = new Book("Узак жол", "М.элебаев", 355, 565);
        Book book3 = new Book("Ээсине кайткан роза", "Н.Кадырбеков", 400, 656);
        Book book4 = new Book("Гулсары","Ч.Айтматов",300);

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
        book4.displayInfo();

    }
}