package homeWork_10;

public class MethodsOfObjects {
    public static void main(String[] args) {
        Author IvanKrylov = new Author("Иван", "Крылов");
        Author NicolayGogol = new Author("Николай", "Гоголь");

        Book Basny = new Book("Басни", IvanKrylov, 1980);
        Book Mziri = new Book("Мцыри", NicolayGogol, 1990);
        System.out.println("Книга:" + Basny.getBookName() + " Автор:" + Basny.getAuthor().getFirstName() + " "
                +  Basny.getAuthor().getLastName() + " Год издания:" + Basny.getPublishYear());
        System.out.println("Книга:" + Mziri.getBookName() + " Автор:" + Mziri.getAuthor().getFirstName() + " "
                +  Mziri.getAuthor().getLastName() + " Год издания:" + Mziri.getPublishYear());
        System.out.println(Basny);
        System.out.println(Mziri);
    }

    }

