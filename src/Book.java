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
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public Book(String title,  int price) {
        this.title = title;
        this.price = price;
    }
    public Book() {
        this.title = "";
        this.author = "";
        this.price = 0;
        this.pages = 0;
    }
    void displayInfo() {
        System.out.println("Book: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price + " soms");
        System.out.println("Pages: " + pages);
        System.out.println("--------------");
    }

    void discountPrice(int discount) {
        if (discount > 0 && discount < price) {
            price -= discount;
            System.out.println("Discount:" + discount + "soms");
        } else {
            System.out.println("no discount");
        }
    }

}
