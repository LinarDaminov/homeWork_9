public class Book {
    private String bookName;
    private Author author;
    private int publishYear;

    // Конструктор
    public Book(String bookName, Author author, int publishYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishYear = publishYear;
    }
    // Геттеры
    public String getBookName() {
        return bookName;
    }
    public Author getAuthor() {
        return author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    // сеттер
    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }
}



