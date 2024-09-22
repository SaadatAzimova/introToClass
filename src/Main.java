public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Жамиля", "Ч.Айтматов", 285, 300);
        Book book2 = new Book("Узак жол", "М.элебаев", 50);
        Book book3 = new Book("Ээсине кайткан роза",  400);
        Book book4 = new Book();

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
        book4.displayInfo();

        book1.discountPrice(50);
        book1.displayInfo();
        book2.discountPrice(50);
        book2.displayInfo();
        book3.discountPrice(50);
        book3.displayInfo();
        book4.discountPrice(50);
        book4.displayInfo();


    }
}