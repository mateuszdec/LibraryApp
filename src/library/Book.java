package library;

public class Book {
    String title;
    String author;
    int releaseDate;
    int pages;
    String publisher;
    String isbn;

    Book(String bookTitle, String bookAuthor, int bookReleaseDate, int bookPages, String bookPublisher, String bookIsbn) {
        this(bookTitle, bookAuthor, bookReleaseDate, bookPages, bookPublisher);
        isbn = bookIsbn;
    }

    Book(String bookTitle, String bookAuthor, int bookReleaseDate, int bookPages, String bookPublisher) {
        title = bookTitle;
        author = bookAuthor;
        releaseDate = bookReleaseDate;
        pages = bookPages;
        publisher = bookPublisher;
    }

    public void printInfo() {
        String info = title + "; " + author + "; " + releaseDate + "; " + pages + "; " + publisher + "; " + isbn;
        System.out.println(info);
    }
}
