public class Main {
    public static void main(String[] args) {
 Author author1 = new Author("Mark", "Twen");
 Book book1 = new Book("Tom Soyer", author1, 2020);

 Author author2 = new Author("Lev", "Tolstoy");
 Book book2 = new Book("Voina i Mir", author2,1930);
 System.out.println("Книга: " + book1.getBookName() + " Автор:"
         + book1.getAuthor().getFirstName() + " " + author1.getLastName() + " год издания: " + book1.getPublishYear());
 System.out.println("Книга: " + book2.getBookName() + " Автор:"
                + book2.getAuthor().getFirstName() + " " + author2.getLastName() + " год издания: " + book2.getPublishYear());
    book1.setPublishYear(2022);
        System.out.println("Переиздание " + book1.getPublishYear());
    }
}