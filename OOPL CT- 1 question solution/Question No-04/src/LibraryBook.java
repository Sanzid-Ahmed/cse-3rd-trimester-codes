public class LibraryBook {
    String bookName;
    String author;
    int publicationYear;

    public LibraryBook(String bookName, String author, int publicationYear){
        this.bookName = bookName;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getDetails(){
        return "Book name: " + bookName + ", Author: " + author + ", Published: " + publicationYear;
    }

    public void updateDetails(String bookName, String author, int publicationYear){
        this.bookName = bookName;
        this.author = author;
        this.publicationYear = publicationYear;
    }
}
