package 形参和返回值的练习.demo02;

public class Book {
   private int numBook;
   private String nameBook;
   private double priceBook;

    public int getNumBook() {
        return numBook;
    }

    public void setNumBook(int numBook) {
        this.numBook = numBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public double getPriceBook() {
        return priceBook;
    }

    public void setPriceBook(double priceBook) {
        this.priceBook = priceBook;
    }

    public Book(int numBook, String nameBook, double priceBook) {

        this.numBook = numBook;
        this.nameBook = nameBook;
        this.priceBook = priceBook;
    }

    public Book() {

    }
}
