public class Book {
    public String title;
    public String author;
    public int price;
    public int pages;

    public Book(String title, String author, int price, int pages) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.pages = pages;
    }
    void displayInfo() {
        System.out.println("Book: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price + " soms");
        System.out.println("Pages: " + pages);
        System.out.println("--------------");
    }

}
