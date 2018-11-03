package num04;
/*
1. 设计一个Book类，私有成员变量： name（书名），author（作者），publisher（出版社），
并生成相应的get/set方法。
 */
public class Book {
    private String name;
    private String author;
    private String publisher;

    public Book() {
    }

    public Book(String name, String author, String publisher) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
